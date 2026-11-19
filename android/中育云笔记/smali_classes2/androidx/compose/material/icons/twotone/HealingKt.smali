.class public final Landroidx/compose/material/icons/twotone/HealingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _healing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHealing(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HealingKt;->_healing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Healing"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x41507ae1    # 13.03f

    .line 71
    .line 72
    .line 73
    const v6, 0x4185c28f    # 16.72f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x406851ec    # 3.63f

    .line 80
    .line 81
    .line 82
    const v6, 0x4067ae14    # 3.62f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x3f97ae14    # -3.63f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3f9851ec    # -3.62f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v4, 0x406d70a4    # 3.71f

    .line 104
    .line 105
    .line 106
    const v6, 0x40e947ae    # 7.29f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x40eae148    # 7.34f

    .line 113
    .line 114
    .line 115
    const v6, 0x406a3d71    # 3.66f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x406851ec    # 3.63f

    .line 122
    .line 123
    .line 124
    const v6, 0x4067ae14    # 3.62f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x3f97ae14    # -3.63f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/16 v16, 0x3800

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const v6, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    const v8, 0x3e99999a    # 0.3f

    .line 151
    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    const/high16 v9, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/high16 v12, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    const-string v4, ""

    .line 162
    .line 163
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 164
    .line 165
    .line 166
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 171
    .line 172
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    const/4 v0, 0x0

    .line 177
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const v0, 0x418dd70a    # 17.73f

    .line 194
    .line 195
    .line 196
    const v2, 0x414051ec    # 12.02f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x3f8147ae    # -3.98f

    .line 203
    .line 204
    .line 205
    const v2, 0x407eb852    # 3.98f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v18, -0x404b851f    # -1.41f

    .line 214
    .line 215
    .line 216
    const v13, 0x3ec7ae14    # 0.39f

    .line 217
    .line 218
    .line 219
    const v14, -0x413851ec    # -0.39f

    .line 220
    .line 221
    .line 222
    const v15, 0x3ec7ae14    # 0.39f

    .line 223
    .line 224
    .line 225
    const v16, -0x407d70a4    # -1.02f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x3f751eb8    # -4.34f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x404b851f    # -1.41f

    .line 238
    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    const v13, -0x413851ec    # -0.39f

    .line 243
    .line 244
    .line 245
    const v15, -0x407d70a4    # -1.02f

    .line 246
    .line 247
    .line 248
    const v16, -0x413851ec    # -0.39f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x3f8147ae    # -3.98f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41000000    # 8.0f

    .line 261
    .line 262
    const v2, 0x40128f5c    # 2.29f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x40e947ae    # 7.29f

    .line 269
    .line 270
    .line 271
    const/high16 v18, 0x40000000    # 2.0f

    .line 272
    .line 273
    const v13, 0x40f9999a    # 7.8f

    .line 274
    .line 275
    .line 276
    const v14, 0x40066666    # 2.1f

    .line 277
    .line 278
    .line 279
    const v15, 0x40f1999a    # 7.55f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x40000000    # 2.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, -0x40cccccd    # -0.7f

    .line 288
    .line 289
    .line 290
    const v18, 0x3e947ae1    # 0.29f

    .line 291
    .line 292
    .line 293
    const/high16 v13, -0x41800000    # -0.25f

    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const v15, -0x40fd70a4    # -0.51f

    .line 297
    .line 298
    .line 299
    const v16, 0x3dcccccd    # 0.1f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x40d428f6    # 6.63f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x40100000    # 2.25f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const v18, 0x3fb47ae1    # 1.41f

    .line 316
    .line 317
    .line 318
    const v13, -0x413851ec    # -0.39f

    .line 319
    .line 320
    .line 321
    const v14, 0x3ec7ae14    # 0.39f

    .line 322
    .line 323
    .line 324
    const v15, -0x413851ec    # -0.39f

    .line 325
    .line 326
    .line 327
    const v16, 0x3f828f5c    # 1.02f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x407eb852    # 3.98f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41800000    # 16.0f

    .line 340
    .line 341
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x408ae148    # 4.34f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3fb47ae1    # 1.41f

    .line 354
    .line 355
    .line 356
    const/16 v18, 0x0

    .line 357
    .line 358
    const v13, 0x3ec7ae14    # 0.39f

    .line 359
    .line 360
    .line 361
    const v15, 0x3f828f5c    # 1.02f

    .line 362
    .line 363
    .line 364
    const v16, 0x3ec7ae14    # 0.39f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x3f8147ae    # -3.98f

    .line 371
    .line 372
    .line 373
    const v2, 0x407eb852    # 3.98f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x407eb852    # 3.98f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3f35c28f    # 0.71f

    .line 386
    .line 387
    .line 388
    const v18, 0x3e947ae1    # 0.29f

    .line 389
    .line 390
    .line 391
    const v13, 0x3e4ccccd    # 0.2f

    .line 392
    .line 393
    .line 394
    const v14, 0x3e4ccccd    # 0.2f

    .line 395
    .line 396
    .line 397
    const v15, 0x3ee66666    # 0.45f

    .line 398
    .line 399
    .line 400
    const v16, 0x3e947ae1    # 0.29f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3f35c28f    # 0.71f

    .line 407
    .line 408
    .line 409
    const v2, -0x416b851f    # -0.29f

    .line 410
    .line 411
    .line 412
    const v4, 0x3f028f5c    # 0.51f

    .line 413
    .line 414
    .line 415
    const v6, -0x42333333    # -0.1f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x408ae148    # 4.34f

    .line 422
    .line 423
    .line 424
    const v2, -0x3f751eb8    # -4.34f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const v18, -0x404b851f    # -1.41f

    .line 433
    .line 434
    .line 435
    const v13, 0x3ec7ae14    # 0.39f

    .line 436
    .line 437
    .line 438
    const v14, -0x413851ec    # -0.39f

    .line 439
    .line 440
    .line 441
    const v15, 0x3ec7ae14    # 0.39f

    .line 442
    .line 443
    .line 444
    const v16, -0x407d70a4    # -1.02f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x3f80a3d7    # -3.99f

    .line 451
    .line 452
    .line 453
    const v2, -0x3f8147ae    # -3.98f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41100000    # 9.0f

    .line 463
    .line 464
    const/high16 v2, 0x41400000    # 12.0f

    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v18, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const v13, 0x3f0ccccd    # 0.55f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const/high16 v15, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const v16, 0x3ee66666    # 0.45f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x4119999a    # -0.45f

    .line 486
    .line 487
    .line 488
    const/high16 v2, -0x40800000    # -1.0f

    .line 489
    .line 490
    const/high16 v4, 0x3f800000    # 1.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3ee66666    # 0.45f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x412f5c29    # 10.96f

    .line 508
    .line 509
    .line 510
    const v2, 0x40e947ae    # 7.29f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x40eae148    # 7.34f

    .line 517
    .line 518
    .line 519
    const v2, 0x406a3d71    # 3.66f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, -0x3f97ae14    # -3.63f

    .line 526
    .line 527
    .line 528
    const v2, 0x406851ec    # 3.63f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x4067ae14    # 3.62f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, -0x3f9851ec    # -3.62f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x41200000    # 10.0f

    .line 550
    .line 551
    const/high16 v2, 0x41500000    # 13.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, -0x40800000    # -1.0f

    .line 557
    .line 558
    const/high16 v18, -0x40800000    # -1.0f

    .line 559
    .line 560
    const v13, -0x40f33333    # -0.55f

    .line 561
    .line 562
    .line 563
    const/high16 v15, -0x40800000    # -1.0f

    .line 564
    .line 565
    const v16, -0x4119999a    # -0.45f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x3ee66666    # 0.45f

    .line 572
    .line 573
    .line 574
    const/high16 v2, -0x40800000    # -1.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x3f800000    # 1.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x4119999a    # -0.45f

    .line 585
    .line 586
    .line 587
    const/high16 v2, -0x40800000    # -1.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x41700000    # 15.0f

    .line 596
    .line 597
    const/high16 v2, 0x41400000    # 12.0f

    .line 598
    .line 599
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3ee66666    # 0.45f

    .line 606
    .line 607
    .line 608
    const/high16 v2, -0x40800000    # -1.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v2, 0x3f800000    # 1.0f

    .line 614
    .line 615
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, -0x4119999a    # -0.45f

    .line 619
    .line 620
    .line 621
    const/high16 v2, -0x40800000    # -1.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41600000    # 14.0f

    .line 630
    .line 631
    const/high16 v2, 0x41300000    # 11.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/high16 v18, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const v13, 0x3f0ccccd    # 0.55f

    .line 641
    .line 642
    .line 643
    const/high16 v15, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const v16, 0x3ee66666    # 0.45f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x4119999a    # -0.45f

    .line 652
    .line 653
    .line 654
    const/high16 v2, -0x40800000    # -1.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x3ee66666    # 0.45f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x418547ae    # 16.66f

    .line 672
    .line 673
    .line 674
    const v2, 0x41a2b852    # 20.34f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, -0x3f9851ec    # -3.62f

    .line 681
    .line 682
    .line 683
    const v2, -0x3f97ae14    # -3.63f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, -0x3f97ae14    # -3.63f

    .line 690
    .line 691
    .line 692
    const v2, 0x406851ec    # 3.63f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x4067ae14    # 3.62f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, -0x3f9851ec    # -3.62f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v16, 0x3800

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/high16 v8, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/high16 v12, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v13, 0x0

    .line 729
    const/4 v15, 0x0

    .line 730
    const-string v4, ""

    .line 731
    .line 732
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    sput-object v0, Landroidx/compose/material/icons/twotone/HealingKt;->_healing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 741
    .line 742
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    return-object v0
.end method
