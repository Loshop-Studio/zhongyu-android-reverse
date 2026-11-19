.class public final Landroidx/compose/material/icons/rounded/OpenWithKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _openWith:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOpenWith(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/OpenWithKt;->_openWith:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.OpenWith"

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
    const/high16 v0, 0x41280000    # 10.5f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f000000    # 0.5f

    .line 83
    .line 84
    const/high16 v18, -0x41000000    # -0.5f

    .line 85
    .line 86
    const v13, 0x3e8f5c29    # 0.28f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f000000    # 0.5f

    .line 91
    .line 92
    const v16, -0x419eb852    # -0.22f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41600000    # 14.0f

    .line 99
    .line 100
    const/high16 v2, 0x40c00000    # 6.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x3fe51eb8    # 1.79f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3eb33333    # 0.35f

    .line 112
    .line 113
    .line 114
    const v18, -0x40a66666    # -0.85f

    .line 115
    .line 116
    .line 117
    const v13, 0x3ee66666    # 0.45f

    .line 118
    .line 119
    .line 120
    const v15, 0x3f2b851f    # 0.67f

    .line 121
    .line 122
    .line 123
    const v16, -0x40f5c28f    # -0.54f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, -0x3f8d70a4    # -3.79f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40ca3d71    # -0.71f

    .line 136
    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const v13, -0x41b33333    # -0.2f

    .line 141
    .line 142
    .line 143
    const v14, -0x41b33333    # -0.2f

    .line 144
    .line 145
    .line 146
    const v15, -0x40fd70a4    # -0.51f

    .line 147
    .line 148
    .line 149
    const v16, -0x41b33333    # -0.2f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x40fb3333    # 7.85f

    .line 156
    .line 157
    .line 158
    const v2, 0x40a4cccd    # 5.15f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x3eb851ec    # 0.36f

    .line 165
    .line 166
    .line 167
    const v18, 0x3f59999a    # 0.85f

    .line 168
    .line 169
    .line 170
    const v13, -0x416147ae    # -0.31f

    .line 171
    .line 172
    .line 173
    const v14, 0x3e9eb852    # 0.31f

    .line 174
    .line 175
    .line 176
    const v15, -0x4247ae14    # -0.09f

    .line 177
    .line 178
    .line 179
    const v16, 0x3f59999a    # 0.85f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41200000    # 10.0f

    .line 186
    .line 187
    const/high16 v2, 0x40c00000    # 6.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x40200000    # 2.5f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x3f000000    # 0.5f

    .line 198
    .line 199
    const/high16 v18, 0x3f000000    # 0.5f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, 0x3e8f5c29    # 0.28f

    .line 203
    .line 204
    .line 205
    const v15, 0x3e6147ae    # 0.22f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x3f000000    # 0.5f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41080000    # 8.5f

    .line 217
    .line 218
    const/high16 v2, 0x41200000    # 10.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41200000    # 10.0f

    .line 224
    .line 225
    const/high16 v2, 0x40c00000    # 6.0f

    .line 226
    .line 227
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x41035c29    # 8.21f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x40a66666    # -0.85f

    .line 237
    .line 238
    .line 239
    const v18, -0x414ccccd    # -0.35f

    .line 240
    .line 241
    .line 242
    const v14, -0x4119999a    # -0.45f

    .line 243
    .line 244
    .line 245
    const v15, -0x40f5c28f    # -0.54f

    .line 246
    .line 247
    .line 248
    const v16, -0x40d47ae1    # -0.67f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x40728f5c    # 3.79f

    .line 255
    .line 256
    .line 257
    const v2, -0x3f8d70a4    # -3.79f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/16 v17, 0x0

    .line 264
    .line 265
    const v18, 0x3f35c28f    # 0.71f

    .line 266
    .line 267
    .line 268
    const v13, -0x41b33333    # -0.2f

    .line 269
    .line 270
    .line 271
    const v14, 0x3e4ccccd    # 0.2f

    .line 272
    .line 273
    .line 274
    const v15, -0x41b33333    # -0.2f

    .line 275
    .line 276
    .line 277
    const v16, 0x3f028f5c    # 0.51f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x3f59999a    # 0.85f

    .line 287
    .line 288
    .line 289
    const v18, -0x4147ae14    # -0.36f

    .line 290
    .line 291
    .line 292
    const v13, 0x3e9eb852    # 0.31f

    .line 293
    .line 294
    .line 295
    const v14, 0x3e9eb852    # 0.31f

    .line 296
    .line 297
    .line 298
    const v15, 0x3f59999a    # 0.85f

    .line 299
    .line 300
    .line 301
    const v16, 0x3db851ec    # 0.09f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x41600000    # 14.0f

    .line 308
    .line 309
    const/high16 v2, 0x40c00000    # 6.0f

    .line 310
    .line 311
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40200000    # 2.5f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x3f000000    # 0.5f

    .line 320
    .line 321
    const/high16 v18, -0x41000000    # -0.5f

    .line 322
    .line 323
    const v13, 0x3e8f5c29    # 0.28f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x3f000000    # 0.5f

    .line 328
    .line 329
    const v16, -0x419eb852    # -0.22f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, -0x41000000    # -0.5f

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const v14, -0x4170a3d7    # -0.28f

    .line 344
    .line 345
    .line 346
    const v15, -0x419eb852    # -0.22f

    .line 347
    .line 348
    .line 349
    const/high16 v16, -0x41000000    # -0.5f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x41b53333    # 22.65f

    .line 358
    .line 359
    .line 360
    const v2, 0x413a6666    # 11.65f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, -0x3f8d70a4    # -3.79f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x40a3d70a    # -0.86f

    .line 373
    .line 374
    .line 375
    const v18, 0x3eb33333    # 0.35f

    .line 376
    .line 377
    .line 378
    const v13, -0x415c28f6    # -0.32f

    .line 379
    .line 380
    .line 381
    const v14, -0x415c28f6    # -0.32f

    .line 382
    .line 383
    .line 384
    const v15, -0x40a3d70a    # -0.86f

    .line 385
    .line 386
    .line 387
    const v16, -0x42333333    # -0.1f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41900000    # 18.0f

    .line 394
    .line 395
    const/high16 v2, 0x41200000    # 10.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x41000000    # -0.5f

    .line 406
    .line 407
    const/high16 v18, 0x3f000000    # 0.5f

    .line 408
    .line 409
    const v13, -0x4170a3d7    # -0.28f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, -0x41000000    # -0.5f

    .line 414
    .line 415
    const v16, 0x3e6147ae    # 0.22f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x40400000    # 3.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, 0x3f000000    # 0.5f

    .line 427
    .line 428
    const/4 v13, 0x0

    .line 429
    const v14, 0x3e8f5c29    # 0.28f

    .line 430
    .line 431
    .line 432
    const v15, 0x3e6147ae    # 0.22f

    .line 433
    .line 434
    .line 435
    const/high16 v16, 0x3f000000    # 0.5f

    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x41600000    # 14.0f

    .line 441
    .line 442
    const/high16 v2, 0x41900000    # 18.0f

    .line 443
    .line 444
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x3fe51eb8    # 1.79f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3f59999a    # 0.85f

    .line 454
    .line 455
    .line 456
    const v18, 0x3eb33333    # 0.35f

    .line 457
    .line 458
    .line 459
    const v14, 0x3ee66666    # 0.45f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f0a3d71    # 0.54f

    .line 463
    .line 464
    .line 465
    const v16, 0x3f2b851f    # 0.67f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x40728f5c    # 3.79f

    .line 472
    .line 473
    .line 474
    const v2, -0x3f8d70a4    # -3.79f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x3c23d70a    # 0.01f

    .line 481
    .line 482
    .line 483
    const v18, -0x40cccccd    # -0.7f

    .line 484
    .line 485
    .line 486
    const v13, 0x3e4ccccd    # 0.2f

    .line 487
    .line 488
    .line 489
    const v14, -0x41bd70a4    # -0.19f

    .line 490
    .line 491
    .line 492
    const v15, 0x3e4ccccd    # 0.2f

    .line 493
    .line 494
    .line 495
    const v16, -0x40fd70a4    # -0.51f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41580000    # 13.5f

    .line 505
    .line 506
    const/high16 v2, 0x41700000    # 15.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, -0x41000000    # -0.5f

    .line 517
    .line 518
    const/high16 v18, 0x3f000000    # 0.5f

    .line 519
    .line 520
    const v13, -0x4170a3d7    # -0.28f

    .line 521
    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    const/high16 v15, -0x41000000    # -0.5f

    .line 525
    .line 526
    const v16, 0x3e6147ae    # 0.22f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x41900000    # 18.0f

    .line 533
    .line 534
    const/high16 v2, 0x41200000    # 10.0f

    .line 535
    .line 536
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x41035c29    # 8.21f

    .line 540
    .line 541
    .line 542
    const/high16 v2, 0x41900000    # 18.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, -0x414ccccd    # -0.35f

    .line 548
    .line 549
    .line 550
    const v18, 0x3f59999a    # 0.85f

    .line 551
    .line 552
    .line 553
    const v13, -0x4119999a    # -0.45f

    .line 554
    .line 555
    .line 556
    const v15, -0x40d47ae1    # -0.67f

    .line 557
    .line 558
    .line 559
    const v16, 0x3f0a3d71    # 0.54f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40728f5c    # 3.79f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, 0x3f35c28f    # 0.71f

    .line 572
    .line 573
    .line 574
    const/16 v18, 0x0

    .line 575
    .line 576
    const v13, 0x3e4ccccd    # 0.2f

    .line 577
    .line 578
    .line 579
    const v14, 0x3e4ccccd    # 0.2f

    .line 580
    .line 581
    .line 582
    const v15, 0x3f028f5c    # 0.51f

    .line 583
    .line 584
    .line 585
    const v16, 0x3e4ccccd    # 0.2f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v2, -0x3f8d70a4    # -3.79f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, -0x414ccccd    # -0.35f

    .line 598
    .line 599
    .line 600
    const v18, -0x40a66666    # -0.85f

    .line 601
    .line 602
    .line 603
    const v13, 0x3e9eb852    # 0.31f

    .line 604
    .line 605
    .line 606
    const v14, -0x416147ae    # -0.31f

    .line 607
    .line 608
    .line 609
    const v15, 0x3db851ec    # 0.09f

    .line 610
    .line 611
    .line 612
    const v16, -0x40a66666    # -0.85f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41600000    # 14.0f

    .line 619
    .line 620
    const/high16 v2, 0x41900000    # 18.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 626
    .line 627
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v17, -0x41000000    # -0.5f

    .line 631
    .line 632
    const/high16 v18, -0x41000000    # -0.5f

    .line 633
    .line 634
    const/4 v13, 0x0

    .line 635
    const v14, -0x4170a3d7    # -0.28f

    .line 636
    .line 637
    .line 638
    const v15, -0x419eb852    # -0.22f

    .line 639
    .line 640
    .line 641
    const/high16 v16, -0x41000000    # -0.5f

    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/high16 v8, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v14, 0x0

    .line 667
    const/4 v15, 0x0

    .line 668
    const-string v4, ""

    .line 669
    .line 670
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    sput-object v0, Landroidx/compose/material/icons/rounded/OpenWithKt;->_openWith:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    return-object v0
.end method
