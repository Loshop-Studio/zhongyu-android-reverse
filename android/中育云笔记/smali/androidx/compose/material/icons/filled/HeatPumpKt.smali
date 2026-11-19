.class public final Landroidx/compose/material/icons/filled/HeatPumpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHeatPump(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/HeatPumpKt;->_heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.HeatPump"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x414c0000    # 12.75f

    .line 163
    .line 164
    const v2, 0x40e28f5c    # 7.08f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x400ccccd    # 2.2f

    .line 171
    .line 172
    .line 173
    const v18, 0x3f68f5c3    # 0.91f

    .line 174
    .line 175
    .line 176
    const v13, 0x3f51eb85    # 0.82f

    .line 177
    .line 178
    .line 179
    const v14, 0x3df5c28f    # 0.12f

    .line 180
    .line 181
    .line 182
    const v15, 0x3fc8f5c3    # 1.57f

    .line 183
    .line 184
    .line 185
    const v16, 0x3ee147ae    # 0.44f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x400ccccd    # 2.2f

    .line 192
    .line 193
    .line 194
    const v2, -0x3ff33333    # -2.2f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x40e28f5c    # 7.08f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x41340000    # 11.25f

    .line 210
    .line 211
    const v2, 0x40e28f5c    # 7.08f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40470a3d    # 3.11f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, -0x3ff33333    # -2.2f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x41340000    # 11.25f

    .line 230
    .line 231
    const v18, 0x40e28f5c    # 7.08f

    .line 232
    .line 233
    .line 234
    const v13, 0x411ae148    # 9.68f

    .line 235
    .line 236
    .line 237
    const v14, 0x40f0a3d7    # 7.52f

    .line 238
    .line 239
    .line 240
    const v15, 0x4126e148    # 10.43f

    .line 241
    .line 242
    .line 243
    const v16, 0x40e66666    # 7.2f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x40ffae14    # 7.99f

    .line 253
    .line 254
    .line 255
    const v2, 0x4110cccd    # 9.05f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x400ccccd    # 2.2f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x40e28f5c    # 7.08f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x40ffae14    # 7.99f

    .line 274
    .line 275
    .line 276
    const v18, 0x4110cccd    # 9.05f

    .line 277
    .line 278
    .line 279
    const v13, 0x40e66666    # 7.2f

    .line 280
    .line 281
    .line 282
    const v14, 0x4126e148    # 10.43f

    .line 283
    .line 284
    .line 285
    const v15, 0x40f0a3d7    # 7.52f

    .line 286
    .line 287
    .line 288
    const v16, 0x411ae148    # 9.68f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x414c0000    # 12.75f

    .line 298
    .line 299
    const v2, 0x40e28f5c    # 7.08f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x40470a3d    # 3.11f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x400ccccd    # 2.2f

    .line 312
    .line 313
    .line 314
    const v2, -0x3ff33333    # -2.2f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x40e28f5c    # 7.08f

    .line 321
    .line 322
    .line 323
    const/high16 v18, 0x414c0000    # 12.75f

    .line 324
    .line 325
    const v13, 0x40f0a3d7    # 7.52f

    .line 326
    .line 327
    .line 328
    const v14, 0x41651eb8    # 14.32f

    .line 329
    .line 330
    .line 331
    const v15, 0x40e66666    # 7.2f

    .line 332
    .line 333
    .line 334
    const v16, 0x41591eb8    # 13.57f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x41875c29    # 16.92f

    .line 344
    .line 345
    .line 346
    const/high16 v2, 0x41340000    # 11.25f

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x3ff33333    # -2.2f

    .line 352
    .line 353
    .line 354
    const v18, -0x40970a3d    # -0.91f

    .line 355
    .line 356
    .line 357
    const v13, -0x40ae147b    # -0.82f

    .line 358
    .line 359
    .line 360
    const v14, -0x420a3d71    # -0.12f

    .line 361
    .line 362
    .line 363
    const v15, -0x40370a3d    # -1.57f

    .line 364
    .line 365
    .line 366
    const v16, -0x411eb852    # -0.44f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x400ccccd    # 2.2f

    .line 373
    .line 374
    .line 375
    const v2, -0x3ff33333    # -2.2f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x41875c29    # 16.92f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41400000    # 12.0f

    .line 391
    .line 392
    const/high16 v2, 0x41500000    # 13.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, -0x40800000    # -1.0f

    .line 398
    .line 399
    const/high16 v18, -0x40800000    # -1.0f

    .line 400
    .line 401
    const v13, -0x40f33333    # -0.55f

    .line 402
    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    const/high16 v15, -0x40800000    # -1.0f

    .line 406
    .line 407
    const v16, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    const v14, -0x40f33333    # -0.55f

    .line 417
    .line 418
    .line 419
    const v15, 0x3ee66666    # 0.45f

    .line 420
    .line 421
    .line 422
    const/high16 v16, -0x40800000    # -1.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3ee66666    # 0.45f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x41400000    # 12.0f

    .line 436
    .line 437
    const/high16 v18, 0x41500000    # 13.0f

    .line 438
    .line 439
    const/high16 v13, 0x41500000    # 13.0f

    .line 440
    .line 441
    const v14, 0x4148cccd    # 12.55f

    .line 442
    .line 443
    .line 444
    const v15, 0x4148cccd    # 12.55f

    .line 445
    .line 446
    .line 447
    const/high16 v16, 0x41500000    # 13.0f

    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x41875c29    # 16.92f

    .line 456
    .line 457
    .line 458
    const/high16 v2, 0x414c0000    # 12.75f

    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, -0x3fb8f5c3    # -3.11f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x400ccccd    # 2.2f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x414c0000    # 12.75f

    .line 476
    .line 477
    const v18, 0x41875c29    # 16.92f

    .line 478
    .line 479
    .line 480
    const v13, 0x41651eb8    # 14.32f

    .line 481
    .line 482
    .line 483
    const v14, 0x4183d70a    # 16.48f

    .line 484
    .line 485
    .line 486
    const v15, 0x41591eb8    # 13.57f

    .line 487
    .line 488
    .line 489
    const v16, 0x41866666    # 16.8f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x4180147b    # 16.01f

    .line 499
    .line 500
    .line 501
    const v2, 0x416f3333    # 14.95f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, -0x3ff33333    # -2.2f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x40470a3d    # 3.11f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x4180147b    # 16.01f

    .line 520
    .line 521
    .line 522
    const v18, 0x416f3333    # 14.95f

    .line 523
    .line 524
    .line 525
    const v13, 0x41866666    # 16.8f

    .line 526
    .line 527
    .line 528
    const v14, 0x41591eb8    # 13.57f

    .line 529
    .line 530
    .line 531
    const v15, 0x4183d70a    # 16.48f

    .line 532
    .line 533
    .line 534
    const v16, 0x41651eb8    # 14.32f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x415cf5c3    # 13.81f

    .line 544
    .line 545
    .line 546
    const/high16 v2, 0x41340000    # 11.25f

    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x400ccccd    # 2.2f

    .line 552
    .line 553
    .line 554
    const v2, -0x3ff33333    # -2.2f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x3f68f5c3    # 0.91f

    .line 561
    .line 562
    .line 563
    const v18, 0x400ccccd    # 2.2f

    .line 564
    .line 565
    .line 566
    const v13, 0x3ef0a3d7    # 0.47f

    .line 567
    .line 568
    .line 569
    const v14, 0x3f23d70a    # 0.64f

    .line 570
    .line 571
    .line 572
    const v15, 0x3f4a3d71    # 0.79f

    .line 573
    .line 574
    .line 575
    const v16, 0x3fb1eb85    # 1.39f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x415cf5c3    # 13.81f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    const/16 v16, 0x3800

    .line 595
    .line 596
    const/16 v17, 0x0

    .line 597
    .line 598
    const/high16 v6, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v8, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v7, 0x0

    .line 603
    const/high16 v9, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/high16 v12, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const/4 v14, 0x0

    .line 609
    const/4 v15, 0x0

    .line 610
    const-string v4, ""

    .line 611
    .line 612
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    sput-object v0, Landroidx/compose/material/icons/filled/HeatPumpKt;->_heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    return-object v0
.end method
