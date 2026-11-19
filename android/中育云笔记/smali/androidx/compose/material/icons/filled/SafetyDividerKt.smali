.class public final Landroidx/compose/material/icons/filled/SafetyDividerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _safetyDivider:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSafetyDivider(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SafetyDividerKt;->_safetyDivider:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SafetyDivider"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41400000    # 12.0f

    .line 101
    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40000000    # 2.0f

    .line 106
    .line 107
    const/high16 v18, -0x40000000    # -2.0f

    .line 108
    .line 109
    const v13, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const/high16 v15, 0x40000000    # 2.0f

    .line 114
    .line 115
    const v16, -0x4099999a    # -0.9f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, -0x40000000    # -2.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, -0x40733333    # -1.1f

    .line 125
    .line 126
    .line 127
    const v15, -0x4099999a    # -0.9f

    .line 128
    .line 129
    .line 130
    const/high16 v16, -0x40000000    # -2.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x3f666666    # 0.9f

    .line 136
    .line 137
    .line 138
    const/high16 v2, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/high16 v4, -0x40000000    # -2.0f

    .line 141
    .line 142
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x40a00000    # 5.0f

    .line 146
    .line 147
    const/high16 v18, 0x41400000    # 12.0f

    .line 148
    .line 149
    const/high16 v13, 0x40400000    # 3.0f

    .line 150
    .line 151
    const v14, 0x4131999a    # 11.1f

    .line 152
    .line 153
    .line 154
    const v15, 0x4079999a    # 3.9f

    .line 155
    .line 156
    .line 157
    const/high16 v16, 0x41400000    # 12.0f

    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x40f8f5c3    # 7.78f

    .line 166
    .line 167
    .line 168
    const v2, 0x415947ae    # 13.58f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v18, 0x41500000    # 13.0f

    .line 175
    .line 176
    const v13, 0x40ddc28f    # 6.93f

    .line 177
    .line 178
    .line 179
    const v14, 0x41535c29    # 13.21f

    .line 180
    .line 181
    .line 182
    const v15, 0x40bfae14    # 5.99f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x41500000    # 13.0f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x3f147ae1    # 0.58f

    .line 191
    .line 192
    .line 193
    const v2, -0x3fce147b    # -2.78f

    .line 194
    .line 195
    .line 196
    const v4, 0x3e570a3d    # 0.21f

    .line 197
    .line 198
    .line 199
    const v6, -0x4008f5c3    # -1.93f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const v18, 0x4176e148    # 15.43f

    .line 208
    .line 209
    .line 210
    const v13, 0x3fbd70a4    # 1.48f

    .line 211
    .line 212
    .line 213
    const v14, 0x415e6666    # 13.9f

    .line 214
    .line 215
    .line 216
    const/high16 v15, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const v16, 0x4169eb85    # 14.62f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/high16 v2, 0x41800000    # 16.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41000000    # 8.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x40ee147b    # -0.57f

    .line 237
    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x40f8f5c3    # 7.78f

    .line 244
    .line 245
    .line 246
    const v18, 0x415947ae    # 13.58f

    .line 247
    .line 248
    .line 249
    const/high16 v13, 0x41100000    # 9.0f

    .line 250
    .line 251
    const v14, 0x4169eb85    # 14.62f

    .line 252
    .line 253
    .line 254
    const v15, 0x410851ec    # 8.52f

    .line 255
    .line 256
    .line 257
    const v16, 0x415e6666    # 13.9f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41980000    # 19.0f

    .line 267
    .line 268
    const/high16 v2, 0x41400000    # 12.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x40000000    # 2.0f

    .line 274
    .line 275
    const/high16 v18, -0x40000000    # -2.0f

    .line 276
    .line 277
    const v13, 0x3f8ccccd    # 1.1f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/high16 v15, 0x40000000    # 2.0f

    .line 282
    .line 283
    const v16, -0x4099999a    # -0.9f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40000000    # -2.0f

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    const v14, -0x40733333    # -1.1f

    .line 293
    .line 294
    .line 295
    const v15, -0x4099999a    # -0.9f

    .line 296
    .line 297
    .line 298
    const/high16 v16, -0x40000000    # -2.0f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3f666666    # 0.9f

    .line 304
    .line 305
    .line 306
    const/high16 v2, 0x40000000    # 2.0f

    .line 307
    .line 308
    const/high16 v4, -0x40000000    # -2.0f

    .line 309
    .line 310
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41980000    # 19.0f

    .line 314
    .line 315
    const/high16 v18, 0x41400000    # 12.0f

    .line 316
    .line 317
    const/high16 v13, 0x41880000    # 17.0f

    .line 318
    .line 319
    const v14, 0x4131999a    # 11.1f

    .line 320
    .line 321
    .line 322
    const v15, 0x418f3333    # 17.9f

    .line 323
    .line 324
    .line 325
    const/high16 v16, 0x41400000    # 12.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x41ae3d71    # 21.78f

    .line 334
    .line 335
    .line 336
    const v2, 0x415947ae    # 13.58f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x41500000    # 13.0f

    .line 343
    .line 344
    const v13, 0x41a770a4    # 20.93f

    .line 345
    .line 346
    .line 347
    const v14, 0x41535c29    # 13.21f

    .line 348
    .line 349
    .line 350
    const v15, 0x419feb85    # 19.99f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x41500000    # 13.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x3f147ae1    # 0.58f

    .line 359
    .line 360
    .line 361
    const v2, -0x3fce147b    # -2.78f

    .line 362
    .line 363
    .line 364
    const v4, 0x3e570a3d    # 0.21f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x41700000    # 15.0f

    .line 371
    .line 372
    const v18, 0x4176e148    # 15.43f

    .line 373
    .line 374
    .line 375
    const v13, 0x4177ae14    # 15.48f

    .line 376
    .line 377
    .line 378
    const v14, 0x415e6666    # 13.9f

    .line 379
    .line 380
    .line 381
    const/high16 v15, 0x41700000    # 15.0f

    .line 382
    .line 383
    const v16, 0x4169eb85    # 14.62f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41700000    # 15.0f

    .line 390
    .line 391
    const/high16 v2, 0x41800000    # 16.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x41000000    # 8.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x40ee147b    # -0.57f

    .line 402
    .line 403
    .line 404
    const/4 v2, 0x0

    .line 405
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x41ae3d71    # 21.78f

    .line 409
    .line 410
    .line 411
    const v18, 0x415947ae    # 13.58f

    .line 412
    .line 413
    .line 414
    const/high16 v13, 0x41b80000    # 23.0f

    .line 415
    .line 416
    const v14, 0x4169eb85    # 14.62f

    .line 417
    .line 418
    .line 419
    const v15, 0x41b428f6    # 22.52f

    .line 420
    .line 421
    .line 422
    const v16, 0x415e6666    # 13.9f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/16 v16, 0x3800

    .line 436
    .line 437
    const/16 v17, 0x0

    .line 438
    .line 439
    const/high16 v6, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/high16 v8, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    const/high16 v9, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v12, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sput-object v0, Landroidx/compose/material/icons/filled/SafetyDividerKt;->_safetyDivider:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-object v0
.end method
