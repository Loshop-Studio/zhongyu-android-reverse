.class public final Landroidx/compose/material/icons/outlined/EmergencyShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergencyShare(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.EmergencyShare"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x409e6666    # 4.95f

    .line 78
    .line 79
    .line 80
    const v18, 0x40033333    # 2.05f

    .line 81
    .line 82
    .line 83
    const v13, 0x3ff70a3d    # 1.93f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x406b851f    # 3.68f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f47ae14    # 0.78f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x3fb47ae1    # 1.41f

    .line 97
    .line 98
    .line 99
    const v2, -0x404b851f    # -1.41f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41400000    # 12.0f

    .line 106
    .line 107
    const/high16 v18, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const v13, 0x416a147b    # 14.63f

    .line 110
    .line 111
    .line 112
    const v14, 0x40d1eb85    # 6.56f

    .line 113
    .line 114
    .line 115
    const v15, 0x4156147b    # 13.38f

    .line 116
    .line 117
    .line 118
    const/high16 v16, 0x40c00000    # 6.0f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x41075c29    # 8.46f

    .line 124
    .line 125
    .line 126
    const v2, 0x40eeb852    # 7.46f

    .line 127
    .line 128
    .line 129
    const v4, 0x4115eb85    # 9.37f

    .line 130
    .line 131
    .line 132
    const v6, 0x40d1eb85    # 6.56f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40e1999a    # 7.05f

    .line 139
    .line 140
    .line 141
    const v2, 0x40c1999a    # 6.05f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v18, 0x40800000    # 4.0f

    .line 148
    .line 149
    const v13, 0x41051eb8    # 8.32f

    .line 150
    .line 151
    .line 152
    const v14, 0x4098f5c3    # 4.78f

    .line 153
    .line 154
    .line 155
    const v15, 0x41211eb8    # 10.07f

    .line 156
    .line 157
    .line 158
    const/high16 v16, 0x40800000    # 4.0f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x404eb852    # 3.23f

    .line 167
    .line 168
    .line 169
    const v2, 0x419e3d71    # 19.78f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3fb47ae1    # 1.41f

    .line 176
    .line 177
    .line 178
    const v2, -0x404b851f    # -1.41f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x414028f6    # 12.01f

    .line 185
    .line 186
    .line 187
    const/high16 v18, 0x40000000    # 2.0f

    .line 188
    .line 189
    const v13, 0x4185eb85    # 16.74f

    .line 190
    .line 191
    .line 192
    const v14, 0x4040a3d7    # 3.01f

    .line 193
    .line 194
    .line 195
    const v15, 0x4167d70a    # 14.49f

    .line 196
    .line 197
    .line 198
    const/high16 v16, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x40b47ae1    # 5.64f

    .line 204
    .line 205
    .line 206
    const v2, 0x409428f6    # 4.63f

    .line 207
    .line 208
    .line 209
    const v4, 0x40e8a3d7    # 7.27f

    .line 210
    .line 211
    .line 212
    const v6, 0x4040a3d7    # 3.01f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x40870a3d    # 4.22f

    .line 219
    .line 220
    .line 221
    const v2, 0x404e147b    # 3.22f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    const v13, 0x40c70a3d    # 6.22f

    .line 230
    .line 231
    .line 232
    const v14, 0x3f9d70a4    # 1.23f

    .line 233
    .line 234
    .line 235
    const v15, 0x410f851f    # 8.97f

    .line 236
    .line 237
    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x418e51ec    # 17.79f

    .line 244
    .line 245
    .line 246
    const v2, 0x3f9d70a4    # 1.23f

    .line 247
    .line 248
    .line 249
    const v4, 0x404eb852    # 3.23f

    .line 250
    .line 251
    .line 252
    const v6, 0x419e3d71    # 19.78f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41300000    # 11.0f

    .line 262
    .line 263
    const/high16 v2, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, 0x40800000    # 4.0f

    .line 269
    .line 270
    const v18, 0x4084cccd    # 4.15f

    .line 271
    .line 272
    .line 273
    const v13, 0x3ff851ec    # 1.94f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, 0x40800000    # 4.0f

    .line 278
    .line 279
    const v16, 0x3fb9999a    # 1.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, -0x3f800000    # -4.0f

    .line 286
    .line 287
    const v18, 0x40c570a4    # 6.17f

    .line 288
    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, 0x3f70a3d7    # 0.94f

    .line 292
    .line 293
    .line 294
    const v15, -0x40f33333    # -0.55f

    .line 295
    .line 296
    .line 297
    const v16, 0x403b851f    # 2.93f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v18, -0x3f3a8f5c    # -6.17f

    .line 304
    .line 305
    .line 306
    const v13, -0x3fa33333    # -3.45f

    .line 307
    .line 308
    .line 309
    const v14, -0x3fb0a3d7    # -3.24f

    .line 310
    .line 311
    .line 312
    const/high16 v15, -0x3f800000    # -4.0f

    .line 313
    .line 314
    const v16, -0x3f58a3d7    # -5.23f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x41400000    # 12.0f

    .line 321
    .line 322
    const/high16 v18, 0x41300000    # 11.0f

    .line 323
    .line 324
    const/high16 v13, 0x41000000    # 8.0f

    .line 325
    .line 326
    const v14, 0x41473333    # 12.45f

    .line 327
    .line 328
    .line 329
    const v15, 0x4120f5c3    # 10.06f

    .line 330
    .line 331
    .line 332
    const/high16 v16, 0x41300000    # 11.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41100000    # 9.0f

    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x3f400000    # -6.0f

    .line 346
    .line 347
    const v18, 0x40c4cccd    # 6.15f

    .line 348
    .line 349
    .line 350
    const v13, -0x3fb66666    # -3.15f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const/high16 v15, -0x3f400000    # -6.0f

    .line 355
    .line 356
    const v16, 0x401a3d71    # 2.41f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x40c00000    # 6.0f

    .line 363
    .line 364
    const v18, 0x410d999a    # 8.85f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, 0x401f5c29    # 2.49f

    .line 369
    .line 370
    .line 371
    const/high16 v15, 0x40000000    # 2.0f

    .line 372
    .line 373
    const v16, 0x40ae147b    # 5.44f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v18, -0x3ef26666    # -8.85f

    .line 380
    .line 381
    .line 382
    const/high16 v13, 0x40800000    # 4.0f

    .line 383
    .line 384
    const v14, -0x3fa5c28f    # -3.41f

    .line 385
    .line 386
    .line 387
    const/high16 v15, 0x40c00000    # 6.0f

    .line 388
    .line 389
    const v16, -0x3f347ae1    # -6.36f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x41400000    # 12.0f

    .line 396
    .line 397
    const/high16 v18, 0x41100000    # 9.0f

    .line 398
    .line 399
    const/high16 v13, 0x41900000    # 18.0f

    .line 400
    .line 401
    const v14, 0x41368f5c    # 11.41f

    .line 402
    .line 403
    .line 404
    const v15, 0x41726666    # 15.15f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x41100000    # 9.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41580000    # 13.5f

    .line 416
    .line 417
    const/high16 v2, 0x41700000    # 15.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x40400000    # -1.5f

    .line 423
    .line 424
    const/high16 v18, -0x40400000    # -1.5f

    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const v14, -0x40ab851f    # -0.83f

    .line 428
    .line 429
    .line 430
    const v15, -0x40d47ae1    # -0.67f

    .line 431
    .line 432
    .line 433
    const/high16 v16, -0x40400000    # -1.5f

    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 439
    .line 440
    const v13, -0x40ab851f    # -0.83f

    .line 441
    .line 442
    .line 443
    const/4 v14, 0x0

    .line 444
    const/high16 v15, -0x40400000    # -1.5f

    .line 445
    .line 446
    const v16, 0x3f2b851f    # 0.67f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3f547ae1    # 0.83f

    .line 456
    .line 457
    .line 458
    const v15, 0x3f2b851f    # 0.67f

    .line 459
    .line 460
    .line 461
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x41580000    # 13.5f

    .line 467
    .line 468
    const/high16 v18, 0x41700000    # 15.0f

    .line 469
    .line 470
    const v13, 0x414d47ae    # 12.83f

    .line 471
    .line 472
    .line 473
    const/high16 v14, 0x41840000    # 16.5f

    .line 474
    .line 475
    const/high16 v15, 0x41580000    # 13.5f

    .line 476
    .line 477
    const v16, 0x417d47ae    # 15.83f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/16 v16, 0x3800

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/high16 v6, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v8, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v7, 0x0

    .line 499
    const/high16 v9, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v12, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v13, 0x0

    .line 504
    const/4 v14, 0x0

    .line 505
    const/4 v15, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    sput-object v0, Landroidx/compose/material/icons/outlined/EmergencyShareKt;->_emergencyShare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 517
    .line 518
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    return-object v0
.end method
