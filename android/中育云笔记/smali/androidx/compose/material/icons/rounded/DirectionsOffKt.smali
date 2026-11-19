.class public final Landroidx/compose/material/icons/rounded/DirectionsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DirectionsOffKt;->_directionsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DirectionsOff"

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
    const v4, 0x41adae14    # 21.71f

    .line 71
    .line 72
    .line 73
    const v6, 0x4134a3d7    # 11.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 80
    .line 81
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x404b851f    # -1.41f

    .line 85
    .line 86
    .line 87
    const/16 v26, 0x0

    .line 88
    .line 89
    const v21, -0x413851ec    # -0.39f

    .line 90
    .line 91
    .line 92
    const v22, -0x413851ec    # -0.39f

    .line 93
    .line 94
    .line 95
    const v23, -0x407d70a4    # -1.02f

    .line 96
    .line 97
    .line 98
    const v24, -0x413851ec    # -0.39f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x41035c29    # 8.21f

    .line 107
    .line 108
    .line 109
    const v6, 0x40ac28f6    # 5.38f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x41500000    # 13.0f

    .line 116
    .line 117
    const v6, 0x4122b852    # 10.17f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, -0x3fd51eb8    # -2.67f

    .line 124
    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x4049999a    # 3.15f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v25, 0x0

    .line 137
    .line 138
    const v26, 0x3f35c28f    # 0.71f

    .line 139
    .line 140
    .line 141
    const v21, 0x3e4ccccd    # 0.2f

    .line 142
    .line 143
    .line 144
    const v22, 0x3e4ccccd    # 0.2f

    .line 145
    .line 146
    .line 147
    const v23, 0x3e4ccccd    # 0.2f

    .line 148
    .line 149
    .line 150
    const v24, 0x3f028f5c    # 0.51f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, -0x40851eb8    # -0.98f

    .line 157
    .line 158
    .line 159
    const v6, 0x3f7ae148    # 0.98f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, 0x405ccccd    # 3.45f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, -0x3fba3d71    # -3.09f

    .line 172
    .line 173
    .line 174
    const v6, 0x4045c28f    # 3.09f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x41adae14    # 21.71f

    .line 181
    .line 182
    .line 183
    const v26, 0x4134a3d7    # 11.29f

    .line 184
    .line 185
    .line 186
    const v21, 0x41b0b852    # 22.09f

    .line 187
    .line 188
    .line 189
    const v22, 0x41451eb8    # 12.32f

    .line 190
    .line 191
    .line 192
    const v23, 0x41b0b852    # 22.09f

    .line 193
    .line 194
    .line 195
    const v24, 0x413b0a3d    # 11.69f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const/16 v16, 0x3800

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/high16 v6, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v8, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    const/high16 v9, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v12, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    const-string v4, ""

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    const/4 v0, 0x0

    .line 240
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const v0, 0x40d947ae    # 6.79f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x4060a3d7    # 3.51f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x404b851f    # -1.41f

    .line 269
    .line 270
    .line 271
    const/16 v18, 0x0

    .line 272
    .line 273
    const v13, -0x413851ec    # -0.39f

    .line 274
    .line 275
    .line 276
    const v14, -0x413851ec    # -0.39f

    .line 277
    .line 278
    .line 279
    const v15, -0x407d70a4    # -1.02f

    .line 280
    .line 281
    .line 282
    const v16, -0x413851ec    # -0.39f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/4 v0, 0x0

    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const v18, 0x3fb47ae1    # 1.41f

    .line 295
    .line 296
    .line 297
    const v14, 0x3ec7ae14    # 0.39f

    .line 298
    .line 299
    .line 300
    const v15, -0x413851ec    # -0.39f

    .line 301
    .line 302
    .line 303
    const v16, 0x3f828f5c    # 1.02f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x4051eb85    # 3.28f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, -0x3fba3d71    # -3.09f

    .line 316
    .line 317
    .line 318
    const v2, 0x4045c28f    # 3.09f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41100000    # 9.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3fb47ae1    # 1.41f

    .line 333
    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const v13, 0x3ec7ae14    # 0.39f

    .line 338
    .line 339
    .line 340
    const v15, 0x3f828f5c    # 1.02f

    .line 341
    .line 342
    .line 343
    const v16, 0x3ec7ae14    # 0.39f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, -0x3fba3d71    # -3.09f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x4051eb85    # 3.28f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/4 v0, 0x0

    .line 365
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/16 v17, 0x0

    .line 369
    .line 370
    const v18, -0x404b851f    # -1.41f

    .line 371
    .line 372
    .line 373
    const v14, -0x413851ec    # -0.39f

    .line 374
    .line 375
    .line 376
    const v15, 0x3ec7ae14    # 0.39f

    .line 377
    .line 378
    .line 379
    const v16, -0x407d70a4    # -1.02f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x40d947ae    # 6.79f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x411fd70a    # 9.99f

    .line 395
    .line 396
    .line 397
    const/high16 v2, 0x41600000    # 14.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, -0x40800000    # -1.0f

    .line 403
    .line 404
    const/high16 v18, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const v14, 0x3f0ccccd    # 0.55f

    .line 408
    .line 409
    .line 410
    const v15, -0x4119999a    # -0.45f

    .line 411
    .line 412
    .line 413
    const/high16 v16, 0x3f800000    # 1.0f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v18, -0x40800000    # -1.0f

    .line 419
    .line 420
    const v13, -0x40f33333    # -0.55f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/high16 v15, -0x40800000    # -1.0f

    .line 425
    .line 426
    const v16, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x3cf5c28f    # 0.03f

    .line 438
    .line 439
    .line 440
    const v18, -0x41e66666    # -0.15f

    .line 441
    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const v14, -0x42b33333    # -0.05f

    .line 445
    .line 446
    .line 447
    const v15, 0x3ca3d70a    # 0.02f

    .line 448
    .line 449
    .line 450
    const v16, -0x42333333    # -0.1f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x3ffc28f6    # 1.97f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41600000    # 14.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    const/16 v16, 0x3800

    .line 475
    .line 476
    const/16 v17, 0x0

    .line 477
    .line 478
    const/high16 v6, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v7, 0x0

    .line 481
    const/high16 v12, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, Landroidx/compose/material/icons/rounded/DirectionsOffKt;->_directionsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-object v0
.end method
