.class public final Landroidx/compose/material/icons/rounded/PhoneForwardedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneForwarded(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhoneForwarded"

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
    const v0, 0x41b53333    # 22.65f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b4cccd    # 5.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f8d70a4    # -3.79f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x40a3d70a    # -0.86f

    .line 86
    .line 87
    .line 88
    const v18, 0x3eb33333    # 0.35f

    .line 89
    .line 90
    .line 91
    const v13, -0x415c28f6    # -0.32f

    .line 92
    .line 93
    .line 94
    const v14, -0x415c28f6    # -0.32f

    .line 95
    .line 96
    .line 97
    const v15, -0x40a3d70a    # -0.86f

    .line 98
    .line 99
    .line 100
    const v16, -0x42333333    # -0.1f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40800000    # 4.0f

    .line 107
    .line 108
    const/high16 v2, 0x41900000    # 18.0f

    .line 109
    .line 110
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, -0x41000000    # -0.5f

    .line 119
    .line 120
    const/high16 v18, 0x3f000000    # 0.5f

    .line 121
    .line 122
    const v13, -0x4170a3d7    # -0.28f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const/high16 v15, -0x41000000    # -0.5f

    .line 127
    .line 128
    const v16, 0x3e6147ae    # 0.22f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40400000    # 3.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x3f000000    # 0.5f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const v14, 0x3e8f5c29    # 0.28f

    .line 143
    .line 144
    .line 145
    const v15, 0x3e6147ae    # 0.22f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x3f000000    # 0.5f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x3fe51eb8    # 1.79f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x3f59999a    # 0.85f

    .line 165
    .line 166
    .line 167
    const v18, 0x3eb33333    # 0.35f

    .line 168
    .line 169
    .line 170
    const v14, 0x3ee66666    # 0.45f

    .line 171
    .line 172
    .line 173
    const v15, 0x3f0a3d71    # 0.54f

    .line 174
    .line 175
    .line 176
    const v16, 0x3f2b851f    # 0.67f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x40728f5c    # 3.79f

    .line 183
    .line 184
    .line 185
    const v2, -0x3f8d70a4    # -3.79f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x3c23d70a    # 0.01f

    .line 192
    .line 193
    .line 194
    const v18, -0x40cccccd    # -0.7f

    .line 195
    .line 196
    .line 197
    const v13, 0x3e4ccccd    # 0.2f

    .line 198
    .line 199
    .line 200
    const v14, -0x41bd70a4    # -0.19f

    .line 201
    .line 202
    .line 203
    const v15, 0x3e4ccccd    # 0.2f

    .line 204
    .line 205
    .line 206
    const v16, -0x40fd70a4    # -0.51f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x4199d70a    # 19.23f

    .line 216
    .line 217
    .line 218
    const v2, 0x417428f6    # 15.26f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x3fdd70a4    # -2.54f

    .line 225
    .line 226
    .line 227
    const v2, -0x416b851f    # -0.29f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x402e147b    # -1.64f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f11eb85    # 0.57f

    .line 237
    .line 238
    .line 239
    const v13, -0x40e3d70a    # -0.61f

    .line 240
    .line 241
    .line 242
    const v14, -0x4270a3d7    # -0.07f

    .line 243
    .line 244
    .line 245
    const v15, -0x40651eb8    # -1.21f

    .line 246
    .line 247
    .line 248
    const v16, 0x3e0f5c29    # 0.14f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x40147ae1    # -1.84f

    .line 255
    .line 256
    .line 257
    const v2, 0x3feb851f    # 1.84f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x3f2d1eb8    # -6.59f

    .line 264
    .line 265
    .line 266
    const v18, -0x3f2d1eb8    # -6.59f

    .line 267
    .line 268
    .line 269
    const v13, -0x3fcae148    # -2.83f

    .line 270
    .line 271
    .line 272
    const v14, -0x4047ae14    # -1.44f

    .line 273
    .line 274
    .line 275
    const v15, -0x3f5b3333    # -5.15f

    .line 276
    .line 277
    .line 278
    const/high16 v16, -0x3f900000    # -3.75f

    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3feccccd    # 1.85f

    .line 284
    .line 285
    .line 286
    const v2, -0x40133333    # -1.85f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3f11eb85    # 0.57f

    .line 293
    .line 294
    .line 295
    const v18, -0x402e147b    # -1.64f

    .line 296
    .line 297
    .line 298
    const v13, 0x3edc28f6    # 0.43f

    .line 299
    .line 300
    .line 301
    const v14, -0x4123d70a    # -0.43f

    .line 302
    .line 303
    .line 304
    const v15, 0x3f23d70a    # 0.64f

    .line 305
    .line 306
    .line 307
    const v16, -0x407c28f6    # -1.03f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, -0x3fdeb852    # -2.52f

    .line 314
    .line 315
    .line 316
    const v2, -0x416b851f    # -0.29f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x400147ae    # -1.99f

    .line 323
    .line 324
    .line 325
    const v18, -0x401d70a4    # -1.77f

    .line 326
    .line 327
    .line 328
    const v13, -0x420a3d71    # -0.12f

    .line 329
    .line 330
    .line 331
    const v14, -0x407eb852    # -1.01f

    .line 332
    .line 333
    .line 334
    const v15, -0x4087ae14    # -0.97f

    .line 335
    .line 336
    .line 337
    const v16, -0x401d70a4    # -1.77f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x40a0f5c3    # 5.03f

    .line 344
    .line 345
    .line 346
    const v2, 0x4040a3d7    # 3.01f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x40000000    # -2.0f

    .line 353
    .line 354
    const v18, 0x40047ae1    # 2.07f

    .line 355
    .line 356
    .line 357
    const v13, -0x406f5c29    # -1.13f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const v15, -0x3ffb851f    # -2.07f

    .line 362
    .line 363
    .line 364
    const v16, 0x3f70a3d7    # 0.94f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x417e3d71    # 15.89f

    .line 371
    .line 372
    .line 373
    const v18, 0x417e3d71    # 15.89f

    .line 374
    .line 375
    .line 376
    const v13, 0x3f07ae14    # 0.53f

    .line 377
    .line 378
    .line 379
    const v14, 0x4108a3d7    # 8.54f

    .line 380
    .line 381
    .line 382
    const v15, 0x40eb851f    # 7.36f

    .line 383
    .line 384
    .line 385
    const v16, 0x4175c28f    # 15.36f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x40047ae1    # 2.07f

    .line 392
    .line 393
    .line 394
    const/high16 v18, -0x40000000    # -2.0f

    .line 395
    .line 396
    const v13, 0x3f90a3d7    # 1.13f

    .line 397
    .line 398
    .line 399
    const v14, 0x3d8f5c29    # 0.07f

    .line 400
    .line 401
    .line 402
    const v15, 0x40047ae1    # 2.07f

    .line 403
    .line 404
    .line 405
    const v16, -0x40a147ae    # -0.87f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x40228f5c    # -1.73f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x401eb852    # -1.76f

    .line 418
    .line 419
    .line 420
    const v18, -0x40028f5c    # -1.98f

    .line 421
    .line 422
    .line 423
    const v13, 0x3c23d70a    # 0.01f

    .line 424
    .line 425
    .line 426
    const v14, -0x407eb852    # -1.01f

    .line 427
    .line 428
    .line 429
    const/high16 v15, -0x40c00000    # -0.75f

    .line 430
    .line 431
    const v16, -0x4011eb85    # -1.86f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    const/16 v16, 0x3800

    .line 445
    .line 446
    const/16 v17, 0x0

    .line 447
    .line 448
    const/high16 v6, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/high16 v8, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v7, 0x0

    .line 453
    const/high16 v9, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v12, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneForwardedKt;->_phoneForwarded:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    return-object v0
.end method

.method public static synthetic getPhoneForwarded$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
