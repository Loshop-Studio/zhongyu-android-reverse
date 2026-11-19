.class public final Landroidx/compose/material/icons/rounded/EmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _emergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergency(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Emergency"

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
    const v0, 0x41a251ec    # 20.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x4105eb85    # 8.37f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x40228f5c    # -1.73f

    .line 80
    .line 81
    .line 82
    const/high16 v2, -0x40800000    # -1.0f

    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, -0x4050a3d7    # -1.37f

    .line 88
    .line 89
    .line 90
    const v18, -0x41428f5c    # -0.37f

    .line 91
    .line 92
    .line 93
    const v13, -0x4170a3d7    # -0.28f

    .line 94
    .line 95
    .line 96
    const v14, -0x410a3d71    # -0.48f

    .line 97
    .line 98
    .line 99
    const v15, -0x409c28f6    # -0.89f

    .line 100
    .line 101
    .line 102
    const v16, -0x40dc28f6    # -0.64f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41600000    # 14.0f

    .line 109
    .line 110
    const v2, 0x4108a3d7    # 8.54f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x40800000    # 4.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/high16 v18, -0x40800000    # -1.0f

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const v14, -0x40f33333    # -0.55f

    .line 127
    .line 128
    .line 129
    const v15, -0x4119999a    # -0.45f

    .line 130
    .line 131
    .line 132
    const/high16 v16, -0x40800000    # -1.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, -0x40000000    # -2.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v18, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const v13, -0x40f33333    # -0.55f

    .line 145
    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    const/high16 v15, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v16, 0x3ee66666    # 0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x409147ae    # 4.54f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x40c23d71    # 6.07f

    .line 163
    .line 164
    .line 165
    const v2, 0x40c8a3d7    # 6.27f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x4096b852    # 4.71f

    .line 172
    .line 173
    .line 174
    const v18, 0x40d428f6    # 6.63f

    .line 175
    .line 176
    .line 177
    const v13, 0x40b2e148    # 5.59f

    .line 178
    .line 179
    .line 180
    const v14, 0x40bfae14    # 5.99f

    .line 181
    .line 182
    .line 183
    const v15, 0x409f5c29    # 4.98f

    .line 184
    .line 185
    .line 186
    const v16, 0x40c51eb8    # 6.16f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3fdd70a4    # 1.73f

    .line 193
    .line 194
    .line 195
    const/high16 v2, -0x40800000    # -1.0f

    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x40823d71    # 4.07f

    .line 201
    .line 202
    .line 203
    const v18, 0x411bae14    # 9.73f

    .line 204
    .line 205
    .line 206
    const v13, 0x405b851f    # 3.43f

    .line 207
    .line 208
    .line 209
    const v14, 0x410d70a4    # 8.84f

    .line 210
    .line 211
    .line 212
    const v15, 0x4065c28f    # 3.59f

    .line 213
    .line 214
    .line 215
    const v16, 0x41175c29    # 9.46f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41000000    # 8.0f

    .line 222
    .line 223
    const/high16 v2, 0x41400000    # 12.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3f847ae1    # -3.93f

    .line 229
    .line 230
    .line 231
    const v2, 0x401147ae    # 2.27f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x41428f5c    # -0.37f

    .line 238
    .line 239
    .line 240
    const v18, 0x3faf5c29    # 1.37f

    .line 241
    .line 242
    .line 243
    const v13, -0x410a3d71    # -0.48f

    .line 244
    .line 245
    .line 246
    const v14, 0x3e8f5c29    # 0.28f

    .line 247
    .line 248
    .line 249
    const v15, -0x40dc28f6    # -0.64f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f63d70a    # 0.89f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const v2, 0x3fdd70a4    # 1.73f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3faf5c29    # 1.37f

    .line 267
    .line 268
    .line 269
    const v18, 0x3ebd70a4    # 0.37f

    .line 270
    .line 271
    .line 272
    const v13, 0x3e8f5c29    # 0.28f

    .line 273
    .line 274
    .line 275
    const v14, 0x3ef5c28f    # 0.48f

    .line 276
    .line 277
    .line 278
    const v15, 0x3f63d70a    # 0.89f

    .line 279
    .line 280
    .line 281
    const v16, 0x3f23d70a    # 0.64f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41200000    # 10.0f

    .line 288
    .line 289
    const v2, 0x41775c29    # 15.46f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41a00000    # 20.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v18, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const v14, 0x3f0ccccd    # 0.55f

    .line 306
    .line 307
    .line 308
    const v15, 0x3ee66666    # 0.45f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x3f800000    # 1.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x40000000    # 2.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v18, -0x40800000    # -1.0f

    .line 322
    .line 323
    const v13, 0x3f0ccccd    # 0.55f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const v16, -0x4119999a    # -0.45f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, -0x3f6eb852    # -4.54f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x407b851f    # 3.93f

    .line 342
    .line 343
    .line 344
    const v2, 0x401147ae    # 2.27f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3faf5c29    # 1.37f

    .line 351
    .line 352
    .line 353
    const v18, -0x41428f5c    # -0.37f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ef5c28f    # 0.48f

    .line 357
    .line 358
    .line 359
    const v14, 0x3e8f5c29    # 0.28f

    .line 360
    .line 361
    .line 362
    const v15, 0x3f8b851f    # 1.09f

    .line 363
    .line 364
    .line 365
    const v16, 0x3de147ae    # 0.11f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const v2, -0x40228f5c    # -1.73f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x41428f5c    # -0.37f

    .line 380
    .line 381
    .line 382
    const v18, -0x4050a3d7    # -1.37f

    .line 383
    .line 384
    .line 385
    const v13, 0x3e8f5c29    # 0.28f

    .line 386
    .line 387
    .line 388
    const v14, -0x410a3d71    # -0.48f

    .line 389
    .line 390
    .line 391
    const v15, 0x3de147ae    # 0.11f

    .line 392
    .line 393
    .line 394
    const v16, -0x40747ae1    # -1.09f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41800000    # 16.0f

    .line 401
    .line 402
    const/high16 v2, 0x41400000    # 12.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x3feeb852    # -2.27f

    .line 408
    .line 409
    .line 410
    const v2, 0x407b851f    # 3.93f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x41a251ec    # 20.29f

    .line 417
    .line 418
    .line 419
    const v18, 0x4105eb85    # 8.37f

    .line 420
    .line 421
    .line 422
    const v13, 0x41a347ae    # 20.41f

    .line 423
    .line 424
    .line 425
    const v14, 0x41175c29    # 9.46f

    .line 426
    .line 427
    .line 428
    const v15, 0x41a48f5c    # 20.57f

    .line 429
    .line 430
    .line 431
    const v16, 0x410d70a4    # 8.84f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/rounded/EmergencyKt;->_emergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    return-object v0
.end method
