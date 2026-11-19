.class public final Landroidx/compose/material/icons/outlined/VolunteerActivismKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVolunteerActivism(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VolunteerActivism"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const v26, -0x3f09999a    # -7.7f

    .line 80
    .line 81
    .line 82
    const v21, 0x4045c28f    # 3.09f

    .line 83
    .line 84
    .line 85
    const v22, -0x3fcc28f6    # -2.81f

    .line 86
    .line 87
    .line 88
    const/high16 v23, 0x40c00000    # 6.0f

    .line 89
    .line 90
    const v24, -0x3f51eb85    # -5.44f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x4195999a    # 18.7f

    .line 99
    .line 100
    .line 101
    const/high16 v26, 0x40000000    # 2.0f

    .line 102
    .line 103
    const/high16 v21, 0x41b00000    # 22.0f

    .line 104
    .line 105
    const v22, 0x405ccccd    # 3.45f

    .line 106
    .line 107
    .line 108
    const v23, 0x41a46666    # 20.55f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, -0x3fd33333    # -2.7f

    .line 117
    .line 118
    .line 119
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 120
    .line 121
    const v21, -0x407ae148    # -1.04f

    .line 122
    .line 123
    .line 124
    const/16 v22, 0x0

    .line 125
    .line 126
    const v23, -0x3ffccccd    # -2.05f

    .line 127
    .line 128
    .line 129
    const v24, 0x3efae148    # 0.49f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, 0x4154cccd    # 13.3f

    .line 136
    .line 137
    .line 138
    const/high16 v26, 0x40000000    # 2.0f

    .line 139
    .line 140
    const v21, 0x417570a4    # 15.34f

    .line 141
    .line 142
    .line 143
    const v22, 0x401f5c29    # 2.49f

    .line 144
    .line 145
    .line 146
    const v23, 0x416570a4    # 14.34f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41200000    # 10.0f

    .line 155
    .line 156
    const v26, 0x40a9999a    # 5.3f

    .line 157
    .line 158
    .line 159
    const v21, 0x41373333    # 11.45f

    .line 160
    .line 161
    .line 162
    const/high16 v22, 0x40000000    # 2.0f

    .line 163
    .line 164
    const/high16 v23, 0x41200000    # 10.0f

    .line 165
    .line 166
    const v24, 0x405ccccd    # 3.45f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x41800000    # 16.0f

    .line 173
    .line 174
    const/high16 v26, 0x41500000    # 13.0f

    .line 175
    .line 176
    const/high16 v21, 0x41200000    # 10.0f

    .line 177
    .line 178
    const v22, 0x40f1eb85    # 7.56f

    .line 179
    .line 180
    .line 181
    const v23, 0x414e8f5c    # 12.91f

    .line 182
    .line 183
    .line 184
    const v24, 0x41230a3d    # 10.19f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x4154cccd    # 13.3f

    .line 194
    .line 195
    .line 196
    const/high16 v6, 0x40800000    # 4.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x3f970a3d    # 1.18f

    .line 202
    .line 203
    .line 204
    const v26, 0x3f0ccccd    # 0.55f

    .line 205
    .line 206
    .line 207
    const v21, 0x3ee147ae    # 0.44f

    .line 208
    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const v23, 0x3f63d70a    # 0.89f

    .line 213
    .line 214
    .line 215
    const v24, 0x3e570a3d    # 0.21f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x40cae148    # 6.34f

    .line 222
    .line 223
    .line 224
    const/high16 v6, 0x41800000    # 16.0f

    .line 225
    .line 226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x3fc28f5c    # 1.52f

    .line 230
    .line 231
    .line 232
    const v6, -0x401ae148    # -1.79f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x4195999a    # 18.7f

    .line 239
    .line 240
    .line 241
    const/high16 v26, 0x40800000    # 4.0f

    .line 242
    .line 243
    const v21, 0x418e7ae1    # 17.81f

    .line 244
    .line 245
    .line 246
    const v22, 0x4086b852    # 4.21f

    .line 247
    .line 248
    .line 249
    const v23, 0x4192147b    # 18.26f

    .line 250
    .line 251
    .line 252
    const/high16 v24, 0x40800000    # 4.0f

    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v25, 0x41a00000    # 20.0f

    .line 258
    .line 259
    const v26, 0x40a9999a    # 5.3f

    .line 260
    .line 261
    .line 262
    const v21, 0x419b851f    # 19.44f

    .line 263
    .line 264
    .line 265
    const/high16 v22, 0x40800000    # 4.0f

    .line 266
    .line 267
    const/high16 v23, 0x41a00000    # 20.0f

    .line 268
    .line 269
    const v24, 0x4091eb85    # 4.56f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, -0x3f800000    # -4.0f

    .line 276
    .line 277
    const v26, 0x409fae14    # 4.99f

    .line 278
    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    const v22, 0x3f8f5c29    # 1.12f

    .line 283
    .line 284
    .line 285
    const v23, -0x3ffd70a4    # -2.04f

    .line 286
    .line 287
    .line 288
    const v24, 0x404ae148    # 3.17f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v26, -0x3f6051ec    # -4.99f

    .line 295
    .line 296
    .line 297
    const v21, -0x40051eb8    # -1.96f

    .line 298
    .line 299
    .line 300
    const v22, -0x40170a3d    # -1.82f

    .line 301
    .line 302
    .line 303
    const/high16 v23, -0x3f800000    # -4.0f

    .line 304
    .line 305
    const v24, -0x3f87ae14    # -3.88f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, 0x4154cccd    # 13.3f

    .line 312
    .line 313
    .line 314
    const/high16 v26, 0x40800000    # 4.0f

    .line 315
    .line 316
    const/high16 v21, 0x41400000    # 12.0f

    .line 317
    .line 318
    const v22, 0x4091eb85    # 4.56f

    .line 319
    .line 320
    .line 321
    const v23, 0x4148f5c3    # 12.56f

    .line 322
    .line 323
    .line 324
    const/high16 v24, 0x40800000    # 4.0f

    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    const/16 v16, 0x3800

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/high16 v6, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v8, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    const/high16 v9, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/high16 v12, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const/4 v14, 0x0

    .line 351
    const/4 v15, 0x0

    .line 352
    const-string v4, ""

    .line 353
    .line 354
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 355
    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 362
    .line 363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 364
    .line 365
    .line 366
    move-result-wide v6

    .line 367
    const/4 v0, 0x0

    .line 368
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41980000    # 19.0f

    .line 385
    .line 386
    const/high16 v2, 0x41800000    # 16.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, -0x40000000    # -2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x4010a3d7    # -1.87f

    .line 397
    .line 398
    .line 399
    const v18, -0x3fd33333    # -2.7f

    .line 400
    .line 401
    .line 402
    const v14, -0x40666666    # -1.2f

    .line 403
    .line 404
    .line 405
    const/high16 v15, -0x40c00000    # -0.75f

    .line 406
    .line 407
    const v16, -0x3fee147b    # -2.28f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x410f851f    # 8.97f

    .line 414
    .line 415
    .line 416
    const/high16 v2, 0x41300000    # 11.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x3f800000    # 1.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x41300000    # 11.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x40c00000    # 6.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x4047ae14    # -1.44f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3ff851ec    # 1.94f

    .line 443
    .line 444
    .line 445
    const/high16 v2, 0x40e00000    # 7.0f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41000000    # 8.0f

    .line 451
    .line 452
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, -0x40800000    # -1.0f

    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, 0x41980000    # 19.0f

    .line 463
    .line 464
    const/high16 v18, 0x41800000    # 16.0f

    .line 465
    .line 466
    const/high16 v13, 0x41b00000    # 22.0f

    .line 467
    .line 468
    const v14, 0x418ab852    # 17.34f

    .line 469
    .line 470
    .line 471
    const v15, 0x41a547ae    # 20.66f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x41800000    # 16.0f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41a00000    # 20.0f

    .line 483
    .line 484
    const/high16 v2, 0x40400000    # 3.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, -0x3f200000    # -7.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x40000000    # 2.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x40e00000    # 7.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x40400000    # 3.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x41a347ae    # 20.41f

    .line 513
    .line 514
    .line 515
    const v2, 0x415f851f    # 13.97f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x4193d70a    # 18.48f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x40e00000    # 7.0f

    .line 525
    .line 526
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41500000    # 13.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x3fce147b    # 1.61f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x40ba3d71    # 5.82f

    .line 541
    .line 542
    .line 543
    const v2, 0x400ae148    # 2.17f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v17, 0x41700000    # 15.0f

    .line 550
    .line 551
    const v13, 0x416c51ec    # 14.77f

    .line 552
    .line 553
    .line 554
    const v14, 0x4174cccd    # 15.3f

    .line 555
    .line 556
    .line 557
    const/high16 v15, 0x41700000    # 15.0f

    .line 558
    .line 559
    const v16, 0x417a147b    # 15.63f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, -0x3feccccd    # -2.3f

    .line 566
    .line 567
    .line 568
    const v18, -0x41e66666    # -0.15f

    .line 569
    .line 570
    .line 571
    const/4 v13, 0x0

    .line 572
    const/4 v14, 0x0

    .line 573
    const v15, -0x400147ae    # -1.99f

    .line 574
    .line 575
    .line 576
    const v16, -0x42b33333    # -0.05f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, -0x3fe7ae14    # -2.38f

    .line 583
    .line 584
    .line 585
    const v2, -0x40b5c28f    # -0.79f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x40deb852    # -0.63f

    .line 592
    .line 593
    .line 594
    const v2, 0x3ff33333    # 1.9f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x401851ec    # 2.38f

    .line 601
    .line 602
    .line 603
    const v2, 0x3f4a3d71    # 0.79f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, 0x3fca3d71    # 1.58f

    .line 610
    .line 611
    .line 612
    const v18, 0x3e851eb8    # 0.26f

    .line 613
    .line 614
    .line 615
    const v13, 0x3f028f5c    # 0.51f

    .line 616
    .line 617
    .line 618
    const v14, 0x3e2e147b    # 0.17f

    .line 619
    .line 620
    .line 621
    const v15, 0x3f851eb8    # 1.04f

    .line 622
    .line 623
    .line 624
    const v16, 0x3e851eb8    # 0.26f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41980000    # 19.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, 0x3f666666    # 0.9f

    .line 636
    .line 637
    .line 638
    const v18, 0x3f0f5c29    # 0.56f

    .line 639
    .line 640
    .line 641
    const v13, 0x3ec7ae14    # 0.39f

    .line 642
    .line 643
    .line 644
    const/4 v14, 0x0

    .line 645
    const v15, 0x3f3d70a4    # 0.74f

    .line 646
    .line 647
    .line 648
    const v16, 0x3e6b851f    # 0.23f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x41a347ae    # 20.41f

    .line 655
    .line 656
    .line 657
    const v2, 0x415f851f    # 13.97f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/16 v16, 0x3800

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v7, 0x0

    .line 677
    const/high16 v12, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/4 v13, 0x0

    .line 680
    const/4 v15, 0x0

    .line 681
    const-string v4, ""

    .line 682
    .line 683
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    sput-object v0, Landroidx/compose/material/icons/outlined/VolunteerActivismKt;->_volunteerActivism:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 692
    .line 693
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    return-object v0
.end method
