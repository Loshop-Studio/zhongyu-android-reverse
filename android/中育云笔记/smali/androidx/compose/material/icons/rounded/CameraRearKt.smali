.class public final Landroidx/compose/material/icons/rounded/CameraRearKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _cameraRear:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCameraRear(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CameraRearKt;->_cameraRear:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CameraRear"

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
    const v0, 0x412d999a    # 10.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x4196cccd    # 18.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40a66666    # -0.85f

    .line 80
    .line 81
    .line 82
    const v18, 0x3eb851ec    # 0.36f

    .line 83
    .line 84
    .line 85
    const v13, -0x416147ae    # -0.31f

    .line 86
    .line 87
    .line 88
    const v14, -0x416147ae    # -0.31f

    .line 89
    .line 90
    .line 91
    const v15, -0x40a66666    # -0.85f

    .line 92
    .line 93
    .line 94
    const v16, -0x4247ae14    # -0.09f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41200000    # 10.0f

    .line 101
    .line 102
    const/high16 v2, 0x41a00000    # 20.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40c00000    # 6.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, -0x40800000    # -1.0f

    .line 113
    .line 114
    const/high16 v18, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const v13, -0x40f33333    # -0.55f

    .line 117
    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    const/high16 v15, -0x40800000    # -1.0f

    .line 121
    .line 122
    const v16, 0x3ee66666    # 0.45f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x3ee66666    # 0.45f

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x3f800000    # 1.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x3f4a3d71    # 0.79f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x3f59999a    # 0.85f

    .line 148
    .line 149
    .line 150
    const v18, 0x3eb33333    # 0.35f

    .line 151
    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const v14, 0x3ee66666    # 0.45f

    .line 155
    .line 156
    .line 157
    const v15, 0x3f0a3d71    # 0.54f

    .line 158
    .line 159
    .line 160
    const v16, 0x3f2b851f    # 0.67f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3fe51eb8    # 1.79f

    .line 167
    .line 168
    .line 169
    const v2, -0x401ae148    # -1.79f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const v18, -0x40ca3d71    # -0.71f

    .line 178
    .line 179
    .line 180
    const v13, 0x3e4ccccd    # 0.2f

    .line 181
    .line 182
    .line 183
    const v14, -0x41b33333    # -0.2f

    .line 184
    .line 185
    .line 186
    const v15, 0x3e4ccccd    # 0.2f

    .line 187
    .line 188
    .line 189
    const v16, -0x40fd70a4    # -0.51f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, -0x401ae148    # -1.79f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41900000    # 18.0f

    .line 205
    .line 206
    const/high16 v2, 0x41a00000    # 20.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, -0x40800000    # -1.0f

    .line 217
    .line 218
    const/high16 v18, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const v13, -0x40f33333    # -0.55f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const/high16 v15, -0x40800000    # -1.0f

    .line 225
    .line 226
    const v16, 0x3ee66666    # 0.45f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40400000    # 3.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v18, -0x40800000    # -1.0f

    .line 248
    .line 249
    const v13, 0x3f0ccccd    # 0.55f

    .line 250
    .line 251
    .line 252
    const/high16 v15, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const v16, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v2, -0x40800000    # -1.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41880000    # 17.0f

    .line 272
    .line 273
    const/4 v2, 0x0

    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40e00000    # 7.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x40a00000    # 5.0f

    .line 283
    .line 284
    const/high16 v18, 0x40000000    # 2.0f

    .line 285
    .line 286
    const v13, 0x40bccccd    # 5.9f

    .line 287
    .line 288
    .line 289
    const/high16 v15, 0x40a00000    # 5.0f

    .line 290
    .line 291
    const v16, 0x3f666666    # 0.9f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x41600000    # 14.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x40000000    # 2.0f

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const v14, 0x3f8ccccd    # 1.1f

    .line 306
    .line 307
    .line 308
    const v15, 0x3f666666    # 0.9f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x40000000    # 2.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41200000    # 10.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v18, -0x40000000    # -2.0f

    .line 322
    .line 323
    const v13, 0x3f8ccccd    # 1.1f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x40000000    # 2.0f

    .line 328
    .line 329
    const v16, -0x4099999a    # -0.9f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41980000    # 19.0f

    .line 336
    .line 337
    const/high16 v2, 0x40000000    # 2.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, -0x40000000    # -2.0f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x40733333    # -1.1f

    .line 346
    .line 347
    .line 348
    const v15, -0x4099999a    # -0.9f

    .line 349
    .line 350
    .line 351
    const/high16 v16, -0x40000000    # -2.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41400000    # 12.0f

    .line 360
    .line 361
    const/high16 v2, 0x40c00000    # 6.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v13, -0x4071eb85    # -1.11f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const/high16 v15, -0x40000000    # -2.0f

    .line 371
    .line 372
    const v16, -0x4099999a    # -0.9f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x3f63d70a    # 0.89f

    .line 379
    .line 380
    .line 381
    const v2, 0x3ffeb852    # 1.99f

    .line 382
    .line 383
    .line 384
    const/high16 v4, -0x40000000    # -2.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f666666    # 0.9f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x40000000    # 2.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, 0x41400000    # 12.0f

    .line 398
    .line 399
    const/high16 v18, 0x40c00000    # 6.0f

    .line 400
    .line 401
    const/high16 v13, 0x41600000    # 14.0f

    .line 402
    .line 403
    const v14, 0x40a33333    # 5.1f

    .line 404
    .line 405
    .line 406
    const v15, 0x4151999a    # 13.1f

    .line 407
    .line 408
    .line 409
    const/high16 v16, 0x40c00000    # 6.0f

    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/16 v16, 0x3800

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const/high16 v6, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/high16 v8, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/4 v7, 0x0

    .line 430
    const/high16 v9, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v12, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const/4 v14, 0x0

    .line 436
    const/4 v15, 0x0

    .line 437
    const-string v4, ""

    .line 438
    .line 439
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sput-object v0, Landroidx/compose/material/icons/rounded/CameraRearKt;->_cameraRear:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 448
    .line 449
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    return-object v0
.end method
