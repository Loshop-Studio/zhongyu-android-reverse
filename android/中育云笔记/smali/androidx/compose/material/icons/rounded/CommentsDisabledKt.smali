.class public final Landroidx/compose/material/icons/rounded/CommentsDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _commentsDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCommentsDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CommentsDisabledKt;->_commentsDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CommentsDisabled"

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
    const v0, 0x3fb1eb85    # 1.39f

    .line 71
    .line 72
    .line 73
    const v2, 0x4033d70a    # 2.81f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fb1eb85    # 1.39f

    .line 80
    .line 81
    .line 82
    const v18, 0x40870a3d    # 4.22f

    .line 83
    .line 84
    .line 85
    const/high16 v13, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v14, 0x404ccccd    # 3.2f

    .line 88
    .line 89
    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, 0x40751eb8    # 3.83f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x409a8f5c    # 4.83f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41800000    # 16.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v18, 0x40000000    # 2.0f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, 0x3f8ccccd    # 1.1f

    .line 117
    .line 118
    .line 119
    const v15, 0x3f666666    # 0.9f

    .line 120
    .line 121
    .line 122
    const/high16 v16, 0x40000000    # 2.0f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, 0x4132b852    # 11.17f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x4093851f    # 4.61f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3fb47ae1    # 1.41f

    .line 140
    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const v13, 0x3ec7ae14    # 0.39f

    .line 145
    .line 146
    .line 147
    const v14, 0x3ec7ae14    # 0.39f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f828f5c    # 1.02f

    .line 151
    .line 152
    .line 153
    const v16, 0x3ec7ae14    # 0.39f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const v18, -0x404b851f    # -1.41f

    .line 162
    .line 163
    .line 164
    const v14, -0x413851ec    # -0.39f

    .line 165
    .line 166
    .line 167
    const v15, 0x3ec7ae14    # 0.39f

    .line 168
    .line 169
    .line 170
    const v16, -0x407d70a4    # -1.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x4033d70a    # 2.81f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3fb1eb85    # 1.39f

    .line 183
    .line 184
    .line 185
    const v18, 0x4033d70a    # 2.81f

    .line 186
    .line 187
    .line 188
    const v13, 0x401ae148    # 2.42f

    .line 189
    .line 190
    .line 191
    const v14, 0x401ae148    # 2.42f

    .line 192
    .line 193
    .line 194
    const v15, 0x3fe3d70a    # 1.78f

    .line 195
    .line 196
    .line 197
    const v16, 0x401ae148    # 2.42f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x40cc28f6    # 6.38f

    .line 207
    .line 208
    .line 209
    const v2, 0x41135c29    # 9.21f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x4102b852    # 8.17f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x41300000    # 11.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40e00000    # 7.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x40800000    # -1.0f

    .line 229
    .line 230
    const/high16 v18, -0x40800000    # -1.0f

    .line 231
    .line 232
    const v13, -0x40f33333    # -0.55f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/high16 v15, -0x40800000    # -1.0f

    .line 237
    .line 238
    const v16, -0x4119999a    # -0.45f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x40cc28f6    # 6.38f

    .line 245
    .line 246
    .line 247
    const v18, 0x41135c29    # 9.21f

    .line 248
    .line 249
    .line 250
    const/high16 v13, 0x40c00000    # 6.0f

    .line 251
    .line 252
    const v14, 0x411ae148    # 9.68f

    .line 253
    .line 254
    .line 255
    const v15, 0x40c4cccd    # 6.15f

    .line 256
    .line 257
    .line 258
    const v16, 0x41166666    # 9.4f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41600000    # 14.0f

    .line 268
    .line 269
    const/high16 v2, 0x40e00000    # 7.0f

    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40800000    # -1.0f

    .line 275
    .line 276
    const/high16 v18, -0x40800000    # -1.0f

    .line 277
    .line 278
    const v13, -0x40f33333    # -0.55f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, -0x40800000    # -1.0f

    .line 283
    .line 284
    const v16, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x40f33333    # -0.55f

    .line 294
    .line 295
    .line 296
    const v15, 0x3ee66666    # 0.45f

    .line 297
    .line 298
    .line 299
    const/high16 v16, -0x40800000    # -1.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x400ae148    # 2.17f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x40000000    # 2.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40e00000    # 7.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41400000    # 12.0f

    .line 324
    .line 325
    const v2, 0x416d47ae    # 14.83f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, -0x40800000    # -1.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41880000    # 17.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v13, 0x3f0ccccd    # 0.55f

    .line 342
    .line 343
    .line 344
    const/4 v14, 0x0

    .line 345
    const/high16 v15, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const v16, -0x4119999a    # -0.45f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/4 v0, 0x0

    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, -0x40800000    # -1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const v14, -0x40f33333    # -0.55f

    .line 361
    .line 362
    .line 363
    const v15, -0x4119999a    # -0.45f

    .line 364
    .line 365
    .line 366
    const/high16 v16, -0x40800000    # -1.0f

    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x3f5a8f5c    # -5.17f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, -0x40800000    # -1.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41880000    # 17.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const v13, 0x3f0ccccd    # 0.55f

    .line 390
    .line 391
    .line 392
    const/4 v14, 0x0

    .line 393
    const/high16 v15, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const v16, -0x4119999a    # -0.45f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/4 v0, 0x0

    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40800000    # -1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, -0x40f33333    # -0.55f

    .line 409
    .line 410
    .line 411
    const v15, -0x4119999a    # -0.45f

    .line 412
    .line 413
    .line 414
    const/high16 v16, -0x40800000    # -1.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x410d47ae    # 8.83f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, -0x3f800000    # -4.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41a00000    # 20.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x40000000    # 2.0f

    .line 436
    .line 437
    const/high16 v18, 0x40000000    # 2.0f

    .line 438
    .line 439
    const v13, 0x3f8ccccd    # 1.1f

    .line 440
    .line 441
    .line 442
    const/4 v14, 0x0

    .line 443
    const/high16 v15, 0x40000000    # 2.0f

    .line 444
    .line 445
    const v16, 0x3f666666    # 0.9f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x4172b852    # 15.17f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x4186a3d7    # 16.83f

    .line 458
    .line 459
    .line 460
    const/high16 v2, 0x41600000    # 14.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x41880000    # 17.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v18, -0x40800000    # -1.0f

    .line 473
    .line 474
    const v13, 0x3f0ccccd    # 0.55f

    .line 475
    .line 476
    .line 477
    const/high16 v15, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const v16, -0x4119999a    # -0.45f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/4 v0, 0x0

    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, -0x40800000    # -1.0f

    .line 490
    .line 491
    const/4 v13, 0x0

    .line 492
    const v14, -0x40f33333    # -0.55f

    .line 493
    .line 494
    .line 495
    const v15, -0x4119999a    # -0.45f

    .line 496
    .line 497
    .line 498
    const/high16 v16, -0x40800000    # -1.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x416d47ae    # 14.83f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const-string v4, ""

    .line 532
    .line 533
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sput-object v0, Landroidx/compose/material/icons/rounded/CommentsDisabledKt;->_commentsDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-object v0
.end method
