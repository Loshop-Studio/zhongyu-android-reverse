.class public final Landroidx/compose/material/icons/rounded/LocalActivityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalActivity(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalActivityKt;->_localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalActivity"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3f87ae14    # 1.06f

    .line 78
    .line 79
    .line 80
    const v18, -0x401eb852    # -1.76f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x40bd70a4    # -0.76f

    .line 85
    .line 86
    .line 87
    const v15, 0x3edc28f6    # 0.43f

    .line 88
    .line 89
    .line 90
    const v16, -0x404a3d71    # -1.42f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3f70a3d7    # 0.94f

    .line 97
    .line 98
    .line 99
    const v18, -0x40266666    # -1.7f

    .line 100
    .line 101
    .line 102
    const v13, 0x3f19999a    # 0.6f

    .line 103
    .line 104
    .line 105
    const v14, -0x41570a3d    # -0.33f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f70a3d7    # 0.94f

    .line 109
    .line 110
    .line 111
    const v16, -0x407eb852    # -1.01f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41b00000    # 22.0f

    .line 118
    .line 119
    const/high16 v2, 0x40c00000    # 6.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, -0x40000000    # -2.0f

    .line 125
    .line 126
    const/high16 v18, -0x40000000    # -2.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, -0x40733333    # -1.1f

    .line 130
    .line 131
    .line 132
    const v15, -0x4099999a    # -0.9f

    .line 133
    .line 134
    .line 135
    const/high16 v16, -0x40000000    # -2.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x40800000    # 4.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x400147ae    # -1.99f

    .line 146
    .line 147
    .line 148
    const v18, 0x3ffeb852    # 1.99f

    .line 149
    .line 150
    .line 151
    const v13, -0x40733333    # -1.1f

    .line 152
    .line 153
    .line 154
    const/4 v14, 0x0

    .line 155
    const v15, -0x400147ae    # -1.99f

    .line 156
    .line 157
    .line 158
    const v16, 0x3f63d70a    # 0.89f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x40233333    # 2.55f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, 0x3f70a3d7    # 0.94f

    .line 171
    .line 172
    .line 173
    const v18, 0x3fd851ec    # 1.69f

    .line 174
    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const v14, 0x3f30a3d7    # 0.69f

    .line 178
    .line 179
    .line 180
    const v15, 0x3ea8f5c3    # 0.33f

    .line 181
    .line 182
    .line 183
    const v16, 0x3faf5c29    # 1.37f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x40800000    # 4.0f

    .line 190
    .line 191
    const/high16 v18, 0x41400000    # 12.0f

    .line 192
    .line 193
    const v13, 0x40651eb8    # 3.58f

    .line 194
    .line 195
    .line 196
    const v14, 0x412947ae    # 10.58f

    .line 197
    .line 198
    .line 199
    const/high16 v15, 0x40800000    # 4.0f

    .line 200
    .line 201
    const v16, 0x4133d70a    # 11.24f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x407851ec    # -1.06f

    .line 208
    .line 209
    .line 210
    const v2, 0x3fe147ae    # 1.76f

    .line 211
    .line 212
    .line 213
    const v4, -0x4123d70a    # -0.43f

    .line 214
    .line 215
    .line 216
    const v6, 0x3fb70a3d    # 1.43f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x408f5c29    # -0.94f

    .line 223
    .line 224
    .line 225
    const v18, 0x3fd9999a    # 1.7f

    .line 226
    .line 227
    .line 228
    const v13, -0x40e66666    # -0.6f

    .line 229
    .line 230
    .line 231
    const v14, 0x3ea8f5c3    # 0.33f

    .line 232
    .line 233
    .line 234
    const v15, -0x408f5c29    # -0.94f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f8147ae    # 1.01f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40000000    # 2.0f

    .line 244
    .line 245
    const/high16 v2, 0x41900000    # 18.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x40000000    # 2.0f

    .line 251
    .line 252
    const/high16 v18, 0x40000000    # 2.0f

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const v14, 0x3f8ccccd    # 1.1f

    .line 256
    .line 257
    .line 258
    const v15, 0x3f666666    # 0.9f

    .line 259
    .line 260
    .line 261
    const/high16 v16, 0x40000000    # 2.0f

    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41800000    # 16.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v18, -0x40000000    # -2.0f

    .line 272
    .line 273
    const v13, 0x3f8ccccd    # 1.1f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, 0x40000000    # 2.0f

    .line 278
    .line 279
    const v16, -0x4099999a    # -0.9f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, -0x3fdd70a4    # -2.54f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x408f5c29    # -0.94f

    .line 292
    .line 293
    .line 294
    const v18, -0x40266666    # -1.7f

    .line 295
    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const v14, -0x40cf5c29    # -0.69f

    .line 299
    .line 300
    .line 301
    const v15, -0x4151eb85    # -0.34f

    .line 302
    .line 303
    .line 304
    const v16, -0x4050a3d7    # -1.37f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x407851ec    # -1.06f

    .line 311
    .line 312
    .line 313
    const v18, -0x401eb852    # -1.76f

    .line 314
    .line 315
    .line 316
    const v13, -0x40deb852    # -0.63f

    .line 317
    .line 318
    .line 319
    const v14, -0x4151eb85    # -0.34f

    .line 320
    .line 321
    .line 322
    const v15, -0x407851ec    # -1.06f

    .line 323
    .line 324
    .line 325
    const/high16 v16, -0x40800000    # -1.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x4180cccd    # 16.1f

    .line 334
    .line 335
    .line 336
    const/high16 v2, 0x41680000    # 14.5f

    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41680000    # 14.5f

    .line 342
    .line 343
    const/high16 v2, 0x41400000    # 12.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 349
    .line 350
    const v2, 0x3fce147b    # 1.61f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, -0x40c00000    # -0.75f

    .line 357
    .line 358
    const v18, -0x40f33333    # -0.55f

    .line 359
    .line 360
    .line 361
    const v13, -0x413d70a4    # -0.38f

    .line 362
    .line 363
    .line 364
    const v14, 0x3e75c28f    # 0.24f

    .line 365
    .line 366
    .line 367
    const v15, -0x40a147ae    # -0.87f

    .line 368
    .line 369
    .line 370
    const v16, -0x421eb852    # -0.11f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x3f400000    # 0.75f

    .line 377
    .line 378
    const v2, -0x3fc7ae14    # -2.88f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x400f5c29    # -1.88f

    .line 385
    .line 386
    .line 387
    const v2, -0x3feccccd    # -2.3f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, 0x3e947ae1    # 0.29f

    .line 394
    .line 395
    .line 396
    const v18, -0x409c28f6    # -0.89f

    .line 397
    .line 398
    .line 399
    const v13, -0x414ccccd    # -0.35f

    .line 400
    .line 401
    .line 402
    const v14, -0x416b851f    # -0.29f

    .line 403
    .line 404
    .line 405
    const v15, -0x41d1eb85    # -0.17f

    .line 406
    .line 407
    .line 408
    const v16, -0x40a3d70a    # -0.86f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x41d1eb85    # -0.17f

    .line 415
    .line 416
    .line 417
    const v2, 0x403d70a4    # 2.96f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, -0x3fd00000    # -2.75f

    .line 424
    .line 425
    const v2, 0x3f8a3d71    # 1.08f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x3f6e147b    # 0.93f

    .line 432
    .line 433
    .line 434
    const/16 v18, 0x0

    .line 435
    .line 436
    const v13, 0x3e2e147b    # 0.17f

    .line 437
    .line 438
    .line 439
    const v14, -0x4128f5c3    # -0.42f

    .line 440
    .line 441
    .line 442
    const v15, 0x3f451eb8    # 0.77f

    .line 443
    .line 444
    .line 445
    const v16, -0x4128f5c3    # -0.42f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x4030a3d7    # 2.76f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3e2e147b    # 0.17f

    .line 458
    .line 459
    .line 460
    const v2, 0x403d70a4    # 2.96f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x3e947ae1    # 0.29f

    .line 467
    .line 468
    .line 469
    const v18, 0x3f63d70a    # 0.89f

    .line 470
    .line 471
    .line 472
    const v13, 0x3ee66666    # 0.45f

    .line 473
    .line 474
    .line 475
    const v14, 0x3cf5c28f    # 0.03f

    .line 476
    .line 477
    .line 478
    const v15, 0x3f23d70a    # 0.64f

    .line 479
    .line 480
    .line 481
    const v16, 0x3f19999a    # 0.6f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x3ff0a3d7    # 1.88f

    .line 488
    .line 489
    .line 490
    const v2, -0x3feccccd    # -2.3f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x3f428f5c    # 0.76f

    .line 497
    .line 498
    .line 499
    const v2, 0x40370a3d    # 2.86f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, -0x40c00000    # -0.75f

    .line 506
    .line 507
    const v18, 0x3f0ccccd    # 0.55f

    .line 508
    .line 509
    .line 510
    const v13, 0x3df5c28f    # 0.12f

    .line 511
    .line 512
    .line 513
    const v14, 0x3ee66666    # 0.45f

    .line 514
    .line 515
    .line 516
    const v15, -0x41428f5c    # -0.37f

    .line 517
    .line 518
    .line 519
    const v16, 0x3f4ccccd    # 0.8f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    const/16 v16, 0x3800

    .line 533
    .line 534
    const/16 v17, 0x0

    .line 535
    .line 536
    const/high16 v6, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/high16 v8, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const/high16 v9, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v12, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const/4 v14, 0x0

    .line 547
    const/4 v15, 0x0

    .line 548
    const-string v4, ""

    .line 549
    .line 550
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalActivityKt;->_localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-object v0
.end method
