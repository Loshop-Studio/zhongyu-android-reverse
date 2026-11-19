.class public final Landroidx/compose/material/icons/rounded/PhoneDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhoneDisabled"

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
    const v0, 0x418af5c3    # 17.37f

    .line 71
    .line 72
    .line 73
    const v2, 0x4168a3d7    # 14.54f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3ee8cccd    # -9.45f

    .line 80
    .line 81
    .line 82
    const v18, 0x40670a3d    # 3.61f

    .line 83
    .line 84
    .line 85
    const v13, -0x3fd7ae14    # -2.63f

    .line 86
    .line 87
    .line 88
    const v14, 0x40051eb8    # 2.08f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f43851f    # -5.89f

    .line 92
    .line 93
    .line 94
    const v16, 0x4058f5c3    # 3.39f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3ffb851f    # -2.07f

    .line 101
    .line 102
    .line 103
    const/high16 v18, -0x40000000    # -2.0f

    .line 104
    .line 105
    const v13, -0x406f5c29    # -1.13f

    .line 106
    .line 107
    .line 108
    const v14, 0x3d8f5c29    # 0.07f

    .line 109
    .line 110
    .line 111
    const v15, -0x3ffb851f    # -2.07f

    .line 112
    .line 113
    .line 114
    const v16, -0x40a147ae    # -0.87f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, -0x40228f5c    # -1.73f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x3fe147ae    # 1.76f

    .line 127
    .line 128
    .line 129
    const v18, -0x40028f5c    # -1.98f

    .line 130
    .line 131
    .line 132
    const v13, -0x43dc28f6    # -0.01f

    .line 133
    .line 134
    .line 135
    const v14, -0x407eb852    # -1.01f

    .line 136
    .line 137
    .line 138
    const/high16 v15, 0x3f400000    # 0.75f

    .line 139
    .line 140
    const v16, -0x4011eb85    # -1.86f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40228f5c    # 2.54f

    .line 147
    .line 148
    .line 149
    const v2, -0x416b851f    # -0.29f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3fd1eb85    # 1.64f

    .line 156
    .line 157
    .line 158
    const v18, 0x3f11eb85    # 0.57f

    .line 159
    .line 160
    .line 161
    const v13, 0x3f1c28f6    # 0.61f

    .line 162
    .line 163
    .line 164
    const v14, -0x4270a3d7    # -0.07f

    .line 165
    .line 166
    .line 167
    const v15, 0x3f9ae148    # 1.21f

    .line 168
    .line 169
    .line 170
    const v16, 0x3e0f5c29    # 0.14f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x3feb851f    # 1.84f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x4013d70a    # 2.31f

    .line 183
    .line 184
    .line 185
    const v18, -0x40466666    # -1.45f

    .line 186
    .line 187
    .line 188
    const v13, 0x3f4f5c29    # 0.81f

    .line 189
    .line 190
    .line 191
    const v14, -0x412e147b    # -0.41f

    .line 192
    .line 193
    .line 194
    const v15, 0x3fcb851f    # 1.59f

    .line 195
    .line 196
    .line 197
    const v16, -0x4099999a    # -0.9f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x40066666    # 2.1f

    .line 204
    .line 205
    .line 206
    const v2, 0x409dc28f    # 4.93f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const v18, -0x404b851f    # -1.41f

    .line 215
    .line 216
    .line 217
    const v13, -0x413851ec    # -0.39f

    .line 218
    .line 219
    .line 220
    const v14, -0x413851ec    # -0.39f

    .line 221
    .line 222
    .line 223
    const v15, -0x413851ec    # -0.39f

    .line 224
    .line 225
    .line 226
    const v16, -0x407d70a4    # -1.02f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3fb5c28f    # 1.42f

    .line 237
    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const v13, 0x3ec7ae14    # 0.39f

    .line 242
    .line 243
    .line 244
    const v15, 0x3f83d70a    # 1.03f

    .line 245
    .line 246
    .line 247
    const v16, -0x413851ec    # -0.39f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x41a3eb85    # 20.49f

    .line 254
    .line 255
    .line 256
    const/high16 v2, 0x41a40000    # 20.5f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    const v18, 0x3fb47ae1    # 1.41f

    .line 264
    .line 265
    .line 266
    const v14, 0x3ec7ae14    # 0.39f

    .line 267
    .line 268
    .line 269
    const v15, 0x3ec7ae14    # 0.39f

    .line 270
    .line 271
    .line 272
    const v16, 0x3f828f5c    # 1.02f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x3ec7ae14    # 0.39f

    .line 279
    .line 280
    .line 281
    const v2, -0x404b851f    # -1.41f

    .line 282
    .line 283
    .line 284
    const/4 v4, 0x0

    .line 285
    const v6, -0x407d70a4    # -1.02f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x418af5c3    # 17.37f

    .line 292
    .line 293
    .line 294
    const v2, 0x4168a3d7    # 14.54f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x418b1eb8    # 17.39f

    .line 304
    .line 305
    .line 306
    const v2, 0x412ccccd    # 10.8f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x40133333    # -1.85f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x40ee147b    # -0.57f

    .line 319
    .line 320
    .line 321
    const v18, -0x402e147b    # -1.64f

    .line 322
    .line 323
    .line 324
    const v13, -0x4123d70a    # -0.43f

    .line 325
    .line 326
    .line 327
    const v14, -0x4123d70a    # -0.43f

    .line 328
    .line 329
    .line 330
    const v15, -0x40dc28f6    # -0.64f

    .line 331
    .line 332
    .line 333
    const v16, -0x407c28f6    # -1.03f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3e947ae1    # 0.29f

    .line 340
    .line 341
    .line 342
    const v2, -0x3fdeb852    # -2.52f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3ffeb852    # 1.99f

    .line 349
    .line 350
    .line 351
    const v18, -0x401d70a4    # -1.77f

    .line 352
    .line 353
    .line 354
    const v13, 0x3df5c28f    # 0.12f

    .line 355
    .line 356
    .line 357
    const v14, -0x407eb852    # -1.01f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f7851ec    # 0.97f

    .line 361
    .line 362
    .line 363
    const v16, -0x401d70a4    # -1.77f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3fdd70a4    # 1.73f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, 0x40000000    # 2.0f

    .line 376
    .line 377
    const v18, 0x40047ae1    # 2.07f

    .line 378
    .line 379
    .line 380
    const v13, 0x3f90a3d7    # 1.13f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const v15, 0x40047ae1    # 2.07f

    .line 385
    .line 386
    .line 387
    const v16, 0x3f70a3d7    # 0.94f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x3f9851ec    # -3.62f

    .line 394
    .line 395
    .line 396
    const v18, 0x4117851f    # 9.47f

    .line 397
    .line 398
    .line 399
    const v13, -0x419eb852    # -0.22f

    .line 400
    .line 401
    .line 402
    const v14, 0x40647ae1    # 3.57f

    .line 403
    .line 404
    .line 405
    const v15, -0x403ae148    # -1.54f

    .line 406
    .line 407
    .line 408
    const v16, 0x40da8f5c    # 6.83f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, -0x4048f5c3    # -1.43f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x418b1eb8    # 17.39f

    .line 421
    .line 422
    .line 423
    const v18, 0x412ccccd    # 10.8f

    .line 424
    .line 425
    .line 426
    const v13, 0x4183d70a    # 16.48f

    .line 427
    .line 428
    .line 429
    const v14, 0x41466666    # 12.4f

    .line 430
    .line 431
    .line 432
    const v15, 0x4187c28f    # 16.97f

    .line 433
    .line 434
    .line 435
    const v16, 0x4139eb85    # 11.62f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/16 v16, 0x3800

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/high16 v6, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/high16 v8, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const/high16 v9, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v12, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    const-string v4, ""

    .line 465
    .line 466
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneDisabledKt;->_phoneDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 475
    .line 476
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    return-object v0
.end method
