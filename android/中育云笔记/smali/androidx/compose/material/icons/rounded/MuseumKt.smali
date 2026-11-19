.class public final Landroidx/compose/material/icons/rounded/MuseumKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _museum:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMuseum(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MuseumKt;->_museum:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Museum"

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
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f000000    # 0.5f

    .line 78
    .line 79
    const/high16 v18, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v13, 0x3e8f5c29    # 0.28f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f000000    # 0.5f

    .line 86
    .line 87
    const v16, -0x419eb852    # -0.22f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x411428f6    # 9.26f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x41a8f5c3    # -0.21f

    .line 100
    .line 101
    .line 102
    const v18, -0x412e147b    # -0.41f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, -0x41dc28f6    # -0.16f

    .line 107
    .line 108
    .line 109
    const v15, -0x425c28f6    # -0.08f

    .line 110
    .line 111
    .line 112
    const v16, -0x415c28f6    # -0.32f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x41491eb8    # 12.57f

    .line 119
    .line 120
    .line 121
    const v2, 0x4019999a    # 2.4f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, -0x406ccccd    # -1.15f

    .line 128
    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const v13, -0x4151eb85    # -0.34f

    .line 133
    .line 134
    .line 135
    const v14, -0x418a3d71    # -0.24f

    .line 136
    .line 137
    .line 138
    const v15, -0x40b33333    # -0.8f

    .line 139
    .line 140
    .line 141
    const v16, -0x418a3d71    # -0.24f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x400d70a4    # 2.21f

    .line 148
    .line 149
    .line 150
    const v2, 0x410d999a    # 8.85f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x40000000    # 2.0f

    .line 157
    .line 158
    const v18, 0x411428f6    # 9.26f

    .line 159
    .line 160
    .line 161
    const v13, 0x40051eb8    # 2.08f

    .line 162
    .line 163
    .line 164
    const v14, 0x410f0a3d    # 8.94f

    .line 165
    .line 166
    .line 167
    const/high16 v15, 0x40000000    # 2.0f

    .line 168
    .line 169
    const v16, 0x4111999a    # 9.1f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3f9eb852    # 1.24f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x40200000    # 2.5f

    .line 182
    .line 183
    const/high16 v18, 0x41300000    # 11.0f

    .line 184
    .line 185
    const/high16 v13, 0x40000000    # 2.0f

    .line 186
    .line 187
    const v14, 0x412c7ae1    # 10.78f

    .line 188
    .line 189
    .line 190
    const v15, 0x400e147b    # 2.22f

    .line 191
    .line 192
    .line 193
    const/high16 v16, 0x41300000    # 11.0f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40800000    # 4.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41100000    # 9.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, -0x40800000    # -1.0f

    .line 214
    .line 215
    const/high16 v18, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const v13, -0x40f33333    # -0.55f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const/high16 v15, -0x40800000    # -1.0f

    .line 222
    .line 223
    const v16, 0x3ee66666    # 0.45f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/4 v13, 0x0

    .line 232
    const v14, 0x3f0ccccd    # 0.55f

    .line 233
    .line 234
    .line 235
    const v15, 0x3ee66666    # 0.45f

    .line 236
    .line 237
    .line 238
    const/high16 v16, 0x3f800000    # 1.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x41900000    # 18.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v18, -0x40800000    # -1.0f

    .line 249
    .line 250
    const v13, 0x3f0ccccd    # 0.55f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const/high16 v15, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const v16, -0x4119999a    # -0.45f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, -0x40800000    # -1.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const v14, -0x40f33333    # -0.55f

    .line 266
    .line 267
    .line 268
    const v15, -0x4119999a    # -0.45f

    .line 269
    .line 270
    .line 271
    const/high16 v16, -0x40800000    # -1.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41800000    # 16.0f

    .line 295
    .line 296
    const/high16 v2, 0x41880000    # 17.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v18, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const v14, 0x3f0ccccd    # 0.55f

    .line 304
    .line 305
    .line 306
    const/high16 v16, 0x3f800000    # 1.0f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, -0x4119999a    # -0.45f

    .line 312
    .line 313
    .line 314
    const/high16 v2, -0x40800000    # -1.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x406a3d71    # -1.17f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x402b851f    # -1.66f

    .line 333
    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const v13, -0x41333333    # -0.4f

    .line 338
    .line 339
    .line 340
    const v14, 0x3f170a3d    # 0.59f

    .line 341
    .line 342
    .line 343
    const v15, -0x405d70a4    # -1.27f

    .line 344
    .line 345
    .line 346
    const v16, 0x3f170a3d    # 0.59f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41200000    # 10.0f

    .line 353
    .line 354
    const/high16 v2, 0x41600000    # 14.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x40400000    # 3.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, -0x40800000    # -1.0f

    .line 365
    .line 366
    const/high16 v18, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, 0x3f0ccccd    # 0.55f

    .line 370
    .line 371
    .line 372
    const v15, -0x4119999a    # -0.45f

    .line 373
    .line 374
    .line 375
    const/high16 v16, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, -0x4119999a    # -0.45f

    .line 381
    .line 382
    .line 383
    const/high16 v2, -0x40800000    # -1.0f

    .line 384
    .line 385
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, -0x3f69999a    # -4.7f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x4114cccd    # 9.3f

    .line 395
    .line 396
    .line 397
    const/high16 v18, 0x41300000    # 11.0f

    .line 398
    .line 399
    const/high16 v13, 0x41000000    # 8.0f

    .line 400
    .line 401
    const v14, 0x413947ae    # 11.58f

    .line 402
    .line 403
    .line 404
    const v15, 0x410947ae    # 8.58f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x41300000    # 11.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/4 v0, 0x0

    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x3f8a3d71    # 1.08f

    .line 417
    .line 418
    .line 419
    const v18, 0x3f147ae1    # 0.58f

    .line 420
    .line 421
    .line 422
    const v13, 0x3edc28f6    # 0.43f

    .line 423
    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const v15, 0x3f570a3d    # 0.84f

    .line 427
    .line 428
    .line 429
    const v16, 0x3e6147ae    # 0.22f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41400000    # 12.0f

    .line 436
    .line 437
    const/high16 v2, 0x41600000    # 14.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3fce147b    # 1.61f

    .line 443
    .line 444
    .line 445
    const v2, -0x3fe51eb8    # -2.42f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x416b3333    # 14.7f

    .line 452
    .line 453
    .line 454
    const/high16 v18, 0x41300000    # 11.0f

    .line 455
    .line 456
    const v13, 0x415dc28f    # 13.86f

    .line 457
    .line 458
    .line 459
    const v14, 0x4133851f    # 11.22f

    .line 460
    .line 461
    .line 462
    const v15, 0x416428f6    # 14.26f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x41300000    # 11.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/4 v0, 0x0

    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3fa66666    # 1.3f

    .line 475
    .line 476
    .line 477
    const v18, 0x3fa66666    # 1.3f

    .line 478
    .line 479
    .line 480
    const v13, 0x3f3851ec    # 0.72f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const v15, 0x3fa66666    # 1.3f

    .line 485
    .line 486
    .line 487
    const v16, 0x3f147ae1    # 0.58f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x41880000    # 17.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const/16 v16, 0x3800

    .line 506
    .line 507
    const/16 v17, 0x0

    .line 508
    .line 509
    const/high16 v6, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/high16 v8, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    const/high16 v9, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/high16 v12, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/4 v15, 0x0

    .line 520
    const-string v4, ""

    .line 521
    .line 522
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    sput-object v0, Landroidx/compose/material/icons/rounded/MuseumKt;->_museum:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 531
    .line 532
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    return-object v0
.end method
