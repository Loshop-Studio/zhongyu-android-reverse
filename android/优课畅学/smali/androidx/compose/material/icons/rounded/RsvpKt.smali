.class public final Landroidx/compose/material/icons/rounded/RsvpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rsvp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRsvp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RsvpKt;->_rsvp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Rsvp"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const v2, 0x418451ec    # 16.54f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const v17, 0x3f30a3d7    # 0.69f

    .line 82
    .line 83
    .line 84
    const v18, 0x3f6b851f    # 0.92f

    .line 85
    .line 86
    .line 87
    const v13, 0x3ef5c28f    # 0.48f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const v15, 0x3f547ae1    # 0.83f

    .line 92
    .line 93
    .line 94
    const v16, 0x3eeb851f    # 0.46f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x408b851f    # 4.36f

    .line 101
    .line 102
    .line 103
    const v2, -0x405d70a4    # -1.27f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x41700000    # 15.0f

    .line 110
    .line 111
    const/high16 v18, 0x41700000    # 15.0f

    .line 112
    .line 113
    const v13, 0x417d70a4    # 15.84f

    .line 114
    .line 115
    .line 116
    const v14, 0x416b5c29    # 14.71f

    .line 117
    .line 118
    .line 119
    const v15, 0x41770a3d    # 15.44f

    .line 120
    .line 121
    .line 122
    const/high16 v16, 0x41700000    # 15.0f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, -0x408a3d71    # -0.96f

    .line 132
    .line 133
    .line 134
    const v18, -0x40c7ae14    # -0.72f

    .line 135
    .line 136
    .line 137
    const v13, -0x411eb852    # -0.44f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const v15, -0x40a8f5c3    # -0.84f

    .line 142
    .line 143
    .line 144
    const v16, -0x416b851f    # -0.29f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x3f747ae1    # -4.36f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x41575c29    # 13.46f

    .line 157
    .line 158
    .line 159
    const/high16 v18, 0x41100000    # 9.0f

    .line 160
    .line 161
    const v13, 0x414a147b    # 12.63f

    .line 162
    .line 163
    .line 164
    const v14, 0x41175c29    # 9.46f

    .line 165
    .line 166
    .line 167
    const v15, 0x414fae14    # 12.98f

    .line 168
    .line 169
    .line 170
    const/high16 v16, 0x41100000    # 9.0f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x3f30a3d7    # 0.69f

    .line 180
    .line 181
    .line 182
    const v18, 0x3f051eb8    # 0.52f

    .line 183
    .line 184
    .line 185
    const v13, 0x3ea3d70a    # 0.32f

    .line 186
    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    const v15, 0x3f19999a    # 0.6f

    .line 190
    .line 191
    .line 192
    const v16, 0x3e570a3d    # 0.21f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41700000    # 15.0f

    .line 199
    .line 200
    const v2, 0x4146e148    # 12.43f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x3f59999a    # 0.85f

    .line 207
    .line 208
    .line 209
    const v2, -0x3fc5c28f    # -2.91f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x418451ec    # 16.54f

    .line 216
    .line 217
    .line 218
    const/high16 v18, 0x41100000    # 9.0f

    .line 219
    .line 220
    const v13, 0x417f0a3d    # 15.94f

    .line 221
    .line 222
    .line 223
    const v14, 0x41135c29    # 9.21f

    .line 224
    .line 225
    .line 226
    const v15, 0x4181c28f    # 16.22f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x41100000    # 9.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x40a33333    # 5.1f

    .line 238
    .line 239
    .line 240
    const v2, 0x414e6666    # 12.9f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x3efae148    # 0.49f

    .line 247
    .line 248
    .line 249
    const v2, 0x3f91eb85    # 1.14f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x409eb852    # 4.96f

    .line 256
    .line 257
    .line 258
    const/high16 v18, 0x41700000    # 15.0f

    .line 259
    .line 260
    const v13, 0x40b8f5c3    # 5.78f

    .line 261
    .line 262
    .line 263
    const v14, 0x4167d70a    # 14.49f

    .line 264
    .line 265
    .line 266
    const v15, 0x40ae6666    # 5.45f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x41700000    # 15.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x40deb852    # -0.63f

    .line 279
    .line 280
    .line 281
    const v18, -0x4128f5c3    # -0.42f

    .line 282
    .line 283
    .line 284
    const v13, -0x4170a3d7    # -0.28f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, -0x40f851ec    # -0.53f

    .line 289
    .line 290
    .line 291
    const v16, -0x41d1eb85    # -0.17f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x4069999a    # 3.65f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x41500000    # 13.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x40200000    # 2.5f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x3fa7ae14    # 1.31f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x3fe7ae14    # 1.81f

    .line 317
    .line 318
    .line 319
    const/high16 v18, 0x41700000    # 15.0f

    .line 320
    .line 321
    const/high16 v13, 0x40200000    # 2.5f

    .line 322
    .line 323
    const v14, 0x416b0a3d    # 14.69f

    .line 324
    .line 325
    .line 326
    const v15, 0x400c28f6    # 2.19f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x41700000    # 15.0f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x3fd851ec    # 1.69f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const v18, 0x4164f5c3    # 14.31f

    .line 343
    .line 344
    .line 345
    const v13, 0x3fa7ae14    # 1.31f

    .line 346
    .line 347
    .line 348
    const/high16 v14, 0x41700000    # 15.0f

    .line 349
    .line 350
    const/high16 v15, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const v16, 0x416b0a3d    # 14.69f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41200000    # 10.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v18, -0x40800000    # -1.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x40f33333    # -0.55f

    .line 367
    .line 368
    .line 369
    const v15, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    const/high16 v16, -0x40800000    # -1.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40200000    # 2.5f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x40c00000    # 6.0f

    .line 383
    .line 384
    const/high16 v18, 0x41280000    # 10.5f

    .line 385
    .line 386
    const v13, 0x40aa8f5c    # 5.33f

    .line 387
    .line 388
    .line 389
    const/high16 v14, 0x41100000    # 9.0f

    .line 390
    .line 391
    const/high16 v15, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const v16, 0x411ab852    # 9.67f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x3f800000    # 1.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x40a33333    # 5.1f

    .line 405
    .line 406
    .line 407
    const v18, 0x414e6666    # 12.9f

    .line 408
    .line 409
    .line 410
    const/high16 v13, 0x40c00000    # 6.0f

    .line 411
    .line 412
    const v14, 0x4141999a    # 12.1f

    .line 413
    .line 414
    .line 415
    const v15, 0x40b33333    # 5.6f

    .line 416
    .line 417
    .line 418
    const v16, 0x414a6666    # 12.65f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x40900000    # 4.5f

    .line 428
    .line 429
    const/high16 v2, 0x41280000    # 10.5f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, -0x40000000    # -2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x40000000    # 2.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41280000    # 10.5f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 458
    .line 459
    const/high16 v2, 0x41500000    # 13.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, -0x40000000    # -2.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x40c00000    # -0.75f

    .line 475
    .line 476
    const/high16 v18, 0x3f400000    # 0.75f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, 0x3ed1eb85    # 0.41f

    .line 480
    .line 481
    .line 482
    const v15, -0x4151eb85    # -0.34f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x3f400000    # 0.75f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/4 v0, 0x0

    .line 491
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x41900000    # 18.0f

    .line 495
    .line 496
    const/high16 v18, 0x41640000    # 14.25f

    .line 497
    .line 498
    const v13, 0x4192b852    # 18.34f

    .line 499
    .line 500
    .line 501
    const/high16 v14, 0x41700000    # 15.0f

    .line 502
    .line 503
    const/high16 v15, 0x41900000    # 18.0f

    .line 504
    .line 505
    const v16, 0x416a8f5c    # 14.66f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x41200000    # 10.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v18, -0x40800000    # -1.0f

    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const v14, -0x40f33333    # -0.55f

    .line 522
    .line 523
    .line 524
    const v15, 0x3ee66666    # 0.45f

    .line 525
    .line 526
    .line 527
    const/high16 v16, -0x40800000    # -1.0f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x40200000    # 2.5f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 538
    .line 539
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 540
    .line 541
    const v13, 0x3f547ae1    # 0.83f

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 546
    .line 547
    const v16, 0x3f2b851f    # 0.67f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x3f800000    # 1.0f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x41ac0000    # 21.5f

    .line 559
    .line 560
    const/high16 v18, 0x41500000    # 13.0f

    .line 561
    .line 562
    const/high16 v13, 0x41b80000    # 23.0f

    .line 563
    .line 564
    const v14, 0x414547ae    # 12.33f

    .line 565
    .line 566
    .line 567
    const v15, 0x41b2a3d7    # 22.33f

    .line 568
    .line 569
    .line 570
    const/high16 v16, 0x41500000    # 13.0f

    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 579
    .line 580
    const/high16 v2, 0x41280000    # 10.5f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, -0x40000000    # -2.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x3f800000    # 1.0f

    .line 591
    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x40000000    # 2.0f

    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x41280000    # 10.5f

    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x411c0000    # 9.75f

    .line 609
    .line 610
    const/high16 v2, 0x41380000    # 11.5f

    .line 611
    .line 612
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, -0x40c00000    # -0.75f

    .line 619
    .line 620
    const/high16 v18, 0x3f400000    # 0.75f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const v14, 0x3ed1eb85    # 0.41f

    .line 624
    .line 625
    .line 626
    const v15, -0x4151eb85    # -0.34f

    .line 627
    .line 628
    .line 629
    const/high16 v16, 0x3f400000    # 0.75f

    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x41080000    # 8.5f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x3f400000    # 0.75f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x40000000    # 2.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/high16 v18, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const v13, 0x3f0ccccd    # 0.55f

    .line 654
    .line 655
    .line 656
    const/4 v14, 0x0

    .line 657
    const/high16 v15, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const v16, 0x3ee66666    # 0.45f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x41600000    # 14.0f

    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, -0x40800000    # -1.0f

    .line 671
    .line 672
    const/4 v13, 0x0

    .line 673
    const v14, 0x3f0ccccd    # 0.55f

    .line 674
    .line 675
    .line 676
    const v15, -0x4119999a    # -0.45f

    .line 677
    .line 678
    .line 679
    const/high16 v16, 0x3f800000    # 1.0f

    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x40f80000    # 7.75f

    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, 0x40e00000    # 7.0f

    .line 690
    .line 691
    const/high16 v18, 0x41640000    # 14.25f

    .line 692
    .line 693
    const v13, 0x40eae148    # 7.34f

    .line 694
    .line 695
    .line 696
    const/high16 v14, 0x41700000    # 15.0f

    .line 697
    .line 698
    const/high16 v15, 0x40e00000    # 7.0f

    .line 699
    .line 700
    const v16, 0x416a8f5c    # 14.66f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/4 v0, 0x0

    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, 0x3f400000    # 0.75f

    .line 711
    .line 712
    const/high16 v18, -0x40c00000    # -0.75f

    .line 713
    .line 714
    const/4 v13, 0x0

    .line 715
    const v14, -0x412e147b    # -0.41f

    .line 716
    .line 717
    .line 718
    const v15, 0x3eae147b    # 0.34f

    .line 719
    .line 720
    .line 721
    const/high16 v16, -0x40c00000    # -0.75f

    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, 0x41200000    # 10.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, -0x40c00000    # -0.75f

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, 0x40f80000    # 7.75f

    .line 737
    .line 738
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, 0x40e00000    # 7.0f

    .line 742
    .line 743
    const/high16 v18, 0x41400000    # 12.0f

    .line 744
    .line 745
    const v13, 0x40eae148    # 7.34f

    .line 746
    .line 747
    .line 748
    const/high16 v14, 0x414c0000    # 12.75f

    .line 749
    .line 750
    const/high16 v15, 0x40e00000    # 7.0f

    .line 751
    .line 752
    const v16, 0x41468f5c    # 12.41f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v0, -0x40000000    # -2.0f

    .line 759
    .line 760
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v18, -0x40800000    # -1.0f

    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    const v14, -0x40f33333    # -0.55f

    .line 769
    .line 770
    .line 771
    const v15, 0x3ee66666    # 0.45f

    .line 772
    .line 773
    .line 774
    const/high16 v16, -0x40800000    # -1.0f

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v0, 0x40300000    # 2.75f

    .line 780
    .line 781
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x41380000    # 11.5f

    .line 785
    .line 786
    const/high16 v18, 0x411c0000    # 9.75f

    .line 787
    .line 788
    const v13, 0x41328f5c    # 11.16f

    .line 789
    .line 790
    .line 791
    const/high16 v14, 0x41100000    # 9.0f

    .line 792
    .line 793
    const/high16 v15, 0x41380000    # 11.5f

    .line 794
    .line 795
    const v16, 0x411570a4    # 9.34f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const/16 v16, 0x3800

    .line 809
    .line 810
    const/16 v17, 0x0

    .line 811
    .line 812
    const/high16 v6, 0x3f800000    # 1.0f

    .line 813
    .line 814
    const/high16 v8, 0x3f800000    # 1.0f

    .line 815
    .line 816
    const/4 v7, 0x0

    .line 817
    const/high16 v9, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const/high16 v12, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const/4 v13, 0x0

    .line 822
    const/4 v14, 0x0

    .line 823
    const/4 v15, 0x0

    .line 824
    const-string v4, ""

    .line 825
    .line 826
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    sput-object v0, Landroidx/compose/material/icons/rounded/RsvpKt;->_rsvp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 835
    .line 836
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    return-object v0
.end method
