.class public final Landroidx/compose/material/icons/rounded/VolunteerActivismKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVolunteerActivism(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VolunteerActivism"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, -0x40000000    # -2.0f

    .line 81
    .line 82
    const/high16 v26, 0x40000000    # 2.0f

    .line 83
    .line 84
    const v21, -0x40733333    # -1.1f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/high16 v23, -0x40000000    # -2.0f

    .line 90
    .line 91
    const v24, 0x3f666666    # 0.9f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40e00000    # 7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/16 v21, 0x0

    .line 107
    .line 108
    const v22, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v23, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v26, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v21, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const/high16 v23, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v24, -0x4099999a    # -0.9f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x3f200000    # -7.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x40400000    # 3.0f

    .line 144
    .line 145
    const/high16 v26, 0x41300000    # 11.0f

    .line 146
    .line 147
    const/high16 v21, 0x40a00000    # 5.0f

    .line 148
    .line 149
    const v22, 0x413e6666    # 11.9f

    .line 150
    .line 151
    .line 152
    const v23, 0x40833333    # 4.1f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x41300000    # 11.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41200000    # 10.0f

    .line 216
    .line 217
    const v6, 0x40a9999a    # 5.3f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v25, 0x4154cccd    # 13.3f

    .line 224
    .line 225
    .line 226
    const/high16 v26, 0x40000000    # 2.0f

    .line 227
    .line 228
    const/high16 v21, 0x41200000    # 10.0f

    .line 229
    .line 230
    const v22, 0x405ccccd    # 3.45f

    .line 231
    .line 232
    .line 233
    const v23, 0x41373333    # 11.45f

    .line 234
    .line 235
    .line 236
    const/high16 v24, 0x40000000    # 2.0f

    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x402ccccd    # 2.7f

    .line 244
    .line 245
    .line 246
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 247
    .line 248
    const v21, 0x3f851eb8    # 1.04f

    .line 249
    .line 250
    .line 251
    const/16 v22, 0x0

    .line 252
    .line 253
    const v23, 0x40033333    # 2.05f

    .line 254
    .line 255
    .line 256
    const v24, 0x3efae148    # 0.49f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v25, 0x4195999a    # 18.7f

    .line 263
    .line 264
    .line 265
    const/high16 v26, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v21, 0x41853333    # 16.65f

    .line 268
    .line 269
    .line 270
    const v22, 0x401f5c29    # 2.49f

    .line 271
    .line 272
    .line 273
    const v23, 0x418d47ae    # 17.66f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x40000000    # 2.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v25, 0x41b00000    # 22.0f

    .line 282
    .line 283
    const v26, 0x40a9999a    # 5.3f

    .line 284
    .line 285
    .line 286
    const v21, 0x41a46666    # 20.55f

    .line 287
    .line 288
    .line 289
    const/high16 v22, 0x40000000    # 2.0f

    .line 290
    .line 291
    const/high16 v23, 0x41b00000    # 22.0f

    .line 292
    .line 293
    const v24, 0x405ccccd    # 3.45f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x3f5570a4    # -5.33f

    .line 300
    .line 301
    .line 302
    const v26, 0x40e2e148    # 7.09f

    .line 303
    .line 304
    .line 305
    const/16 v21, 0x0

    .line 306
    .line 307
    const v22, 0x40066666    # 2.1f

    .line 308
    .line 309
    .line 310
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 311
    .line 312
    const v24, 0x409051ec    # 4.51f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v25, -0x40533333    # -1.35f

    .line 319
    .line 320
    .line 321
    const/16 v26, 0x0

    .line 322
    .line 323
    const v21, -0x413d70a4    # -0.38f

    .line 324
    .line 325
    .line 326
    const v22, 0x3eb33333    # 0.35f

    .line 327
    .line 328
    .line 329
    const v23, -0x4087ae14    # -0.97f

    .line 330
    .line 331
    .line 332
    const v24, 0x3eb33333    # 0.35f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x41200000    # 10.0f

    .line 339
    .line 340
    const v26, 0x40a9999a    # 5.3f

    .line 341
    .line 342
    .line 343
    const/high16 v21, 0x41480000    # 12.5f

    .line 344
    .line 345
    const v22, 0x411cf5c3    # 9.81f

    .line 346
    .line 347
    .line 348
    const/high16 v23, 0x41200000    # 10.0f

    .line 349
    .line 350
    const v24, 0x40eccccd    # 7.4f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const/high16 v6, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const-string v4, ""

    .line 364
    .line 365
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 366
    .line 367
    .line 368
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 375
    .line 376
    .line 377
    move-result-wide v6

    .line 378
    const/4 v0, 0x0

    .line 379
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 387
    .line 388
    .line 389
    move-result v11

    .line 390
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const v0, 0x419feb85    # 19.99f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x41880000    # 17.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x3f2570a4    # -6.83f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x41570a3d    # -0.33f

    .line 410
    .line 411
    .line 412
    const v18, -0x428a3d71    # -0.06f

    .line 413
    .line 414
    .line 415
    const v13, -0x421eb852    # -0.11f

    .line 416
    .line 417
    .line 418
    const v15, -0x419eb852    # -0.22f

    .line 419
    .line 420
    .line 421
    const v16, -0x435c28f6    # -0.02f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, -0x4043d70a    # -1.47f

    .line 428
    .line 429
    .line 430
    const v2, -0x40fd70a4    # -0.51f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, -0x41666666    # -0.3f

    .line 437
    .line 438
    .line 439
    const v18, -0x40deb852    # -0.63f

    .line 440
    .line 441
    .line 442
    const v13, -0x417ae148    # -0.26f

    .line 443
    .line 444
    .line 445
    const v14, -0x4247ae14    # -0.09f

    .line 446
    .line 447
    .line 448
    const v15, -0x413851ec    # -0.39f

    .line 449
    .line 450
    .line 451
    const v16, -0x41428f5c    # -0.37f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/4 v0, 0x0

    .line 458
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, 0x3f23d70a    # 0.64f

    .line 462
    .line 463
    .line 464
    const v18, -0x41666666    # -0.3f

    .line 465
    .line 466
    .line 467
    const v13, 0x3db851ec    # 0.09f

    .line 468
    .line 469
    .line 470
    const v14, -0x417ae148    # -0.26f

    .line 471
    .line 472
    .line 473
    const v15, 0x3ec28f5c    # 0.38f

    .line 474
    .line 475
    .line 476
    const v16, -0x41333333    # -0.4f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3f8f5c29    # 1.12f

    .line 483
    .line 484
    .line 485
    const v2, 0x3edc28f6    # 0.43f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3eb851ec    # 0.36f

    .line 492
    .line 493
    .line 494
    const v18, 0x3d8f5c29    # 0.07f

    .line 495
    .line 496
    .line 497
    const v13, 0x3de147ae    # 0.11f

    .line 498
    .line 499
    .line 500
    const v14, 0x3d23d70a    # 0.04f

    .line 501
    .line 502
    .line 503
    const v15, 0x3e75c28f    # 0.24f

    .line 504
    .line 505
    .line 506
    const v16, 0x3d8f5c29    # 0.07f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x402851ec    # 2.63f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x3f970a3d    # 1.18f

    .line 519
    .line 520
    .line 521
    const v18, -0x4068f5c3    # -1.18f

    .line 522
    .line 523
    .line 524
    const v13, 0x3f266666    # 0.65f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const v15, 0x3f970a3d    # 1.18f

    .line 529
    .line 530
    .line 531
    const v16, -0x40f851ec    # -0.53f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/4 v0, 0x0

    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, -0x40bae148    # -0.77f

    .line 542
    .line 543
    .line 544
    const v18, -0x4071eb85    # -1.11f

    .line 545
    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, -0x41051eb8    # -0.49f

    .line 549
    .line 550
    .line 551
    const v15, -0x416147ae    # -0.31f

    .line 552
    .line 553
    .line 554
    const v16, -0x4091eb85    # -0.93f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x4114cccd    # 9.3f

    .line 561
    .line 562
    .line 563
    const v2, 0x4132147b    # 11.13f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x4109999a    # 8.6f

    .line 570
    .line 571
    .line 572
    const/high16 v18, 0x41300000    # 11.0f

    .line 573
    .line 574
    const v13, 0x411147ae    # 9.08f

    .line 575
    .line 576
    .line 577
    const v14, 0x4130a3d7    # 11.04f

    .line 578
    .line 579
    .line 580
    const v15, 0x410d70a4    # 8.84f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x41300000    # 11.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x40e00000    # 7.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x411051ec    # 9.02f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x40cbd70a    # 6.37f

    .line 600
    .line 601
    .line 602
    const v2, 0x3fe7ae14    # 1.81f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 609
    .line 610
    const v18, -0x42b33333    # -0.05f

    .line 611
    .line 612
    .line 613
    const v13, 0x3ed1eb85    # 0.41f

    .line 614
    .line 615
    .line 616
    const v14, 0x3df5c28f    # 0.12f

    .line 617
    .line 618
    .line 619
    const v15, 0x3f59999a    # 0.85f

    .line 620
    .line 621
    .line 622
    const v16, 0x3dcccccd    # 0.1f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x41b00000    # 22.0f

    .line 629
    .line 630
    const/high16 v2, 0x41980000    # 19.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/4 v0, 0x0

    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x419feb85    # 19.99f

    .line 640
    .line 641
    .line 642
    const/high16 v18, 0x41880000    # 17.0f

    .line 643
    .line 644
    const/high16 v13, 0x41b00000    # 22.0f

    .line 645
    .line 646
    const v14, 0x418f1eb8    # 17.89f

    .line 647
    .line 648
    .line 649
    const v15, 0x41a8cccd    # 21.1f

    .line 650
    .line 651
    .line 652
    const/high16 v16, 0x41880000    # 17.0f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/16 v16, 0x3800

    .line 665
    .line 666
    const/16 v17, 0x0

    .line 667
    .line 668
    const/high16 v6, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/4 v7, 0x0

    .line 671
    const/high16 v12, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v13, 0x0

    .line 674
    const/4 v14, 0x0

    .line 675
    const/4 v15, 0x0

    .line 676
    const-string v4, ""

    .line 677
    .line 678
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    sput-object v0, Landroidx/compose/material/icons/rounded/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    return-object v0
.end method
