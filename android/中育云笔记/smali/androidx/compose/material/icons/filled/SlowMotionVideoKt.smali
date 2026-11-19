.class public final Landroidx/compose/material/icons/filled/SlowMotionVideoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSlowMotionVideo(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SlowMotionVideo"

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, 0x411ca3d7    # 9.79f

    .line 111
    .line 112
    .line 113
    const v2, 0x4150cccd    # 13.05f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40f00000    # 7.5f

    .line 120
    .line 121
    const/high16 v2, 0x41200000    # 10.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x41100000    # 9.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3fed70a4    # -2.29f

    .line 132
    .line 133
    .line 134
    const v2, 0x40433333    # 3.05f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41800000    # 16.0f

    .line 141
    .line 142
    const/high16 v2, 0x41400000    # 12.0f

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
    const v0, 0x411ca3d7    # 9.79f

    .line 151
    .line 152
    .line 153
    const v2, 0x4150cccd    # 13.05f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40f00000    # 7.5f

    .line 160
    .line 161
    const/high16 v2, 0x41200000    # 10.0f

    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41100000    # 9.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3fed70a4    # -2.29f

    .line 172
    .line 173
    .line 174
    const v2, 0x40433333    # 3.05f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41800000    # 16.0f

    .line 181
    .line 182
    const/high16 v2, 0x41400000    # 12.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x40823d71    # 4.07f

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x41300000    # 11.0f

    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41300000    # 11.0f

    .line 199
    .line 200
    const v2, 0x40033333    # 2.05f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x3f55c28f    # -5.32f

    .line 207
    .line 208
    .line 209
    const v18, 0x400d70a4    # 2.21f

    .line 210
    .line 211
    .line 212
    const v13, -0x3fff5c29    # -2.01f

    .line 213
    .line 214
    .line 215
    const v14, 0x3e4ccccd    # 0.2f

    .line 216
    .line 217
    .line 218
    const v15, -0x3f8a3d71    # -3.84f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x3f800000    # 1.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x40b6147b    # 5.69f

    .line 227
    .line 228
    .line 229
    const v2, 0x40e33333    # 7.1f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x4079999a    # 3.9f

    .line 236
    .line 237
    .line 238
    const v18, -0x4030a3d7    # -1.62f

    .line 239
    .line 240
    .line 241
    const v13, 0x3f8e147b    # 1.11f

    .line 242
    .line 243
    .line 244
    const v14, -0x40a3d70a    # -0.86f

    .line 245
    .line 246
    .line 247
    const v15, 0x401c28f6    # 2.44f

    .line 248
    .line 249
    .line 250
    const v16, -0x4047ae14    # -1.44f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x408851ec    # 4.26f

    .line 263
    .line 264
    .line 265
    const v2, 0x40b5c28f    # 5.68f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x40033333    # 2.05f

    .line 272
    .line 273
    .line 274
    const/high16 v18, 0x41300000    # 11.0f

    .line 275
    .line 276
    const v13, 0x40433333    # 3.05f

    .line 277
    .line 278
    .line 279
    const v14, 0x40e51eb8    # 7.16f

    .line 280
    .line 281
    .line 282
    const/high16 v15, 0x40100000    # 2.25f

    .line 283
    .line 284
    const v16, 0x410fd70a    # 8.99f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x400147ae    # 2.02f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3fcf5c29    # 1.62f

    .line 297
    .line 298
    .line 299
    const v18, -0x3f866666    # -3.9f

    .line 300
    .line 301
    .line 302
    const v13, 0x3e3851ec    # 0.18f

    .line 303
    .line 304
    .line 305
    const v14, -0x40451eb8    # -1.46f

    .line 306
    .line 307
    .line 308
    const v15, 0x3f428f5c    # 0.76f

    .line 309
    .line 310
    .line 311
    const v16, -0x3fcd70a4    # -2.79f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41500000    # 13.0f

    .line 321
    .line 322
    const v2, 0x40823d71    # 4.07f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v2, 0x40033333    # 2.05f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x400d70a4    # 2.21f

    .line 335
    .line 336
    .line 337
    const v18, 0x40aa3d71    # 5.32f

    .line 338
    .line 339
    .line 340
    const v13, 0x3e4ccccd    # 0.2f

    .line 341
    .line 342
    .line 343
    const v14, 0x4000a3d7    # 2.01f

    .line 344
    .line 345
    .line 346
    const/high16 v15, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const v16, 0x4075c28f    # 3.84f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, -0x4048f5c3    # -1.43f

    .line 355
    .line 356
    .line 357
    const v2, 0x3fb70a3d    # 1.43f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x4030a3d7    # -1.62f

    .line 364
    .line 365
    .line 366
    const v18, -0x3f870a3d    # -3.89f

    .line 367
    .line 368
    .line 369
    const v13, -0x40a3d70a    # -0.86f

    .line 370
    .line 371
    .line 372
    const v14, -0x40733333    # -1.1f

    .line 373
    .line 374
    .line 375
    const v15, -0x4047ae14    # -1.44f

    .line 376
    .line 377
    .line 378
    const v16, -0x3fe47ae1    # -2.43f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x419deb85    # 19.74f

    .line 388
    .line 389
    .line 390
    const v2, 0x40b5c28f    # 5.68f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x41300000    # 11.0f

    .line 397
    .line 398
    const v18, 0x41af999a    # 21.95f

    .line 399
    .line 400
    .line 401
    const v13, 0x40e51eb8    # 7.16f

    .line 402
    .line 403
    .line 404
    const v14, 0x41a7999a    # 20.95f

    .line 405
    .line 406
    .line 407
    const/high16 v15, 0x41100000    # 9.0f

    .line 408
    .line 409
    const/high16 v16, 0x41ae0000    # 21.75f

    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x3ffeb852    # -2.02f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x3f866666    # -3.9f

    .line 421
    .line 422
    .line 423
    const v18, -0x4030a3d7    # -1.62f

    .line 424
    .line 425
    .line 426
    const v13, -0x40451eb8    # -1.46f

    .line 427
    .line 428
    .line 429
    const v14, -0x41c7ae14    # -0.18f

    .line 430
    .line 431
    .line 432
    const v15, -0x3fcd70a4    # -2.79f

    .line 433
    .line 434
    .line 435
    const v16, -0x40bd70a4    # -0.76f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x404a3d71    # -1.42f

    .line 442
    .line 443
    .line 444
    const v2, 0x3fb70a3d    # 1.43f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41b00000    # 22.0f

    .line 454
    .line 455
    const/high16 v2, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x3ef0cccd    # -8.95f

    .line 461
    .line 462
    .line 463
    const v18, 0x411f3333    # 9.95f

    .line 464
    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, 0x40a51eb8    # 5.16f

    .line 468
    .line 469
    .line 470
    const v15, -0x3f851eb8    # -3.92f

    .line 471
    .line 472
    .line 473
    const v16, 0x4116b852    # 9.42f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, -0x3ffeb852    # -2.02f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x41a00000    # 20.0f

    .line 486
    .line 487
    const/high16 v18, 0x41400000    # 12.0f

    .line 488
    .line 489
    const v13, 0x4187c28f    # 16.97f

    .line 490
    .line 491
    .line 492
    const v14, 0x419b47ae    # 19.41f

    .line 493
    .line 494
    .line 495
    const/high16 v15, 0x41a00000    # 20.0f

    .line 496
    .line 497
    const v16, 0x41806666    # 16.05f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x3f21999a    # -6.95f

    .line 504
    .line 505
    .line 506
    const v2, -0x3f023d71    # -7.93f

    .line 507
    .line 508
    .line 509
    const v4, -0x3fbe147b    # -3.03f

    .line 510
    .line 511
    .line 512
    const v6, -0x3f12e148    # -7.41f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x40033333    # 2.05f

    .line 519
    .line 520
    .line 521
    const v2, 0x4150cccd    # 13.05f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, 0x41b00000    # 22.0f

    .line 528
    .line 529
    const v13, 0x4190a3d7    # 18.08f

    .line 530
    .line 531
    .line 532
    const v14, 0x40251eb8    # 2.58f

    .line 533
    .line 534
    .line 535
    const/high16 v15, 0x41b00000    # 22.0f

    .line 536
    .line 537
    const v16, 0x40dae148    # 6.84f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    const/16 v16, 0x3800

    .line 551
    .line 552
    const/16 v17, 0x0

    .line 553
    .line 554
    const/high16 v6, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/high16 v8, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/4 v7, 0x0

    .line 559
    const/high16 v9, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v12, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const/4 v14, 0x0

    .line 565
    const/4 v15, 0x0

    .line 566
    const-string v4, ""

    .line 567
    .line 568
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    sput-object v0, Landroidx/compose/material/icons/filled/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    return-object v0
.end method
