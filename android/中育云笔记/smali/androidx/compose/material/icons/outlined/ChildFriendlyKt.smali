.class public final Landroidx/compose/material/icons/outlined/ChildFriendlyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChildFriendly(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ChildFriendlyKt;->_childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ChildFriendly"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v17, -0x3f000000    # -8.0f

    .line 86
    .line 87
    const/high16 v18, -0x3f000000    # -8.0f

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x3f728f5c    # -4.42f

    .line 91
    .line 92
    .line 93
    const v15, -0x3f9ae148    # -3.58f

    .line 94
    .line 95
    .line 96
    const/high16 v16, -0x3f000000    # -8.0f

    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41700000    # 15.0f

    .line 105
    .line 106
    const/high16 v2, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x408ae148    # 4.34f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41700000    # 15.0f

    .line 115
    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x406a3d71    # 3.66f

    .line 120
    .line 121
    .line 122
    const v18, 0x406a3d71    # 3.66f

    .line 123
    .line 124
    .line 125
    const v13, 0x3fd9999a    # 1.7f

    .line 126
    .line 127
    .line 128
    const v14, 0x3f19999a    # 0.6f

    .line 129
    .line 130
    .line 131
    const v15, 0x40433333    # 3.05f

    .line 132
    .line 133
    .line 134
    const v16, 0x3ff9999a    # 1.95f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41700000    # 15.0f

    .line 141
    .line 142
    const/high16 v2, 0x41000000    # 8.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x41300000    # 11.0f

    .line 151
    .line 152
    const v2, 0x40ce147b    # 6.44f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x408ccccd    # -0.95f

    .line 159
    .line 160
    .line 161
    const/high16 v2, -0x40000000    # -2.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41100000    # 9.0f

    .line 167
    .line 168
    const/high16 v2, 0x40000000    # 2.0f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x400e147b    # 2.22f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x4007ae14    # 2.12f

    .line 185
    .line 186
    .line 187
    const v2, 0x408d70a4    # 4.42f

    .line 188
    .line 189
    .line 190
    const v4, 0x3ff1eb85    # 1.89f

    .line 191
    .line 192
    .line 193
    const v6, 0x40823d71    # 4.07f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, -0x40147ae1    # -1.84f

    .line 200
    .line 201
    .line 202
    const v18, 0x40451eb8    # 3.08f

    .line 203
    .line 204
    .line 205
    const v13, -0x40733333    # -1.1f

    .line 206
    .line 207
    .line 208
    const v14, 0x3f170a3d    # 0.59f

    .line 209
    .line 210
    .line 211
    const v15, -0x40147ae1    # -1.84f

    .line 212
    .line 213
    .line 214
    const/high16 v16, 0x3fe00000    # 1.75f

    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x41000000    # 8.0f

    .line 220
    .line 221
    const/high16 v18, 0x41b00000    # 22.0f

    .line 222
    .line 223
    const/high16 v13, 0x40900000    # 4.5f

    .line 224
    .line 225
    const v14, 0x41a370a4    # 20.43f

    .line 226
    .line 227
    .line 228
    const v15, 0x40c23d71    # 6.07f

    .line 229
    .line 230
    .line 231
    const/high16 v16, 0x41b00000    # 22.0f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x405d70a4    # 3.46f

    .line 237
    .line 238
    .line 239
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 240
    .line 241
    const v13, 0x3fe147ae    # 1.76f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x404e147b    # 3.22f

    .line 246
    .line 247
    .line 248
    const v16, -0x4059999a    # -1.3f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x40051eb8    # 2.08f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v18, 0x40400000    # 3.0f

    .line 261
    .line 262
    const v13, 0x3e75c28f    # 0.24f

    .line 263
    .line 264
    .line 265
    const v14, 0x3fd9999a    # 1.7f

    .line 266
    .line 267
    .line 268
    const v15, 0x3fd9999a    # 1.7f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x40400000    # 3.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x40600000    # 3.5f

    .line 277
    .line 278
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 279
    .line 280
    const v13, 0x3ff70a3d    # 1.93f

    .line 281
    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const/high16 v15, 0x40600000    # 3.5f

    .line 285
    .line 286
    const v16, -0x40370a3d    # -1.57f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x4068f5c3    # -1.18f

    .line 293
    .line 294
    .line 295
    const v18, -0x3fd8f5c3    # -2.61f

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const v14, -0x407ae148    # -1.04f

    .line 300
    .line 301
    .line 302
    const v15, -0x41147ae1    # -0.46f

    .line 303
    .line 304
    .line 305
    const v16, -0x4003d70a    # -1.97f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x41a80000    # 21.0f

    .line 312
    .line 313
    const/high16 v18, 0x41300000    # 11.0f

    .line 314
    .line 315
    const v13, 0x41a2f5c3    # 20.37f

    .line 316
    .line 317
    .line 318
    const v14, 0x4168a3d7    # 14.54f

    .line 319
    .line 320
    .line 321
    const/high16 v15, 0x41a80000    # 21.0f

    .line 322
    .line 323
    const v16, 0x414d70a4    # 12.84f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41300000    # 11.0f

    .line 330
    .line 331
    const v2, 0x40ce147b    # 6.44f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41a00000    # 20.0f

    .line 341
    .line 342
    const/high16 v2, 0x41000000    # 8.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, -0x40400000    # -1.5f

    .line 348
    .line 349
    const/high16 v18, -0x40400000    # -1.5f

    .line 350
    .line 351
    const v13, -0x40ab851f    # -0.83f

    .line 352
    .line 353
    .line 354
    const/4 v14, 0x0

    .line 355
    const/high16 v15, -0x40400000    # -1.5f

    .line 356
    .line 357
    const v16, -0x40d47ae1    # -0.67f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x40e570a4    # 7.17f

    .line 364
    .line 365
    .line 366
    const/high16 v2, 0x41880000    # 17.0f

    .line 367
    .line 368
    const/high16 v4, 0x41000000    # 8.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3f2b851f    # 0.67f

    .line 374
    .line 375
    .line 376
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 377
    .line 378
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x410d47ae    # 8.83f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41a00000    # 20.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41a00000    # 20.0f

    .line 393
    .line 394
    const/high16 v2, 0x41880000    # 17.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x41815c29    # 16.17f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x3f2b851f    # 0.67f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 412
    .line 413
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x418ea3d7    # 17.83f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x41a00000    # 20.0f

    .line 420
    .line 421
    const/high16 v4, 0x41880000    # 17.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x418deb85    # 17.74f

    .line 430
    .line 431
    .line 432
    const v2, 0x416a8f5c    # 14.66f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x416b851f    # -0.29f

    .line 439
    .line 440
    .line 441
    const v2, 0x3ebd70a4    # 0.37f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x4119999a    # -0.45f

    .line 448
    .line 449
    .line 450
    const v18, -0x430a3d71    # -0.03f

    .line 451
    .line 452
    .line 453
    const v13, -0x41f0a3d7    # -0.14f

    .line 454
    .line 455
    .line 456
    const v14, -0x435c28f6    # -0.02f

    .line 457
    .line 458
    .line 459
    const v15, -0x41666666    # -0.3f

    .line 460
    .line 461
    .line 462
    const v16, -0x430a3d71    # -0.03f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, -0x3fb5c28f    # -3.16f

    .line 469
    .line 470
    .line 471
    const/high16 v18, 0x40000000    # 2.0f

    .line 472
    .line 473
    const v13, -0x404e147b    # -1.39f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const v15, -0x3fd9999a    # -2.6f

    .line 478
    .line 479
    .line 480
    const v16, 0x3f51eb85    # 0.82f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x3fd47ae1    # -2.68f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x3fd47ae1    # -2.68f

    .line 493
    .line 494
    .line 495
    const v18, -0x4003d70a    # -1.97f

    .line 496
    .line 497
    .line 498
    const/high16 v13, -0x41000000    # -0.5f

    .line 499
    .line 500
    const v14, -0x407ae148    # -1.04f

    .line 501
    .line 502
    .line 503
    const/high16 v15, -0x40400000    # -1.5f

    .line 504
    .line 505
    const v16, -0x4019999a    # -1.8f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, -0x411eb852    # -0.44f

    .line 512
    .line 513
    .line 514
    const v2, -0x40d47ae1    # -0.67f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, -0x40d47ae1    # -0.67f

    .line 521
    .line 522
    .line 523
    const v18, -0x4051eb85    # -1.36f

    .line 524
    .line 525
    .line 526
    const v13, -0x42333333    # -0.1f

    .line 527
    .line 528
    .line 529
    const v14, -0x41d1eb85    # -0.17f

    .line 530
    .line 531
    .line 532
    const v15, -0x4151eb85    # -0.34f

    .line 533
    .line 534
    .line 535
    const v16, -0x40cf5c29    # -0.69f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x4134a3d7    # 11.29f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, -0x40947ae1    # -0.92f

    .line 548
    .line 549
    .line 550
    const v18, 0x3fd47ae1    # 1.66f

    .line 551
    .line 552
    .line 553
    const v13, -0x41a8f5c3    # -0.21f

    .line 554
    .line 555
    .line 556
    const v14, 0x3f170a3d    # 0.59f

    .line 557
    .line 558
    .line 559
    const v15, -0x40fae148    # -0.52f

    .line 560
    .line 561
    .line 562
    const v16, 0x3f933333    # 1.15f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const/16 v16, 0x3800

    .line 576
    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/high16 v6, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v8, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    const/high16 v9, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v12, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const/4 v14, 0x0

    .line 590
    const/4 v15, 0x0

    .line 591
    const-string v4, ""

    .line 592
    .line 593
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    sput-object v0, Landroidx/compose/material/icons/outlined/ChildFriendlyKt;->_childFriendly:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-object v0
.end method
