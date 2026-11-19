.class public final Landroidx/compose/material/icons/outlined/BugReportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBugReport(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BugReport"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 424
    .line 425
    const/high16 v2, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40400000    # 3.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x4270a3d7    # -0.07f

    .line 436
    .line 437
    .line 438
    const v18, 0x3f333333    # 0.7f

    .line 439
    .line 440
    .line 441
    const v14, 0x3e6147ae    # 0.22f

    .line 442
    .line 443
    .line 444
    const v15, -0x430a3d71    # -0.03f

    .line 445
    .line 446
    .line 447
    const v16, 0x3ef0a3d7    # 0.47f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, -0x42333333    # -0.1f

    .line 454
    .line 455
    .line 456
    const v2, 0x3f266666    # 0.65f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, -0x41428f5c    # -0.37f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, -0x3fa28f5c    # -3.46f

    .line 469
    .line 470
    .line 471
    const/high16 v18, 0x40000000    # 2.0f

    .line 472
    .line 473
    const v13, -0x40c7ae14    # -0.72f

    .line 474
    .line 475
    .line 476
    const v14, 0x3f9eb852    # 1.24f

    .line 477
    .line 478
    .line 479
    const v15, -0x3ffd70a4    # -2.04f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x40000000    # 2.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x40bae148    # -0.77f

    .line 488
    .line 489
    .line 490
    const v2, -0x3fa28f5c    # -3.46f

    .line 491
    .line 492
    .line 493
    const/high16 v4, -0x40000000    # -2.0f

    .line 494
    .line 495
    const v6, -0x3fd0a3d7    # -2.74f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, -0x40dc28f6    # -0.64f

    .line 502
    .line 503
    .line 504
    const v2, -0x41428f5c    # -0.37f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, -0x42333333    # -0.1f

    .line 511
    .line 512
    .line 513
    const v2, -0x40d9999a    # -0.65f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x41000000    # 8.0f

    .line 520
    .line 521
    const/high16 v18, 0x41700000    # 15.0f

    .line 522
    .line 523
    const v13, 0x41007ae1    # 8.03f

    .line 524
    .line 525
    .line 526
    const v14, 0x4177ae14    # 15.48f

    .line 527
    .line 528
    .line 529
    const/high16 v15, 0x41000000    # 8.0f

    .line 530
    .line 531
    const v16, 0x4173ae14    # 15.23f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, -0x3f800000    # -4.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x3d8f5c29    # 0.07f

    .line 543
    .line 544
    .line 545
    const v18, -0x40cccccd    # -0.7f

    .line 546
    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const v14, -0x41947ae1    # -0.23f

    .line 550
    .line 551
    .line 552
    const v15, 0x3cf5c28f    # 0.03f

    .line 553
    .line 554
    .line 555
    const v16, -0x410a3d71    # -0.48f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3dcccccd    # 0.1f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x3ebd70a4    # 0.37f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x3f9ae148    # 1.21f

    .line 574
    .line 575
    .line 576
    const v18, -0x405851ec    # -1.31f

    .line 577
    .line 578
    .line 579
    const v13, 0x3e99999a    # 0.3f

    .line 580
    .line 581
    .line 582
    const v14, -0x40fae148    # -0.52f

    .line 583
    .line 584
    .line 585
    const v15, 0x3f3851ec    # 0.72f

    .line 586
    .line 587
    .line 588
    const v16, -0x4087ae14    # -0.97f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x3f11eb85    # 0.57f

    .line 595
    .line 596
    .line 597
    const v2, -0x413851ec    # -0.39f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x3f3d70a4    # 0.74f

    .line 604
    .line 605
    .line 606
    const v2, -0x41c7ae14    # -0.18f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x3f70a3d7    # 0.94f

    .line 613
    .line 614
    .line 615
    const v18, -0x420a3d71    # -0.12f

    .line 616
    .line 617
    .line 618
    const v13, 0x3e9eb852    # 0.31f

    .line 619
    .line 620
    .line 621
    const v14, -0x425c28f6    # -0.08f

    .line 622
    .line 623
    .line 624
    const v15, 0x3f2147ae    # 0.63f

    .line 625
    .line 626
    .line 627
    const v16, -0x420a3d71    # -0.12f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v17, 0x3f733333    # 0.95f

    .line 634
    .line 635
    .line 636
    const v18, 0x3df5c28f    # 0.12f

    .line 637
    .line 638
    .line 639
    const v13, 0x3ea3d70a    # 0.32f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const v16, 0x3d23d70a    # 0.04f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x3f2e147b    # 0.68f

    .line 650
    .line 651
    .line 652
    const v2, 0x3e23d70a    # 0.16f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3f1c28f6    # 0.61f

    .line 659
    .line 660
    .line 661
    const v2, 0x3ed70a3d    # 0.42f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3f9ae148    # 1.21f

    .line 668
    .line 669
    .line 670
    const v18, 0x3fa7ae14    # 1.31f

    .line 671
    .line 672
    .line 673
    const/high16 v13, 0x3f000000    # 0.5f

    .line 674
    .line 675
    const v14, 0x3eae147b    # 0.34f

    .line 676
    .line 677
    .line 678
    const v15, 0x3f68f5c3    # 0.91f

    .line 679
    .line 680
    .line 681
    const v16, 0x3f47ae14    # 0.78f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x3ec28f5c    # 0.38f

    .line 688
    .line 689
    .line 690
    const v2, 0x3f266666    # 0.65f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v0, 0x3dcccccd    # 0.1f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, 0x3d8f5c29    # 0.07f

    .line 703
    .line 704
    .line 705
    const v18, 0x3f30a3d7    # 0.69f

    .line 706
    .line 707
    .line 708
    const v13, 0x3d23d70a    # 0.04f

    .line 709
    .line 710
    .line 711
    const v14, 0x3e6147ae    # 0.22f

    .line 712
    .line 713
    .line 714
    const v15, 0x3d8f5c29    # 0.07f

    .line 715
    .line 716
    .line 717
    const v16, 0x3ef0a3d7    # 0.47f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v0, 0x3f800000    # 1.0f

    .line 724
    .line 725
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x41600000    # 14.0f

    .line 732
    .line 733
    const/high16 v2, 0x41200000    # 10.0f

    .line 734
    .line 735
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v0, 0x40800000    # 4.0f

    .line 739
    .line 740
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, 0x40000000    # 2.0f

    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, -0x3f800000    # -4.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x41200000    # 10.0f

    .line 757
    .line 758
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, 0x40800000    # 4.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v0, 0x40000000    # 2.0f

    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v0, -0x3f800000    # -4.0f

    .line 772
    .line 773
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    const/16 v16, 0x3800

    .line 784
    .line 785
    const/16 v17, 0x0

    .line 786
    .line 787
    const/high16 v6, 0x3f800000    # 1.0f

    .line 788
    .line 789
    const/high16 v8, 0x3f800000    # 1.0f

    .line 790
    .line 791
    const/4 v7, 0x0

    .line 792
    const/high16 v9, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/high16 v12, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/4 v13, 0x0

    .line 797
    const/4 v14, 0x0

    .line 798
    const/4 v15, 0x0

    .line 799
    const-string v4, ""

    .line 800
    .line 801
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    sput-object v0, Landroidx/compose/material/icons/outlined/BugReportKt;->_bugReport:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 810
    .line 811
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    return-object v0
.end method
