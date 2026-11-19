.class public final Landroidx/compose/material/icons/twotone/PhoneEnabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneEnabled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PhoneEnabledKt;->_phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PhoneEnabled"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3e780000    # -17.0f

    .line 78
    .line 79
    const/high16 v18, 0x41880000    # 17.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x41163d71    # 9.39f

    .line 83
    .line 84
    .line 85
    const v15, -0x3f0c7ae1    # -7.61f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x41880000    # 17.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x40800000    # -1.0f

    .line 94
    .line 95
    const/high16 v18, -0x40800000    # -1.0f

    .line 96
    .line 97
    const v13, -0x40f33333    # -0.55f

    .line 98
    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    const/high16 v15, -0x40800000    # -1.0f

    .line 102
    .line 103
    const v16, -0x4119999a    # -0.45f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x3fa0a3d7    # -3.49f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const v14, -0x40f33333    # -0.55f

    .line 119
    .line 120
    .line 121
    const v15, 0x3ee66666    # 0.45f

    .line 122
    .line 123
    .line 124
    const/high16 v16, -0x40800000    # -1.0f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, 0x40647ae1    # 3.57f

    .line 130
    .line 131
    .line 132
    const v18, -0x40ee147b    # -0.57f

    .line 133
    .line 134
    .line 135
    const v13, 0x3f9eb852    # 1.24f

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const v15, 0x401ccccd    # 2.45f

    .line 140
    .line 141
    .line 142
    const v16, -0x41b33333    # -0.2f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3e9eb852    # 0.31f

    .line 149
    .line 150
    .line 151
    const v18, -0x42b33333    # -0.05f

    .line 152
    .line 153
    .line 154
    const v13, 0x3dcccccd    # 0.1f

    .line 155
    .line 156
    .line 157
    const v14, -0x42dc28f6    # -0.04f

    .line 158
    .line 159
    .line 160
    const v15, 0x3e570a3d    # 0.21f

    .line 161
    .line 162
    .line 163
    const v16, -0x42b33333    # -0.05f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x3f35c28f    # 0.71f

    .line 170
    .line 171
    .line 172
    const v18, 0x3e947ae1    # 0.29f

    .line 173
    .line 174
    .line 175
    const v13, 0x3e851eb8    # 0.26f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const v15, 0x3f028f5c    # 0.51f

    .line 180
    .line 181
    .line 182
    const v16, 0x3dcccccd    # 0.1f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x400ccccd    # 2.2f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, 0x40d2e148    # 6.59f

    .line 195
    .line 196
    .line 197
    const v18, -0x3f2d1eb8    # -6.59f

    .line 198
    .line 199
    .line 200
    const v13, 0x40351eb8    # 2.83f

    .line 201
    .line 202
    .line 203
    const v14, -0x40466666    # -1.45f

    .line 204
    .line 205
    .line 206
    const v15, 0x40a4cccd    # 5.15f

    .line 207
    .line 208
    .line 209
    const v16, -0x3f8f5c29    # -3.76f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, -0x3ff33333    # -2.2f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, -0x41800000    # -0.25f

    .line 222
    .line 223
    const v18, -0x407d70a4    # -1.02f

    .line 224
    .line 225
    .line 226
    const v13, -0x4170a3d7    # -0.28f

    .line 227
    .line 228
    .line 229
    const v14, -0x4170a3d7    # -0.28f

    .line 230
    .line 231
    .line 232
    const v15, -0x4147ae14    # -0.36f

    .line 233
    .line 234
    .line 235
    const v16, -0x40d47ae1    # -0.67f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x41780000    # 15.5f

    .line 242
    .line 243
    const/high16 v18, 0x40800000    # 4.0f

    .line 244
    .line 245
    const v13, 0x4174cccd    # 15.3f

    .line 246
    .line 247
    .line 248
    const v14, 0x40ce6666    # 6.45f

    .line 249
    .line 250
    .line 251
    const/high16 v15, 0x41780000    # 15.5f

    .line 252
    .line 253
    const/high16 v16, 0x40a80000    # 5.25f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v18, -0x40800000    # -1.0f

    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, -0x40f33333    # -0.55f

    .line 264
    .line 265
    .line 266
    const v15, 0x3ee66666    # 0.45f

    .line 267
    .line 268
    .line 269
    const/high16 v16, -0x40800000    # -1.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x41a00000    # 20.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41a80000    # 21.0f

    .line 280
    .line 281
    const/high16 v18, 0x40800000    # 4.0f

    .line 282
    .line 283
    const v13, 0x41a46666    # 20.55f

    .line 284
    .line 285
    .line 286
    const/high16 v14, 0x40400000    # 3.0f

    .line 287
    .line 288
    const/high16 v15, 0x41a80000    # 21.0f

    .line 289
    .line 290
    const v16, 0x405ccccd    # 3.45f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x418828f6    # 17.02f

    .line 300
    .line 301
    .line 302
    const v2, 0x40f33333    # 7.6f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x3fd9999a    # -2.6f

    .line 309
    .line 310
    .line 311
    const v18, 0x3ee66666    # 0.45f

    .line 312
    .line 313
    .line 314
    const v13, -0x40a66666    # -0.85f

    .line 315
    .line 316
    .line 317
    const v14, 0x3e75c28f    # 0.24f

    .line 318
    .line 319
    .line 320
    const v15, -0x4023d70a    # -1.72f

    .line 321
    .line 322
    .line 323
    const v16, 0x3ec7ae14    # 0.39f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3fbeb852    # 1.49f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x40733333    # 3.8f

    .line 336
    .line 337
    .line 338
    const/high16 v18, -0x40c00000    # -0.75f

    .line 339
    .line 340
    const v13, 0x3fa8f5c3    # 1.32f

    .line 341
    .line 342
    .line 343
    const v14, -0x4247ae14    # -0.09f

    .line 344
    .line 345
    .line 346
    const v15, 0x4025c28f    # 2.59f

    .line 347
    .line 348
    .line 349
    const v16, -0x414ccccd    # -0.35f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x418828f6    # 17.02f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40a00000    # 5.0f

    .line 365
    .line 366
    const v2, 0x418bae14    # 17.46f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x4119999a    # -0.45f

    .line 373
    .line 374
    .line 375
    const v18, 0x4025c28f    # 2.59f

    .line 376
    .line 377
    .line 378
    const v13, -0x428a3d71    # -0.06f

    .line 379
    .line 380
    .line 381
    const v14, 0x3f63d70a    # 0.89f

    .line 382
    .line 383
    .line 384
    const v15, -0x41a8f5c3    # -0.21f

    .line 385
    .line 386
    .line 387
    const v16, 0x3fe147ae    # 1.76f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x3f99999a    # 1.2f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x3f428f5c    # 0.76f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f8d70a4    # -3.79f

    .line 403
    .line 404
    .line 405
    const v13, 0x3ed1eb85    # 0.41f

    .line 406
    .line 407
    .line 408
    const v14, -0x40666666    # -1.2f

    .line 409
    .line 410
    .line 411
    const v15, 0x3f2b851f    # 0.67f

    .line 412
    .line 413
    .line 414
    const v16, -0x3fe1eb85    # -2.47f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x418bae14    # 17.46f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    const/16 v16, 0x3800

    .line 434
    .line 435
    const/16 v17, 0x0

    .line 436
    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/high16 v8, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/4 v7, 0x0

    .line 442
    const/high16 v9, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/high16 v12, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const/4 v14, 0x0

    .line 448
    const/4 v15, 0x0

    .line 449
    const-string v4, ""

    .line 450
    .line 451
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sput-object v0, Landroidx/compose/material/icons/twotone/PhoneEnabledKt;->_phoneEnabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    return-object v0
.end method
