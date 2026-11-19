.class public final Landroidx/compose/material/icons/rounded/ChecklistKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _checklist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChecklist(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ChecklistKt;->_checklist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Checklist"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40f33333    # -0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40800000    # -1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x3f200000    # -7.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v18, 0x3f800000    # 1.0f

    .line 99
    .line 100
    const v13, -0x40f33333    # -0.55f

    .line 101
    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    const/high16 v15, -0x40800000    # -1.0f

    .line 105
    .line 106
    const v16, 0x3ee66666    # 0.45f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3ee66666    # 0.45f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x3f800000    # 1.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40e00000    # 7.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41b00000    # 22.0f

    .line 126
    .line 127
    const/high16 v18, 0x41000000    # 8.0f

    .line 128
    .line 129
    const v13, 0x41ac6666    # 21.55f

    .line 130
    .line 131
    .line 132
    const/high16 v14, 0x41100000    # 9.0f

    .line 133
    .line 134
    const/high16 v15, 0x41b00000    # 22.0f

    .line 135
    .line 136
    const v16, 0x4108cccd    # 8.55f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41500000    # 13.0f

    .line 146
    .line 147
    const/high16 v2, 0x41800000    # 16.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/high16 v18, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, 0x3f0ccccd    # 0.55f

    .line 158
    .line 159
    .line 160
    const v15, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    const/high16 v16, 0x3f800000    # 1.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x40e00000    # 7.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v18, -0x40800000    # -1.0f

    .line 174
    .line 175
    const v13, 0x3f0ccccd    # 0.55f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/high16 v15, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const v16, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x40800000    # -1.0f

    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    const v14, -0x40f33333    # -0.55f

    .line 191
    .line 192
    .line 193
    const v15, -0x4119999a    # -0.45f

    .line 194
    .line 195
    .line 196
    const/high16 v16, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, -0x3f200000    # -7.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x41500000    # 13.0f

    .line 207
    .line 208
    const/high16 v18, 0x41800000    # 16.0f

    .line 209
    .line 210
    const v13, 0x41573333    # 13.45f

    .line 211
    .line 212
    .line 213
    const/high16 v14, 0x41700000    # 15.0f

    .line 214
    .line 215
    const/high16 v15, 0x41500000    # 13.0f

    .line 216
    .line 217
    const v16, 0x41773333    # 15.45f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x4127851f    # 10.47f

    .line 227
    .line 228
    .line 229
    const v2, 0x409428f6    # 4.63f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const v18, 0x3fb47ae1    # 1.41f

    .line 238
    .line 239
    .line 240
    const v13, 0x3ec7ae14    # 0.39f

    .line 241
    .line 242
    .line 243
    const v14, 0x3ec7ae14    # 0.39f

    .line 244
    .line 245
    .line 246
    const v15, 0x3ec7ae14    # 0.39f

    .line 247
    .line 248
    .line 249
    const v16, 0x3f828f5c    # 1.02f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x40880000    # 4.25f

    .line 256
    .line 257
    const v2, -0x3f78a3d7    # -4.23f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x404a3d71    # -1.42f

    .line 264
    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    const v13, -0x413851ec    # -0.39f

    .line 269
    .line 270
    .line 271
    const v15, -0x407d70a4    # -1.02f

    .line 272
    .line 273
    .line 274
    const v16, 0x3ec7ae14    # 0.39f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x41028f5c    # 8.16f

    .line 281
    .line 282
    .line 283
    const v2, 0x402ccccd    # 2.7f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const v18, -0x404b851f    # -1.41f

    .line 292
    .line 293
    .line 294
    const v14, -0x413851ec    # -0.39f

    .line 295
    .line 296
    .line 297
    const v15, -0x413851ec    # -0.39f

    .line 298
    .line 299
    .line 300
    const v16, -0x407d70a4    # -1.02f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3fb47ae1    # 1.41f

    .line 307
    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    const v13, 0x3ec7ae14    # 0.39f

    .line 312
    .line 313
    .line 314
    const v15, 0x3f828f5c    # 1.02f

    .line 315
    .line 316
    .line 317
    const v16, -0x413851ec    # -0.39f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3fb5c28f    # 1.42f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, -0x3f9d70a4    # -3.54f

    .line 330
    .line 331
    .line 332
    const v2, 0x40628f5c    # 3.54f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x4127851f    # 10.47f

    .line 339
    .line 340
    .line 341
    const v18, 0x409428f6    # 4.63f

    .line 342
    .line 343
    .line 344
    const v13, 0x41173333    # 9.45f

    .line 345
    .line 346
    .line 347
    const/high16 v14, 0x40880000    # 4.25f

    .line 348
    .line 349
    const v15, 0x412170a4    # 10.09f

    .line 350
    .line 351
    .line 352
    const/high16 v16, 0x40880000    # 4.25f

    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x414a3d71    # 12.64f

    .line 361
    .line 362
    .line 363
    const v2, 0x4127ae14    # 10.48f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    const v18, 0x3fb47ae1    # 1.41f

    .line 372
    .line 373
    .line 374
    const v13, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    const v14, 0x3ec7ae14    # 0.39f

    .line 378
    .line 379
    .line 380
    const v15, 0x3ec7ae14    # 0.39f

    .line 381
    .line 382
    .line 383
    const v16, 0x3f828f5c    # 1.02f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x40880000    # 4.25f

    .line 390
    .line 391
    const v2, -0x3f78a3d7    # -4.23f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x404a3d71    # -1.42f

    .line 398
    .line 399
    .line 400
    const/16 v18, 0x0

    .line 401
    .line 402
    const v13, -0x413851ec    # -0.39f

    .line 403
    .line 404
    .line 405
    const v15, -0x407d70a4    # -1.02f

    .line 406
    .line 407
    .line 408
    const v16, 0x3ec7ae14    # 0.39f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x418147ae    # 16.16f

    .line 415
    .line 416
    .line 417
    const v2, 0x402ccccd    # 2.7f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const v18, -0x404b851f    # -1.41f

    .line 426
    .line 427
    .line 428
    const v14, -0x413851ec    # -0.39f

    .line 429
    .line 430
    .line 431
    const v15, -0x413851ec    # -0.39f

    .line 432
    .line 433
    .line 434
    const v16, -0x407d70a4    # -1.02f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x3fb47ae1    # 1.41f

    .line 441
    .line 442
    .line 443
    const/4 v2, 0x0

    .line 444
    const v4, 0x3f828f5c    # 1.02f

    .line 445
    .line 446
    .line 447
    const v6, -0x413851ec    # -0.39f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3fb5c28f    # 1.42f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, -0x3f9d70a4    # -3.54f

    .line 460
    .line 461
    .line 462
    const v2, 0x40628f5c    # 3.54f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x4127ae14    # 10.48f

    .line 469
    .line 470
    .line 471
    const v18, 0x414a3d71    # 12.64f

    .line 472
    .line 473
    .line 474
    const v13, 0x41173333    # 9.45f

    .line 475
    .line 476
    .line 477
    const/high16 v14, 0x41440000    # 12.25f

    .line 478
    .line 479
    const v15, 0x412170a4    # 10.09f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x41440000    # 12.25f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x414a3d71    # 12.64f

    .line 488
    .line 489
    .line 490
    const v2, 0x4127ae14    # 10.48f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const/16 v16, 0x3800

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    const/high16 v6, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const/high16 v8, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/4 v7, 0x0

    .line 512
    const/high16 v9, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/high16 v12, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const/4 v14, 0x0

    .line 518
    const/4 v15, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sput-object v0, Landroidx/compose/material/icons/rounded/ChecklistKt;->_checklist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object v0
.end method
