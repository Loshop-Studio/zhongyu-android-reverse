.class public final Landroidx/compose/material/icons/twotone/CookieKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cookie:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCookie(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CookieKt;->_cookie:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Cookie"

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
    const v4, 0x41888f5c    # 17.07f

    .line 71
    .line 72
    .line 73
    const v6, 0x410ee148    # 8.93f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f6051ec    # -4.99f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f61eb85    # -4.94f

    .line 83
    .line 84
    .line 85
    const v21, -0x3fdccccd    # -2.55f

    .line 86
    .line 87
    .line 88
    const v22, -0x413851ec    # -0.39f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f6dc28f    # -4.57f

    .line 92
    .line 93
    .line 94
    const v24, -0x3fe5c28f    # -2.41f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x40800000    # 4.0f

    .line 103
    .line 104
    const/high16 v26, 0x41400000    # 12.0f

    .line 105
    .line 106
    const v21, 0x40d75c29    # 6.73f

    .line 107
    .line 108
    .line 109
    const v22, 0x40747ae1    # 3.82f

    .line 110
    .line 111
    .line 112
    const/high16 v23, 0x40800000    # 4.0f

    .line 113
    .line 114
    const v24, 0x410b0a3d    # 8.69f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x41000000    # 8.0f

    .line 121
    .line 122
    const/high16 v26, 0x41000000    # 8.0f

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const v22, 0x408d1eb8    # 4.41f

    .line 127
    .line 128
    .line 129
    const v23, 0x4065c28f    # 3.59f

    .line 130
    .line 131
    .line 132
    const/high16 v24, 0x41000000    # 8.0f

    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, 0x40ff5c29    # 7.98f

    .line 138
    .line 139
    .line 140
    const v26, -0x3f11999a    # -7.45f

    .line 141
    .line 142
    .line 143
    const v21, 0x4081eb85    # 4.06f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const v23, 0x40f66666    # 7.7f

    .line 149
    .line 150
    .line 151
    const v24, -0x3fb70a3d    # -3.14f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v25, 0x41888f5c    # 17.07f

    .line 158
    .line 159
    .line 160
    const v26, 0x410ee148    # 8.93f

    .line 161
    .line 162
    .line 163
    const v21, 0x418cb852    # 17.59f

    .line 164
    .line 165
    .line 166
    const v22, 0x4137ae14    # 11.48f

    .line 167
    .line 168
    .line 169
    const v23, 0x41891eb8    # 17.14f

    .line 170
    .line 171
    .line 172
    const v24, 0x4114a3d7    # 9.29f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41700000    # 15.0f

    .line 182
    .line 183
    const/high16 v6, 0x41080000    # 8.5f

    .line 184
    .line 185
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x40e00000    # 7.0f

    .line 189
    .line 190
    const/high16 v26, 0x41580000    # 13.5f

    .line 191
    .line 192
    const v21, 0x40f570a4    # 7.67f

    .line 193
    .line 194
    .line 195
    const/high16 v22, 0x41700000    # 15.0f

    .line 196
    .line 197
    const/high16 v23, 0x40e00000    # 7.0f

    .line 198
    .line 199
    const v24, 0x416547ae    # 14.33f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, 0x40f570a4    # 7.67f

    .line 206
    .line 207
    .line 208
    const/high16 v6, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v7, 0x41080000    # 8.5f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x3f2b851f    # 0.67f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 219
    .line 220
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x411547ae    # 9.33f

    .line 224
    .line 225
    .line 226
    const/high16 v6, 0x41700000    # 15.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x41200000    # 10.0f

    .line 235
    .line 236
    const/high16 v6, 0x41280000    # 10.5f

    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v25, 0x41100000    # 9.0f

    .line 242
    .line 243
    const/high16 v26, 0x41080000    # 8.5f

    .line 244
    .line 245
    const v21, 0x411ab852    # 9.67f

    .line 246
    .line 247
    .line 248
    const/high16 v22, 0x41200000    # 10.0f

    .line 249
    .line 250
    const/high16 v23, 0x41100000    # 9.0f

    .line 251
    .line 252
    const v24, 0x411547ae    # 9.33f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x411ab852    # 9.67f

    .line 259
    .line 260
    .line 261
    const/high16 v6, 0x40e00000    # 7.0f

    .line 262
    .line 263
    const/high16 v7, 0x41280000    # 10.5f

    .line 264
    .line 265
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x40f570a4    # 7.67f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x41400000    # 12.0f

    .line 272
    .line 273
    const/high16 v7, 0x41080000    # 8.5f

    .line 274
    .line 275
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x413547ae    # 11.33f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41200000    # 10.0f

    .line 282
    .line 283
    const/high16 v7, 0x41280000    # 10.5f

    .line 284
    .line 285
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x41800000    # 16.0f

    .line 292
    .line 293
    const/high16 v6, 0x41700000    # 15.0f

    .line 294
    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, -0x40800000    # -1.0f

    .line 299
    .line 300
    const/high16 v26, -0x40800000    # -1.0f

    .line 301
    .line 302
    const v21, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    const/16 v22, 0x0

    .line 306
    .line 307
    const/high16 v23, -0x40800000    # -1.0f

    .line 308
    .line 309
    const v24, -0x4119999a    # -0.45f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v25, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/16 v21, 0x0

    .line 318
    .line 319
    const v22, -0x40f33333    # -0.55f

    .line 320
    .line 321
    .line 322
    const v23, 0x3ee66666    # 0.45f

    .line 323
    .line 324
    .line 325
    const/high16 v24, -0x40800000    # -1.0f

    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x3ee66666    # 0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v6, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x41700000    # 15.0f

    .line 339
    .line 340
    const/high16 v26, 0x41800000    # 16.0f

    .line 341
    .line 342
    const/high16 v21, 0x41800000    # 16.0f

    .line 343
    .line 344
    const v22, 0x4178cccd    # 15.55f

    .line 345
    .line 346
    .line 347
    const v23, 0x4178cccd    # 15.55f

    .line 348
    .line 349
    .line 350
    const/high16 v24, 0x41800000    # 16.0f

    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/16 v16, 0x3800

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const v6, 0x3e99999a    # 0.3f

    .line 367
    .line 368
    .line 369
    const v8, 0x3e99999a    # 0.3f

    .line 370
    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    const/high16 v9, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/high16 v12, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const/4 v14, 0x0

    .line 379
    const/4 v15, 0x0

    .line 380
    const-string v4, ""

    .line 381
    .line 382
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 383
    .line 384
    .line 385
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 390
    .line 391
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    const/4 v2, 0x0

    .line 396
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x41280000    # 10.5f

    .line 413
    .line 414
    const/high16 v6, 0x41080000    # 8.5f

    .line 415
    .line 416
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v4, -0x40400000    # -1.5f

    .line 420
    .line 421
    const/4 v6, 0x0

    .line 422
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v26, 0x40400000    # 3.0f

    .line 426
    .line 427
    const/16 v27, 0x0

    .line 428
    .line 429
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 430
    .line 431
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 432
    .line 433
    const/16 v23, 0x0

    .line 434
    .line 435
    const/16 v24, 0x1

    .line 436
    .line 437
    const/16 v25, 0x1

    .line 438
    .line 439
    move-object/from16 v20, v2

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 445
    .line 446
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const-string v4, ""

    .line 459
    .line 460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 461
    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 468
    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    const/4 v2, 0x0

    .line 474
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 482
    .line 483
    .line 484
    move-result v11

    .line 485
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x41580000    # 13.5f

    .line 491
    .line 492
    const/high16 v6, 0x41080000    # 8.5f

    .line 493
    .line 494
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, -0x40400000    # -1.5f

    .line 498
    .line 499
    const/4 v6, 0x0

    .line 500
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v26, 0x40400000    # 3.0f

    .line 504
    .line 505
    move-object/from16 v20, v2

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 511
    .line 512
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 532
    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 534
    .line 535
    .line 536
    move-result-wide v6

    .line 537
    const/4 v2, 0x0

    .line 538
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x41700000    # 15.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, -0x40800000    # -1.0f

    .line 560
    .line 561
    const/4 v6, 0x0

    .line 562
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v26, 0x40000000    # 2.0f

    .line 566
    .line 567
    const/high16 v21, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/high16 v22, 0x3f800000    # 1.0f

    .line 570
    .line 571
    move-object/from16 v20, v2

    .line 572
    .line 573
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v26, -0x40000000    # -2.0f

    .line 577
    .line 578
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/high16 v6, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const-string v4, ""

    .line 589
    .line 590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 591
    .line 592
    .line 593
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 598
    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 600
    .line 601
    .line 602
    move-result-wide v6

    .line 603
    const/4 v0, 0x0

    .line 604
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 608
    .line 609
    .line 610
    move-result v10

    .line 611
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 618
    .line 619
    .line 620
    const v0, 0x41af999a    # 21.95f

    .line 621
    .line 622
    .line 623
    const v2, 0x412fd70a    # 10.99f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, -0x3fd47ae1    # -2.68f

    .line 630
    .line 631
    .line 632
    const v18, -0x3f78f5c3    # -4.22f

    .line 633
    .line 634
    .line 635
    const v13, -0x401ae148    # -1.79f

    .line 636
    .line 637
    .line 638
    const v14, -0x430a3d71    # -0.03f

    .line 639
    .line 640
    .line 641
    const v15, -0x3f933333    # -3.7f

    .line 642
    .line 643
    .line 644
    const v16, -0x40066666    # -1.95f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v17, -0x3f59eb85    # -5.19f

    .line 651
    .line 652
    .line 653
    const v18, -0x3f6e147b    # -4.56f

    .line 654
    .line 655
    .line 656
    const v13, -0x3fc1eb85    # -2.97f

    .line 657
    .line 658
    .line 659
    const/high16 v14, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const v15, -0x3f470a3d    # -5.78f

    .line 662
    .line 663
    .line 664
    const v16, -0x40347ae1    # -1.59f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, 0x40000000    # 2.0f

    .line 671
    .line 672
    const/high16 v18, 0x41400000    # 12.0f

    .line 673
    .line 674
    const v13, 0x40e33333    # 7.1f

    .line 675
    .line 676
    .line 677
    const v14, 0x3f3d70a4    # 0.74f

    .line 678
    .line 679
    .line 680
    const/high16 v15, 0x40000000    # 2.0f

    .line 681
    .line 682
    const v16, 0x40cd1eb8    # 6.41f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x41200000    # 10.0f

    .line 689
    .line 690
    const/high16 v18, 0x41200000    # 10.0f

    .line 691
    .line 692
    const/4 v13, 0x0

    .line 693
    const v14, 0x40b0a3d7    # 5.52f

    .line 694
    .line 695
    .line 696
    const v15, 0x408f5c29    # 4.48f

    .line 697
    .line 698
    .line 699
    const/high16 v16, 0x41200000    # 10.0f

    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v17, 0x41af999a    # 21.95f

    .line 705
    .line 706
    .line 707
    const v18, 0x412fd70a    # 10.99f

    .line 708
    .line 709
    .line 710
    const v13, 0x418f1eb8    # 17.89f

    .line 711
    .line 712
    .line 713
    const/high16 v14, 0x41b00000    # 22.0f

    .line 714
    .line 715
    const v15, 0x41b451ec    # 22.54f

    .line 716
    .line 717
    .line 718
    const v16, 0x41875c29    # 16.92f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x41a00000    # 20.0f

    .line 728
    .line 729
    const/high16 v2, 0x41400000    # 12.0f

    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v17, -0x3f000000    # -8.0f

    .line 735
    .line 736
    const/high16 v18, -0x3f000000    # -8.0f

    .line 737
    .line 738
    const v13, -0x3f72e148    # -4.41f

    .line 739
    .line 740
    .line 741
    const/4 v14, 0x0

    .line 742
    const/high16 v15, -0x3f000000    # -8.0f

    .line 743
    .line 744
    const v16, -0x3f9a3d71    # -3.59f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, 0x410147ae    # 8.08f

    .line 751
    .line 752
    .line 753
    const v18, -0x3effae14    # -8.02f

    .line 754
    .line 755
    .line 756
    const/4 v13, 0x0

    .line 757
    const v14, -0x3fac28f6    # -3.31f

    .line 758
    .line 759
    .line 760
    const v15, 0x402eb852    # 2.73f

    .line 761
    .line 762
    .line 763
    const v16, -0x3efd1eb8    # -8.18f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v17, 0x409fae14    # 4.99f

    .line 770
    .line 771
    .line 772
    const v18, 0x409e147b    # 4.94f

    .line 773
    .line 774
    .line 775
    const v13, 0x3ed70a3d    # 0.42f

    .line 776
    .line 777
    .line 778
    const v14, 0x40228f5c    # 2.54f

    .line 779
    .line 780
    .line 781
    const v15, 0x401c28f6    # 2.44f

    .line 782
    .line 783
    .line 784
    const v16, 0x4091eb85    # 4.56f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x403ae148    # 2.92f

    .line 791
    .line 792
    .line 793
    const v18, 0x406851ec    # 3.63f

    .line 794
    .line 795
    .line 796
    const v13, 0x3d8f5c29    # 0.07f

    .line 797
    .line 798
    .line 799
    const v14, 0x3eb851ec    # 0.36f

    .line 800
    .line 801
    .line 802
    const v15, 0x3f051eb8    # 0.52f

    .line 803
    .line 804
    .line 805
    const v16, 0x40233333    # 2.55f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v17, 0x41400000    # 12.0f

    .line 812
    .line 813
    const/high16 v18, 0x41a00000    # 20.0f

    .line 814
    .line 815
    const v13, 0x419d999a    # 19.7f

    .line 816
    .line 817
    .line 818
    const v14, 0x4186e148    # 16.86f

    .line 819
    .line 820
    .line 821
    const v15, 0x41807ae1    # 16.06f

    .line 822
    .line 823
    .line 824
    const/high16 v16, 0x41a00000    # 20.0f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    const/16 v16, 0x3800

    .line 837
    .line 838
    const/16 v17, 0x0

    .line 839
    .line 840
    const/high16 v6, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/4 v7, 0x0

    .line 843
    const/high16 v12, 0x3f800000    # 1.0f

    .line 844
    .line 845
    const/4 v13, 0x0

    .line 846
    const/4 v14, 0x0

    .line 847
    const/4 v15, 0x0

    .line 848
    const-string v4, ""

    .line 849
    .line 850
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    sput-object v0, Landroidx/compose/material/icons/twotone/CookieKt;->_cookie:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 859
    .line 860
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    return-object v0
.end method
