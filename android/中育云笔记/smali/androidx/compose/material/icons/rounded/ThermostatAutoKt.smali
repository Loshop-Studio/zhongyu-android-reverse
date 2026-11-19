.class public final Landroidx/compose/material/icons/rounded/ThermostatAutoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thermostatAuto:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThermostatAuto(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ThermostatAutoKt;->_thermostatAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ThermostatAuto"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 83
    .line 84
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x402b851f    # -1.66f

    .line 88
    .line 89
    .line 90
    const v15, -0x40547ae1    # -1.34f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x408ae148    # 4.34f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x40a00000    # 5.0f

    .line 102
    .line 103
    const/high16 v4, 0x40c00000    # 6.0f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40c00000    # 6.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, -0x40000000    # -2.0f

    .line 114
    .line 115
    const/high16 v18, 0x40800000    # 4.0f

    .line 116
    .line 117
    const v13, -0x40651eb8    # -1.21f

    .line 118
    .line 119
    .line 120
    const v14, 0x3f68f5c3    # 0.91f

    .line 121
    .line 122
    .line 123
    const/high16 v15, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v16, 0x4017ae14    # 2.37f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const v18, 0x403e147b    # 2.97f

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3f8f5c29    # 1.12f

    .line 138
    .line 139
    .line 140
    const v15, 0x3ec28f5c    # 0.38f

    .line 141
    .line 142
    .line 143
    const v16, 0x4008f5c3    # 2.14f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x41980000    # 19.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x3ca3d70a    # 0.02f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x407eb852    # 3.98f

    .line 161
    .line 162
    .line 163
    const/high16 v18, 0x40000000    # 2.0f

    .line 164
    .line 165
    const v13, 0x3f68f5c3    # 0.91f

    .line 166
    .line 167
    .line 168
    const v14, 0x3f9ae148    # 1.21f

    .line 169
    .line 170
    .line 171
    const v15, 0x40166666    # 2.35f

    .line 172
    .line 173
    .line 174
    const/high16 v16, 0x40000000    # 2.0f

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x407eb852    # 3.98f

    .line 180
    .line 181
    .line 182
    const/high16 v2, -0x40000000    # -2.0f

    .line 183
    .line 184
    const v4, 0x4043d70a    # 3.06f

    .line 185
    .line 186
    .line 187
    const v6, -0x40b5c28f    # -0.79f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41400000    # 12.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x430a3d71    # -0.03f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const v18, -0x3fc1eb85    # -2.97f

    .line 207
    .line 208
    .line 209
    const v13, 0x3f1eb852    # 0.62f

    .line 210
    .line 211
    .line 212
    const v14, -0x40ab851f    # -0.83f

    .line 213
    .line 214
    .line 215
    const/high16 v15, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const v16, -0x40133333    # -1.85f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41300000    # 11.0f

    .line 224
    .line 225
    const/high16 v18, 0x41400000    # 12.0f

    .line 226
    .line 227
    const/high16 v13, 0x41500000    # 13.0f

    .line 228
    .line 229
    const v14, 0x4165eb85    # 14.37f

    .line 230
    .line 231
    .line 232
    const v15, 0x41435c29    # 12.21f

    .line 233
    .line 234
    .line 235
    const v16, 0x414e8f5c    # 12.91f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41800000    # 16.0f

    .line 245
    .line 246
    const/high16 v2, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x3f99999a    # 1.2f

    .line 252
    .line 253
    .line 254
    const v18, -0x3fe66666    # -2.4f

    .line 255
    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, -0x408f5c29    # -0.94f

    .line 259
    .line 260
    .line 261
    const v15, 0x3ee66666    # 0.45f

    .line 262
    .line 263
    .line 264
    const v16, -0x40147ae1    # -1.84f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41500000    # 13.0f

    .line 271
    .line 272
    const/high16 v2, 0x40e00000    # 7.0f

    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40c00000    # 6.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v18, -0x40800000    # -1.0f

    .line 285
    .line 286
    const v14, -0x40f33333    # -0.55f

    .line 287
    .line 288
    .line 289
    const/high16 v16, -0x40800000    # -1.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40e00000    # 7.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x3f4ccccd    # 0.8f

    .line 308
    .line 309
    .line 310
    const v2, 0x3f19999a    # 0.6f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x3f99999a    # 1.2f

    .line 317
    .line 318
    .line 319
    const v18, 0x4019999a    # 2.4f

    .line 320
    .line 321
    .line 322
    const/high16 v13, 0x3f400000    # 0.75f

    .line 323
    .line 324
    const v14, 0x3f11eb85    # 0.57f

    .line 325
    .line 326
    .line 327
    const v15, 0x3f99999a    # 1.2f

    .line 328
    .line 329
    .line 330
    const v16, 0x3fbae148    # 1.46f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x40a00000    # 5.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40800000    # 4.0f

    .line 345
    .line 346
    const v2, 0x418e7ae1    # 17.81f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x40747ae1    # -1.09f

    .line 356
    .line 357
    .line 358
    const/high16 v18, 0x3f400000    # 0.75f

    .line 359
    .line 360
    const v13, -0x410a3d71    # -0.48f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const v15, -0x40947ae1    # -0.92f

    .line 365
    .line 366
    .line 367
    const v16, 0x3e99999a    # 0.3f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41600000    # 14.0f

    .line 374
    .line 375
    const v2, 0x414051ec    # 12.02f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x416ab852    # 14.67f

    .line 382
    .line 383
    .line 384
    const/high16 v18, 0x41500000    # 13.0f

    .line 385
    .line 386
    const v13, 0x415d1eb8    # 13.82f

    .line 387
    .line 388
    .line 389
    const v14, 0x4147d70a    # 12.49f

    .line 390
    .line 391
    .line 392
    const v15, 0x4162b852    # 14.17f

    .line 393
    .line 394
    .line 395
    const/high16 v16, 0x41500000    # 13.0f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/4 v0, 0x0

    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3f2e147b    # 0.68f

    .line 405
    .line 406
    .line 407
    const v18, -0x410a3d71    # -0.48f

    .line 408
    .line 409
    .line 410
    const v13, 0x3e9eb852    # 0.31f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, 0x3f147ae1    # 0.58f

    .line 415
    .line 416
    .line 417
    const v16, -0x41bd70a4    # -0.19f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x412b3333    # 10.7f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x41800000    # 16.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x406851ec    # 3.63f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3f23d70a    # 0.64f

    .line 438
    .line 439
    .line 440
    const v2, 0x3fe8f5c3    # 1.82f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v18, 0x3ef5c28f    # 0.48f

    .line 447
    .line 448
    .line 449
    const v13, 0x3dcccccd    # 0.1f

    .line 450
    .line 451
    .line 452
    const v14, 0x3e947ae1    # 0.29f

    .line 453
    .line 454
    .line 455
    const v15, 0x3ec28f5c    # 0.38f

    .line 456
    .line 457
    .line 458
    const v16, 0x3ef5c28f    # 0.48f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v18, -0x40851eb8    # -0.98f

    .line 469
    .line 470
    .line 471
    const v13, 0x3f028f5c    # 0.51f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const v15, 0x3f5c28f6    # 0.86f

    .line 476
    .line 477
    .line 478
    const v16, -0x40fd70a4    # -0.51f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x41973333    # 18.9f

    .line 485
    .line 486
    .line 487
    const/high16 v2, 0x40980000    # 4.75f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x418e7ae1    # 17.81f

    .line 493
    .line 494
    .line 495
    const/high16 v18, 0x40800000    # 4.0f

    .line 496
    .line 497
    const v13, 0x4195d70a    # 18.73f

    .line 498
    .line 499
    .line 500
    const v14, 0x4089999a    # 4.3f

    .line 501
    .line 502
    .line 503
    const v15, 0x41926666    # 18.3f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x40800000    # 4.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x41163d71    # 9.39f

    .line 515
    .line 516
    .line 517
    const v2, 0x4183c28f    # 16.47f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, -0x3f91eb85    # -3.72f

    .line 524
    .line 525
    .line 526
    const v2, 0x3fa7ae14    # 1.31f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, 0x3da3d70a    # 0.08f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x406e147b    # 3.72f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x4183c28f    # 16.47f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    const/16 v16, 0x3800

    .line 558
    .line 559
    const/16 v17, 0x0

    .line 560
    .line 561
    const/high16 v6, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/high16 v8, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v7, 0x0

    .line 566
    const/high16 v9, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v12, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const/4 v14, 0x0

    .line 572
    const/4 v15, 0x0

    .line 573
    const-string v4, ""

    .line 574
    .line 575
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    sput-object v0, Landroidx/compose/material/icons/rounded/ThermostatAutoKt;->_thermostatAuto:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    return-object v0
.end method
