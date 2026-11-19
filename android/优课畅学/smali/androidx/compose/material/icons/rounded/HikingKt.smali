.class public final Landroidx/compose/material/icons/rounded/HikingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hiking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHiking(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HikingKt;->_hiking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Hiking"

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
    const/high16 v0, 0x40b00000    # 5.5f

    .line 71
    .line 72
    const/high16 v2, 0x41580000    # 13.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x41466666    # 12.4f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40b00000    # 5.5f

    .line 115
    .line 116
    const/high16 v4, 0x41580000    # 13.5f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41920000    # 18.25f

    .line 125
    .line 126
    const/high16 v2, 0x41100000    # 9.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, -0x40c00000    # -0.75f

    .line 132
    .line 133
    const/high16 v18, 0x3f400000    # 0.75f

    .line 134
    .line 135
    const v13, -0x412e147b    # -0.41f

    .line 136
    .line 137
    .line 138
    const/high16 v15, -0x40c00000    # -0.75f

    .line 139
    .line 140
    const v16, 0x3eae147b    # 0.34f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    const v2, 0x3f83d70a    # 1.03f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x3fcccccd    # -2.8f

    .line 154
    .line 155
    .line 156
    const v18, -0x3ff47ae1    # -2.18f

    .line 157
    .line 158
    .line 159
    const v13, -0x40628f5c    # -1.23f

    .line 160
    .line 161
    .line 162
    const v14, -0x41428f5c    # -0.37f

    .line 163
    .line 164
    .line 165
    const v15, -0x3ff1eb85    # -2.22f

    .line 166
    .line 167
    .line 168
    const v16, -0x406a3d71    # -1.17f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, -0x40333333    # -1.6f

    .line 175
    .line 176
    .line 177
    const/high16 v2, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x40147ae1    # -1.84f

    .line 183
    .line 184
    .line 185
    const/high16 v18, -0x40800000    # -1.0f

    .line 186
    .line 187
    const v13, -0x412e147b    # -0.41f

    .line 188
    .line 189
    .line 190
    const v14, -0x40d9999a    # -0.65f

    .line 191
    .line 192
    .line 193
    const v15, -0x4071eb85    # -1.11f

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
    const v17, -0x401c28f6    # -1.78f

    .line 202
    .line 203
    .line 204
    const v18, 0x3fb851ec    # 1.44f

    .line 205
    .line 206
    .line 207
    const v13, -0x40b851ec    # -0.78f

    .line 208
    .line 209
    .line 210
    const/4 v14, 0x0

    .line 211
    const v15, -0x40347ae1    # -1.59f

    .line 212
    .line 213
    .line 214
    const/high16 v16, 0x3f000000    # 0.5f

    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x40e80000    # 7.25f

    .line 220
    .line 221
    const v2, 0x41ae147b    # 21.76f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x410451ec    # 8.27f

    .line 228
    .line 229
    .line 230
    const/high16 v18, 0x41b80000    # 23.0f

    .line 231
    .line 232
    const v13, 0x40e3d70a    # 7.12f

    .line 233
    .line 234
    .line 235
    const v14, 0x41b33333    # 22.4f

    .line 236
    .line 237
    .line 238
    const v15, 0x40f3851f    # 7.61f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x41b80000    # 23.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x3f828f5c    # 1.02f

    .line 247
    .line 248
    .line 249
    const v18, -0x40b0a3d7    # -0.81f

    .line 250
    .line 251
    .line 252
    const v13, 0x3efae148    # 0.49f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, 0x3f68f5c3    # 0.91f

    .line 257
    .line 258
    .line 259
    const v16, -0x4151eb85    # -0.34f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x412e6666    # 10.9f

    .line 266
    .line 267
    .line 268
    const/high16 v2, 0x41700000    # 15.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x40066666    # 2.1f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x40000000    # 2.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40a00000    # 5.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v18, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, 0x3f0ccccd    # 0.55f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x4119999a    # -0.45f

    .line 303
    .line 304
    .line 305
    const/high16 v2, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v4, -0x40800000    # -1.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x3f4b851f    # -5.64f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x40e147ae    # -0.62f

    .line 319
    .line 320
    .line 321
    const v18, -0x40466666    # -1.45f

    .line 322
    .line 323
    .line 324
    const v14, -0x40f33333    # -0.55f

    .line 325
    .line 326
    .line 327
    const v15, -0x419eb852    # -0.22f

    .line 328
    .line 329
    .line 330
    const v16, -0x40770a3d    # -1.07f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x414e6666    # 12.9f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x41580000    # 13.5f

    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3f19999a    # 0.6f

    .line 345
    .line 346
    .line 347
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x40800000    # 4.0f

    .line 353
    .line 354
    const v18, 0x4015c28f    # 2.34f

    .line 355
    .line 356
    .line 357
    const/high16 v13, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const v14, 0x3f933333    # 1.15f

    .line 360
    .line 361
    .line 362
    const v15, 0x401a3d71    # 2.41f

    .line 363
    .line 364
    .line 365
    const v16, 0x4000a3d7    # 2.01f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x41168f5c    # 9.41f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x3f400000    # 0.75f

    .line 378
    .line 379
    const/high16 v18, 0x3f400000    # 0.75f

    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const v14, 0x3ed1eb85    # 0.41f

    .line 383
    .line 384
    .line 385
    const v15, 0x3eae147b    # 0.34f

    .line 386
    .line 387
    .line 388
    const/high16 v16, 0x3f400000    # 0.75f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x41b547ae    # 22.66f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x41b20000    # 22.25f

    .line 397
    .line 398
    const/high16 v4, 0x41980000    # 19.0f

    .line 399
    .line 400
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x411c0000    # 9.75f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x41920000    # 18.25f

    .line 409
    .line 410
    const/high16 v18, 0x41100000    # 9.0f

    .line 411
    .line 412
    const/high16 v13, 0x41980000    # 19.0f

    .line 413
    .line 414
    const v14, 0x411570a4    # 9.34f

    .line 415
    .line 416
    .line 417
    const v15, 0x419547ae    # 18.66f

    .line 418
    .line 419
    .line 420
    const/high16 v16, 0x41100000    # 9.0f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x4152147b    # 13.13f

    .line 429
    .line 430
    .line 431
    const v2, 0x40edc28f    # 7.43f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3ff851ec    # -2.12f

    .line 438
    .line 439
    .line 440
    const v2, -0x412e147b    # -0.41f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x40b5c28f    # -0.79f

    .line 447
    .line 448
    .line 449
    const v18, -0x406a3d71    # -1.17f

    .line 450
    .line 451
    .line 452
    const v13, -0x40f5c28f    # -0.54f

    .line 453
    .line 454
    .line 455
    const v14, -0x421eb852    # -0.11f

    .line 456
    .line 457
    .line 458
    const v15, -0x4099999a    # -0.9f

    .line 459
    .line 460
    .line 461
    const v16, -0x40deb852    # -0.63f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3f428f5c    # 0.76f

    .line 468
    .line 469
    .line 470
    const v2, -0x3f847ae1    # -3.93f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x4015c28f    # 2.34f

    .line 477
    .line 478
    .line 479
    const v18, -0x4035c28f    # -1.58f

    .line 480
    .line 481
    .line 482
    const v13, 0x3e570a3d    # 0.21f

    .line 483
    .line 484
    .line 485
    const v14, -0x4075c28f    # -1.08f

    .line 486
    .line 487
    .line 488
    const v15, 0x3fa147ae    # 1.26f

    .line 489
    .line 490
    .line 491
    const v16, -0x401ae148    # -1.79f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3f947ae1    # 1.16f

    .line 498
    .line 499
    .line 500
    const v2, 0x3e6b851f    # 0.23f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4152147b    # 13.13f

    .line 507
    .line 508
    .line 509
    const v2, 0x40edc28f    # 7.43f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/16 v16, 0x3800

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/high16 v8, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/4 v7, 0x0

    .line 531
    const/high16 v9, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v12, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const/4 v14, 0x0

    .line 537
    const/4 v15, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    sput-object v0, Landroidx/compose/material/icons/rounded/HikingKt;->_hiking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    return-object v0
.end method
