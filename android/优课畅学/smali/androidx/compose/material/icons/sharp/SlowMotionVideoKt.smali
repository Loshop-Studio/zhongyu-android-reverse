.class public final Landroidx/compose/material/icons/sharp/SlowMotionVideoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSlowMotionVideo(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.SlowMotionVideo"

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
    const v0, 0x411ca3d7    # 9.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x4150cccd    # 13.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40f00000    # 7.5f

    .line 80
    .line 81
    const/high16 v2, 0x41200000    # 10.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x41100000    # 9.0f

    .line 87
    .line 88
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, -0x3fed70a4    # -2.29f

    .line 92
    .line 93
    .line 94
    const v2, 0x40433333    # 3.05f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41800000    # 16.0f

    .line 101
    .line 102
    const/high16 v2, 0x41400000    # 12.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, -0x3ff28f5c    # -2.21f

    .line 108
    .line 109
    .line 110
    const v2, -0x3fc33333    # -2.95f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x411ca3d7    # 9.79f

    .line 120
    .line 121
    .line 122
    const v2, 0x4150cccd    # 13.05f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40f00000    # 7.5f

    .line 129
    .line 130
    const/high16 v2, 0x41200000    # 10.0f

    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41100000    # 9.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, -0x3fed70a4    # -2.29f

    .line 141
    .line 142
    .line 143
    const v2, 0x40433333    # 3.05f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41800000    # 16.0f

    .line 150
    .line 151
    const/high16 v2, 0x41400000    # 12.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, -0x3ff28f5c    # -2.21f

    .line 157
    .line 158
    .line 159
    const v2, -0x3fc33333    # -2.95f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x411ca3d7    # 9.79f

    .line 169
    .line 170
    .line 171
    const v2, 0x4150cccd    # 13.05f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x40f00000    # 7.5f

    .line 178
    .line 179
    const/high16 v2, 0x41200000    # 10.0f

    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v0, 0x41100000    # 9.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x3fed70a4    # -2.29f

    .line 190
    .line 191
    .line 192
    const v2, 0x40433333    # 3.05f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41800000    # 16.0f

    .line 199
    .line 200
    const/high16 v2, 0x41400000    # 12.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x3ff28f5c    # -2.21f

    .line 206
    .line 207
    .line 208
    const v2, -0x3fc33333    # -2.95f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x40823d71    # 4.07f

    .line 218
    .line 219
    .line 220
    const/high16 v2, 0x41300000    # 11.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41300000    # 11.0f

    .line 226
    .line 227
    const v2, 0x40033333    # 2.05f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x3f55c28f    # -5.32f

    .line 234
    .line 235
    .line 236
    const v18, 0x400d70a4    # 2.21f

    .line 237
    .line 238
    .line 239
    const v13, -0x3fff5c29    # -2.01f

    .line 240
    .line 241
    .line 242
    const v14, 0x3e4ccccd    # 0.2f

    .line 243
    .line 244
    .line 245
    const v15, -0x3f8a3d71    # -3.84f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x40b6147b    # 5.69f

    .line 254
    .line 255
    .line 256
    const v2, 0x40e33333    # 7.1f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x4079999a    # 3.9f

    .line 263
    .line 264
    .line 265
    const v18, -0x4030a3d7    # -1.62f

    .line 266
    .line 267
    .line 268
    const v13, 0x3f8e147b    # 1.11f

    .line 269
    .line 270
    .line 271
    const v14, -0x40a3d70a    # -0.86f

    .line 272
    .line 273
    .line 274
    const v15, 0x401c28f6    # 2.44f

    .line 275
    .line 276
    .line 277
    const v16, -0x4047ae14    # -1.44f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x408851ec    # 4.26f

    .line 290
    .line 291
    .line 292
    const v2, 0x40b5c28f    # 5.68f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x40033333    # 2.05f

    .line 299
    .line 300
    .line 301
    const/high16 v18, 0x41300000    # 11.0f

    .line 302
    .line 303
    const v13, 0x40433333    # 3.05f

    .line 304
    .line 305
    .line 306
    const v14, 0x40e51eb8    # 7.16f

    .line 307
    .line 308
    .line 309
    const/high16 v15, 0x40100000    # 2.25f

    .line 310
    .line 311
    const v16, 0x410fd70a    # 8.99f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x400147ae    # 2.02f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x3fcf5c29    # 1.62f

    .line 324
    .line 325
    .line 326
    const v18, -0x3f866666    # -3.9f

    .line 327
    .line 328
    .line 329
    const v13, 0x3e3851ec    # 0.18f

    .line 330
    .line 331
    .line 332
    const v14, -0x40451eb8    # -1.46f

    .line 333
    .line 334
    .line 335
    const v15, 0x3f428f5c    # 0.76f

    .line 336
    .line 337
    .line 338
    const v16, -0x3fcd70a4    # -2.79f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41500000    # 13.0f

    .line 348
    .line 349
    const v2, 0x40823d71    # 4.07f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v2, 0x40033333    # 2.05f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x400d70a4    # 2.21f

    .line 362
    .line 363
    .line 364
    const v18, 0x40aa3d71    # 5.32f

    .line 365
    .line 366
    .line 367
    const v13, 0x3e4ccccd    # 0.2f

    .line 368
    .line 369
    .line 370
    const v14, 0x4000a3d7    # 2.01f

    .line 371
    .line 372
    .line 373
    const/high16 v15, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const v16, 0x4075c28f    # 3.84f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x4048f5c3    # -1.43f

    .line 382
    .line 383
    .line 384
    const v2, 0x3fb70a3d    # 1.43f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x4030a3d7    # -1.62f

    .line 391
    .line 392
    .line 393
    const v18, -0x3f870a3d    # -3.89f

    .line 394
    .line 395
    .line 396
    const v13, -0x40a3d70a    # -0.86f

    .line 397
    .line 398
    .line 399
    const v14, -0x40733333    # -1.1f

    .line 400
    .line 401
    .line 402
    const v15, -0x4047ae14    # -1.44f

    .line 403
    .line 404
    .line 405
    const v16, -0x3fe47ae1    # -2.43f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x419deb85    # 19.74f

    .line 415
    .line 416
    .line 417
    const v2, 0x40b5c28f    # 5.68f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41300000    # 11.0f

    .line 424
    .line 425
    const v18, 0x41af999a    # 21.95f

    .line 426
    .line 427
    .line 428
    const v13, 0x40e51eb8    # 7.16f

    .line 429
    .line 430
    .line 431
    const v14, 0x41a7999a    # 20.95f

    .line 432
    .line 433
    .line 434
    const/high16 v15, 0x41100000    # 9.0f

    .line 435
    .line 436
    const/high16 v16, 0x41ae0000    # 21.75f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x3ffeb852    # -2.02f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x3f866666    # -3.9f

    .line 448
    .line 449
    .line 450
    const v18, -0x4030a3d7    # -1.62f

    .line 451
    .line 452
    .line 453
    const v13, -0x40451eb8    # -1.46f

    .line 454
    .line 455
    .line 456
    const v14, -0x41c7ae14    # -0.18f

    .line 457
    .line 458
    .line 459
    const v15, -0x3fcd70a4    # -2.79f

    .line 460
    .line 461
    .line 462
    const v16, -0x40bd70a4    # -0.76f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x404a3d71    # -1.42f

    .line 469
    .line 470
    .line 471
    const v2, 0x3fb70a3d    # 1.43f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41b00000    # 22.0f

    .line 481
    .line 482
    const/high16 v2, 0x41400000    # 12.0f

    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x3ef0cccd    # -8.95f

    .line 488
    .line 489
    .line 490
    const v18, 0x411f3333    # 9.95f

    .line 491
    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const v14, 0x40a51eb8    # 5.16f

    .line 495
    .line 496
    .line 497
    const v15, -0x3f851eb8    # -3.92f

    .line 498
    .line 499
    .line 500
    const v16, 0x4116b852    # 9.42f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x3ffeb852    # -2.02f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, 0x41a00000    # 20.0f

    .line 513
    .line 514
    const/high16 v18, 0x41400000    # 12.0f

    .line 515
    .line 516
    const v13, 0x4187c28f    # 16.97f

    .line 517
    .line 518
    .line 519
    const v14, 0x419b47ae    # 19.41f

    .line 520
    .line 521
    .line 522
    const/high16 v15, 0x41a00000    # 20.0f

    .line 523
    .line 524
    const v16, 0x41806666    # 16.05f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, -0x3f21999a    # -6.95f

    .line 531
    .line 532
    .line 533
    const v2, -0x3f023d71    # -7.93f

    .line 534
    .line 535
    .line 536
    const v4, -0x3fbe147b    # -3.03f

    .line 537
    .line 538
    .line 539
    const v6, -0x3f12e148    # -7.41f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x40033333    # 2.05f

    .line 546
    .line 547
    .line 548
    const v2, 0x4150cccd    # 13.05f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x41b00000    # 22.0f

    .line 555
    .line 556
    const v13, 0x4190a3d7    # 18.08f

    .line 557
    .line 558
    .line 559
    const v14, 0x40251eb8    # 2.58f

    .line 560
    .line 561
    .line 562
    const/high16 v15, 0x41b00000    # 22.0f

    .line 563
    .line 564
    const v16, 0x40dae148    # 6.84f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const/16 v16, 0x3800

    .line 578
    .line 579
    const/16 v17, 0x0

    .line 580
    .line 581
    const/high16 v6, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/high16 v8, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const/high16 v9, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/high16 v12, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const/4 v14, 0x0

    .line 592
    const/4 v15, 0x0

    .line 593
    const-string v4, ""

    .line 594
    .line 595
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    sput-object v0, Landroidx/compose/material/icons/sharp/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 604
    .line 605
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    return-object v0
.end method
