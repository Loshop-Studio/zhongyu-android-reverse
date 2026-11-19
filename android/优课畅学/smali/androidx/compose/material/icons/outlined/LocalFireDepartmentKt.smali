.class public final Landroidx/compose/material/icons/outlined/LocalFireDepartmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFireDepartment(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LocalFireDepartment"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x411eb852    # -0.44f

    .line 78
    .line 79
    .line 80
    const v2, 0x3f0ccccd    # 0.55f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v17, -0x403ae148    # -1.54f

    .line 87
    .line 88
    .line 89
    const/high16 v18, 0x3f400000    # 0.75f

    .line 90
    .line 91
    const v13, -0x4128f5c3    # -0.42f

    .line 92
    .line 93
    .line 94
    const v14, 0x3f051eb8    # 0.52f

    .line 95
    .line 96
    .line 97
    const v15, -0x40851eb8    # -0.98f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x3f400000    # 0.75f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41400000    # 12.0f

    .line 106
    .line 107
    const v18, 0x40a9999a    # 5.3f

    .line 108
    .line 109
    .line 110
    const/high16 v13, 0x41500000    # 13.0f

    .line 111
    .line 112
    const v14, 0x40e9999a    # 7.3f

    .line 113
    .line 114
    .line 115
    const/high16 v15, 0x41400000    # 12.0f

    .line 116
    .line 117
    const v16, 0x40d0a3d7    # 6.52f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40000000    # 2.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const/high16 v18, 0x41300000    # 11.0f

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const/4 v14, 0x0

    .line 134
    const/high16 v15, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const/high16 v16, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x41000000    # 8.0f

    .line 142
    .line 143
    const/high16 v18, 0x41000000    # 8.0f

    .line 144
    .line 145
    const v14, 0x408d70a4    # 4.42f

    .line 146
    .line 147
    .line 148
    const v15, 0x40651eb8    # 3.58f

    .line 149
    .line 150
    .line 151
    const/high16 v16, 0x41000000    # 8.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, -0x3f9ae148    # -3.58f

    .line 157
    .line 158
    .line 159
    const/high16 v2, -0x3f000000    # -8.0f

    .line 160
    .line 161
    const/high16 v4, 0x41000000    # 8.0f

    .line 162
    .line 163
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x41800000    # 16.0f

    .line 167
    .line 168
    const/high16 v18, 0x40c00000    # 6.0f

    .line 169
    .line 170
    const/high16 v13, 0x41a00000    # 20.0f

    .line 171
    .line 172
    const v14, 0x4120a3d7    # 10.04f

    .line 173
    .line 174
    .line 175
    const v15, 0x41931eb8    # 18.39f

    .line 176
    .line 177
    .line 178
    const v16, 0x40ec28f6    # 7.38f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41980000    # 19.0f

    .line 188
    .line 189
    const/high16 v2, 0x41400000    # 12.0f

    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, -0x40000000    # -2.0f

    .line 195
    .line 196
    const v18, -0x4007ae14    # -1.94f

    .line 197
    .line 198
    .line 199
    const v13, -0x40733333    # -1.1f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const/high16 v15, -0x40000000    # -2.0f

    .line 204
    .line 205
    const v16, -0x40a147ae    # -0.87f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3f147ae1    # 0.58f

    .line 212
    .line 213
    .line 214
    const v18, -0x4051eb85    # -1.36f

    .line 215
    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, -0x40fd70a4    # -0.51f

    .line 219
    .line 220
    .line 221
    const v15, 0x3e4ccccd    # 0.2f

    .line 222
    .line 223
    .line 224
    const v16, -0x40828f5c    # -0.99f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x3fb5c28f    # 1.42f

    .line 231
    .line 232
    .line 233
    const v2, -0x404ccccd    # -1.4f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x3fb70a3d    # 1.43f

    .line 240
    .line 241
    .line 242
    const v2, 0x3fb33333    # 1.4f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x41600000    # 14.0f

    .line 249
    .line 250
    const v18, 0x41887ae1    # 17.06f

    .line 251
    .line 252
    .line 253
    const v13, 0x415ccccd    # 13.8f

    .line 254
    .line 255
    .line 256
    const v14, 0x41808f5c    # 16.07f

    .line 257
    .line 258
    .line 259
    const/high16 v15, 0x41600000    # 14.0f

    .line 260
    .line 261
    const v16, 0x41846666    # 16.55f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, 0x41400000    # 12.0f

    .line 268
    .line 269
    const/high16 v18, 0x41980000    # 19.0f

    .line 270
    .line 271
    const/high16 v13, 0x41600000    # 14.0f

    .line 272
    .line 273
    const v14, 0x41910a3d    # 18.13f

    .line 274
    .line 275
    .line 276
    const v15, 0x4151999a    # 13.1f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x41980000    # 19.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x418c0000    # 17.5f

    .line 288
    .line 289
    const v2, 0x417f5c29    # 15.96f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x406f5c29    # -1.13f

    .line 299
    .line 300
    .line 301
    const v18, -0x3fb1eb85    # -3.22f

    .line 302
    .line 303
    .line 304
    const v13, 0x3d23d70a    # 0.04f

    .line 305
    .line 306
    .line 307
    const v14, -0x4147ae14    # -0.36f

    .line 308
    .line 309
    .line 310
    const v15, 0x3e6147ae    # 0.22f

    .line 311
    .line 312
    .line 313
    const v16, -0x400e147b    # -1.89f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/4 v0, 0x0

    .line 320
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41380000    # 11.5f

    .line 324
    .line 325
    const/high16 v2, 0x41400000    # 12.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x3fcae148    # -2.83f

    .line 331
    .line 332
    .line 333
    const v2, 0x4031eb85    # 2.78f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/4 v0, 0x0

    .line 340
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v18, 0x404e147b    # 3.22f

    .line 344
    .line 345
    .line 346
    const v13, -0x4051eb85    # -1.36f

    .line 347
    .line 348
    .line 349
    const v14, 0x3fab851f    # 1.34f

    .line 350
    .line 351
    .line 352
    const v15, -0x406a3d71    # -1.17f

    .line 353
    .line 354
    .line 355
    const v16, 0x403851ec    # 2.88f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x40c00000    # 6.0f

    .line 362
    .line 363
    const/high16 v18, 0x41500000    # 13.0f

    .line 364
    .line 365
    const v13, 0x40d947ae    # 6.79f

    .line 366
    .line 367
    .line 368
    const v14, 0x41833333    # 16.4f

    .line 369
    .line 370
    .line 371
    const/high16 v15, 0x40c00000    # 6.0f

    .line 372
    .line 373
    const v16, 0x416ca3d7    # 14.79f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x4080f5c3    # 4.03f

    .line 380
    .line 381
    .line 382
    const/high16 v18, -0x3f180000    # -7.25f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, -0x3fb5c28f    # -3.16f

    .line 386
    .line 387
    .line 388
    const v15, 0x400851ec    # 2.13f

    .line 389
    .line 390
    .line 391
    const v16, -0x3f4b3333    # -5.65f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x407f5c29    # 3.99f

    .line 398
    .line 399
    .line 400
    const v18, 0x40633333    # 3.55f

    .line 401
    .line 402
    .line 403
    const v13, 0x3e6b851f    # 0.23f

    .line 404
    .line 405
    .line 406
    const v14, 0x3ffeb852    # 1.99f

    .line 407
    .line 408
    .line 409
    const v15, 0x3ff70a3d    # 1.93f

    .line 410
    .line 411
    .line 412
    const v16, 0x40633333    # 3.55f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x400b851f    # 2.18f

    .line 419
    .line 420
    .line 421
    const v18, -0x40d70a3d    # -0.66f

    .line 422
    .line 423
    .line 424
    const v13, 0x3f47ae14    # 0.78f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const v15, 0x3fc51eb8    # 1.54f

    .line 429
    .line 430
    .line 431
    const v16, -0x41947ae1    # -0.23f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x41900000    # 18.0f

    .line 438
    .line 439
    const/high16 v18, 0x41500000    # 13.0f

    .line 440
    .line 441
    const v13, 0x418ab852    # 17.34f

    .line 442
    .line 443
    .line 444
    const v14, 0x411c7ae1    # 9.78f

    .line 445
    .line 446
    .line 447
    const/high16 v15, 0x41900000    # 18.0f

    .line 448
    .line 449
    const v16, 0x4135999a    # 11.35f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x417f5c29    # 15.96f

    .line 456
    .line 457
    .line 458
    const/high16 v18, 0x418c0000    # 17.5f

    .line 459
    .line 460
    const/high16 v13, 0x41900000    # 18.0f

    .line 461
    .line 462
    const v14, 0x416ca3d7    # 14.79f

    .line 463
    .line 464
    .line 465
    const v15, 0x4189ae14    # 17.21f

    .line 466
    .line 467
    .line 468
    const v16, 0x41833333    # 16.4f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const/16 v16, 0x3800

    .line 482
    .line 483
    const/16 v17, 0x0

    .line 484
    .line 485
    const/high16 v6, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/high16 v8, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/high16 v9, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v12, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const/4 v14, 0x0

    .line 496
    const/4 v15, 0x0

    .line 497
    const-string v4, ""

    .line 498
    .line 499
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    sput-object v0, Landroidx/compose/material/icons/outlined/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 508
    .line 509
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    return-object v0
.end method
