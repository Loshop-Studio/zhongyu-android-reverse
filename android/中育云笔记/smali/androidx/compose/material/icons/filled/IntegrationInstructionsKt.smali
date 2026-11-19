.class public final Landroidx/compose/material/icons/filled/IntegrationInstructionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIntegrationInstructions(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/IntegrationInstructionsKt;->_integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.IntegrationInstructions"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f7a3d71    # -4.18f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v13, 0x41666666    # 14.4f

    .line 88
    .line 89
    .line 90
    const v14, 0x3feb851f    # 1.84f

    .line 91
    .line 92
    .line 93
    const v15, 0x4154cccd    # 13.3f

    .line 94
    .line 95
    .line 96
    const/high16 v16, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3feb851f    # 1.84f

    .line 102
    .line 103
    .line 104
    const v2, 0x4112e148    # 9.18f

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40400000    # 3.0f

    .line 108
    .line 109
    const v6, 0x4119999a    # 9.6f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40a00000    # 5.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, 0x40933333    # 4.6f

    .line 121
    .line 122
    .line 123
    const v18, 0x40428f5c    # 3.04f

    .line 124
    .line 125
    .line 126
    const v13, 0x409b851f    # 4.86f

    .line 127
    .line 128
    .line 129
    const/high16 v14, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v15, 0x40975c29    # 4.73f

    .line 132
    .line 133
    .line 134
    const v16, 0x4040a3d7    # 3.01f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x4065c28f    # 3.59f

    .line 141
    .line 142
    .line 143
    const v18, 0x4065c28f    # 3.59f

    .line 144
    .line 145
    .line 146
    const v13, 0x4086b852    # 4.21f

    .line 147
    .line 148
    .line 149
    const v14, 0x4047ae14    # 3.12f

    .line 150
    .line 151
    .line 152
    const v15, 0x40770a3d    # 3.86f

    .line 153
    .line 154
    .line 155
    const v16, 0x40547ae1    # 3.32f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x4123d70a    # -0.43f

    .line 162
    .line 163
    .line 164
    const v18, 0x3f23d70a    # 0.64f

    .line 165
    .line 166
    .line 167
    const v13, -0x41c7ae14    # -0.18f

    .line 168
    .line 169
    .line 170
    const v14, 0x3e3851ec    # 0.18f

    .line 171
    .line 172
    .line 173
    const v15, -0x41570a3d    # -0.33f

    .line 174
    .line 175
    .line 176
    const v16, 0x3ecccccd    # 0.4f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x40400000    # 3.0f

    .line 183
    .line 184
    const/high16 v18, 0x40a00000    # 5.0f

    .line 185
    .line 186
    const v13, 0x4043d70a    # 3.06f

    .line 187
    .line 188
    .line 189
    const v14, 0x408eb852    # 4.46f

    .line 190
    .line 191
    .line 192
    const/high16 v15, 0x40400000    # 3.0f

    .line 193
    .line 194
    const v16, 0x40970a3d    # 4.72f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x41600000    # 14.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3e23d70a    # 0.16f

    .line 206
    .line 207
    .line 208
    const v18, 0x3f47ae14    # 0.78f

    .line 209
    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0x3e8a3d71    # 0.27f

    .line 213
    .line 214
    .line 215
    const v15, 0x3d75c28f    # 0.06f

    .line 216
    .line 217
    .line 218
    const v16, 0x3f0a3d71    # 0.54f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x3edc28f6    # 0.43f

    .line 225
    .line 226
    .line 227
    const v18, 0x3f23d70a    # 0.64f

    .line 228
    .line 229
    .line 230
    const v13, 0x3dcccccd    # 0.1f

    .line 231
    .line 232
    .line 233
    const v14, 0x3e75c28f    # 0.24f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x3e800000    # 0.25f

    .line 237
    .line 238
    const v16, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x3f8147ae    # 1.01f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    const v13, 0x3e8a3d71    # 0.27f

    .line 251
    .line 252
    .line 253
    const v14, 0x3e8a3d71    # 0.27f

    .line 254
    .line 255
    .line 256
    const v15, 0x3f1eb852    # 0.62f

    .line 257
    .line 258
    .line 259
    const v16, 0x3ef0a3d7    # 0.47f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40a00000    # 5.0f

    .line 266
    .line 267
    const/high16 v18, 0x41a80000    # 21.0f

    .line 268
    .line 269
    const v13, 0x40975c29    # 4.73f

    .line 270
    .line 271
    .line 272
    const v14, 0x41a7eb85    # 20.99f

    .line 273
    .line 274
    .line 275
    const v15, 0x409b851f    # 4.86f

    .line 276
    .line 277
    .line 278
    const/high16 v16, 0x41a80000    # 21.0f

    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40000000    # 2.0f

    .line 287
    .line 288
    const/high16 v18, -0x40000000    # -2.0f

    .line 289
    .line 290
    const v13, 0x3f8ccccd    # 1.1f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const/high16 v15, 0x40000000    # 2.0f

    .line 295
    .line 296
    const v16, -0x4099999a    # -0.9f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40a00000    # 5.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x41980000    # 19.0f

    .line 308
    .line 309
    const/high16 v18, 0x40400000    # 3.0f

    .line 310
    .line 311
    const/high16 v13, 0x41a80000    # 21.0f

    .line 312
    .line 313
    const v14, 0x4079999a    # 3.9f

    .line 314
    .line 315
    .line 316
    const v15, 0x41a0cccd    # 20.1f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x40400000    # 3.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4162b852    # 14.17f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x41300000    # 11.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, -0x404b851f    # -1.41f

    .line 336
    .line 337
    .line 338
    const v2, 0x3fb5c28f    # 1.42f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40c00000    # 6.0f

    .line 345
    .line 346
    const/high16 v2, 0x41400000    # 12.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x4065c28f    # 3.59f

    .line 352
    .line 353
    .line 354
    const v2, -0x3f9a3d71    # -3.59f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x411d47ae    # 9.83f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x41300000    # 11.0f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x410d47ae    # 8.83f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x41400000    # 12.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x4162b852    # 14.17f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x41300000    # 11.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40880000    # 4.25f

    .line 388
    .line 389
    const/high16 v2, 0x41400000    # 12.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, -0x40c00000    # -0.75f

    .line 395
    .line 396
    const/high16 v18, -0x40c00000    # -0.75f

    .line 397
    .line 398
    const v13, -0x412e147b    # -0.41f

    .line 399
    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/high16 v15, -0x40c00000    # -0.75f

    .line 403
    .line 404
    const v16, -0x4151eb85    # -0.34f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x413970a4    # 11.59f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x40300000    # 2.75f

    .line 414
    .line 415
    const/high16 v4, 0x41400000    # 12.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x3eae147b    # 0.34f

    .line 421
    .line 422
    .line 423
    const/high16 v2, 0x3f400000    # 0.75f

    .line 424
    .line 425
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x41468f5c    # 12.41f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x40880000    # 4.25f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x417970a4    # 15.59f

    .line 440
    .line 441
    .line 442
    const v2, 0x41668f5c    # 14.41f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x41500000    # 13.0f

    .line 449
    .line 450
    const v2, 0x4162b852    # 14.17f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x4172b852    # 15.17f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x41400000    # 12.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41500000    # 13.0f

    .line 465
    .line 466
    const v2, 0x411d47ae    # 9.83f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3fb47ae1    # 1.41f

    .line 473
    .line 474
    .line 475
    const v2, -0x404a3d71    # -1.42f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41900000    # 18.0f

    .line 482
    .line 483
    const/high16 v2, 0x41400000    # 12.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x417970a4    # 15.59f

    .line 489
    .line 490
    .line 491
    const v2, 0x41668f5c    # 14.41f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const/16 v16, 0x3800

    .line 505
    .line 506
    const/16 v17, 0x0

    .line 507
    .line 508
    const/high16 v6, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/high16 v8, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/4 v7, 0x0

    .line 513
    const/high16 v9, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/high16 v12, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/4 v13, 0x0

    .line 518
    const/4 v15, 0x0

    .line 519
    const-string v4, ""

    .line 520
    .line 521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    sput-object v0, Landroidx/compose/material/icons/filled/IntegrationInstructionsKt;->_integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    return-object v0
.end method
