.class public final Landroidx/compose/material/icons/sharp/Person3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _person3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson3(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Person3"

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
    const v4, 0x41931eb8    # 18.39f

    .line 71
    .line 72
    .line 73
    const v6, 0x4168f5c3    # 14.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x41500000    # 13.0f

    .line 82
    .line 83
    const v21, 0x4185ae14    # 16.71f

    .line 84
    .line 85
    .line 86
    const v22, 0x415b3333    # 13.7f

    .line 87
    .line 88
    .line 89
    const v23, 0x41687ae1    # 14.53f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41500000    # 13.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f33851f    # -6.39f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fc7ae14    # 1.56f

    .line 103
    .line 104
    .line 105
    const v21, -0x3fde147b    # -2.53f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3f6947ae    # -4.71f

    .line 111
    .line 112
    .line 113
    const v24, 0x3f333333    # 0.7f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v26, 0x4189c28f    # 17.22f

    .line 122
    .line 123
    .line 124
    const v21, 0x4093851f    # 4.61f

    .line 125
    .line 126
    .line 127
    const v22, 0x41711eb8    # 15.07f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x40800000    # 4.0f

    .line 131
    .line 132
    const v24, 0x4180cccd    # 16.1f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41a00000    # 20.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41800000    # 16.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, -0x3fce147b    # -2.78f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x41931eb8    # 18.39f

    .line 155
    .line 156
    .line 157
    const v26, 0x4168f5c3    # 14.56f

    .line 158
    .line 159
    .line 160
    const/high16 v21, 0x41a00000    # 20.0f

    .line 161
    .line 162
    const v22, 0x4180cccd    # 16.1f

    .line 163
    .line 164
    .line 165
    const v23, 0x419b1eb8    # 19.39f

    .line 166
    .line 167
    .line 168
    const v24, 0x41711eb8    # 15.07f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const/16 v16, 0x3800

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/high16 v6, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/high16 v8, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const/4 v0, 0x0

    .line 213
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x41200000    # 10.0f

    .line 230
    .line 231
    const/high16 v2, 0x41400000    # 12.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x40800000    # 4.0f

    .line 237
    .line 238
    const/16 v18, 0x0

    .line 239
    .line 240
    const v13, 0x3e2e147b    # 0.17f

    .line 241
    .line 242
    .line 243
    const v15, 0x40751eb8    # 3.83f

    .line 244
    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x40400000    # 3.0f

    .line 252
    .line 253
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 254
    .line 255
    const v13, 0x3fd47ae1    # 1.66f

    .line 256
    .line 257
    .line 258
    const/high16 v15, 0x40400000    # 3.0f

    .line 259
    .line 260
    const v16, -0x40547ae1    # -1.34f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, -0x40ca3d71    # -0.71f

    .line 267
    .line 268
    .line 269
    const v18, -0x400a3d71    # -1.92f

    .line 270
    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, -0x40c51eb8    # -0.73f

    .line 274
    .line 275
    .line 276
    const v15, -0x4175c28f    # -0.27f

    .line 277
    .line 278
    .line 279
    const v16, -0x404ccccd    # -1.4f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x41840000    # 16.5f

    .line 286
    .line 287
    const/high16 v18, 0x40c00000    # 6.0f

    .line 288
    .line 289
    const v13, 0x41835c29    # 16.42f

    .line 290
    .line 291
    .line 292
    const/high16 v14, 0x40d80000    # 6.75f

    .line 293
    .line 294
    const/high16 v15, 0x41840000    # 16.5f

    .line 295
    .line 296
    const v16, 0x40cc28f6    # 6.38f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x4011eb85    # -1.86f

    .line 303
    .line 304
    .line 305
    const v18, -0x3fceb852    # -2.77f

    .line 306
    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/high16 v14, -0x40600000    # -1.25f

    .line 310
    .line 311
    const v15, -0x40bae148    # -0.77f

    .line 312
    .line 313
    .line 314
    const v16, -0x3feb851f    # -2.32f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x41400000    # 12.0f

    .line 321
    .line 322
    const/high16 v18, 0x40000000    # 2.0f

    .line 323
    .line 324
    const/high16 v13, 0x41600000    # 14.0f

    .line 325
    .line 326
    const v14, 0x401eb852    # 2.48f

    .line 327
    .line 328
    .line 329
    const v15, 0x4150f5c3    # 13.06f

    .line 330
    .line 331
    .line 332
    const/high16 v16, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, -0x3fd70a3d    # -2.64f

    .line 338
    .line 339
    .line 340
    const v2, 0x3f9d70a4    # 1.23f

    .line 341
    .line 342
    .line 343
    const/high16 v4, -0x40000000    # -2.0f

    .line 344
    .line 345
    const v6, 0x3ef5c28f    # 0.48f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x40f00000    # 7.5f

    .line 352
    .line 353
    const/high16 v18, 0x40c00000    # 6.0f

    .line 354
    .line 355
    const v13, 0x410451ec    # 8.27f

    .line 356
    .line 357
    .line 358
    const v14, 0x406b851f    # 3.68f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x40f00000    # 7.5f

    .line 362
    .line 363
    const/high16 v16, 0x40980000    # 4.75f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3e570a3d    # 0.21f

    .line 369
    .line 370
    .line 371
    const v18, 0x3f8a3d71    # 1.08f

    .line 372
    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x3ec28f5c    # 0.38f

    .line 376
    .line 377
    .line 378
    const v15, 0x3da3d70a    # 0.08f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x3f400000    # 0.75f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x40e00000    # 7.0f

    .line 387
    .line 388
    const/high16 v18, 0x41100000    # 9.0f

    .line 389
    .line 390
    const v13, 0x40e8a3d7    # 7.27f

    .line 391
    .line 392
    .line 393
    const v14, 0x40f33333    # 7.6f

    .line 394
    .line 395
    .line 396
    const/high16 v15, 0x40e00000    # 7.0f

    .line 397
    .line 398
    const v16, 0x410451ec    # 8.27f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x41200000    # 10.0f

    .line 405
    .line 406
    const/high16 v18, 0x41400000    # 12.0f

    .line 407
    .line 408
    const/high16 v13, 0x40e00000    # 7.0f

    .line 409
    .line 410
    const v14, 0x412a8f5c    # 10.66f

    .line 411
    .line 412
    .line 413
    const v15, 0x410570a4    # 8.34f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    const/16 v16, 0x3800

    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    const/high16 v6, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const/high16 v12, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const/4 v14, 0x0

    .line 439
    const/4 v15, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    sput-object v0, Landroidx/compose/material/icons/sharp/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 451
    .line 452
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    return-object v0
.end method
