.class public final Landroidx/compose/material/icons/filled/SoupKitchenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoupKitchen(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SoupKitchen"

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
    const v0, 0x40cccccd    # 6.4f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40c00000    # 6.0f

    .line 79
    .line 80
    const v18, 0x4106147b    # 8.38f

    .line 81
    .line 82
    .line 83
    const v13, 0x40c1eb85    # 6.06f

    .line 84
    .line 85
    .line 86
    const v14, 0x40f1999a    # 7.55f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x40c00000    # 6.0f

    .line 90
    .line 91
    const v16, 0x40ff0a3d    # 7.97f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40e00000    # 7.0f

    .line 98
    .line 99
    const/high16 v18, 0x41400000    # 12.0f

    .line 100
    .line 101
    const/high16 v13, 0x40c00000    # 6.0f

    .line 102
    .line 103
    const v14, 0x41126666    # 9.15f

    .line 104
    .line 105
    .line 106
    const/high16 v15, 0x40e00000    # 7.0f

    .line 107
    .line 108
    const/high16 v16, 0x41300000    # 11.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x41333333    # -0.4f

    .line 114
    .line 115
    .line 116
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const v14, 0x3f733333    # 0.95f

    .line 120
    .line 121
    .line 122
    const v15, -0x41333333    # -0.4f

    .line 123
    .line 124
    .line 125
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x40a33333    # 5.1f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3ecccccd    # 0.4f

    .line 137
    .line 138
    .line 139
    const/high16 v18, -0x40400000    # -1.5f

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const v15, 0x3ecccccd    # 0.4f

    .line 143
    .line 144
    .line 145
    const v16, -0x40f33333    # -0.55f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x40800000    # -1.0f

    .line 152
    .line 153
    const v18, -0x3f9851ec    # -3.62f

    .line 154
    .line 155
    .line 156
    const/high16 v14, -0x40800000    # -1.0f

    .line 157
    .line 158
    const/high16 v15, -0x40800000    # -1.0f

    .line 159
    .line 160
    const v16, -0x3fc9999a    # -2.85f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x409ccccd    # 4.9f

    .line 167
    .line 168
    .line 169
    const/high16 v18, 0x40e00000    # 7.0f

    .line 170
    .line 171
    const/high16 v13, 0x40900000    # 4.5f

    .line 172
    .line 173
    const v14, 0x40ff0a3d    # 7.97f

    .line 174
    .line 175
    .line 176
    const v15, 0x4091eb85    # 4.56f

    .line 177
    .line 178
    .line 179
    const v16, 0x40f1999a    # 7.55f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40cccccd    # 6.4f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x41366666    # 11.4f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41300000    # 11.0f

    .line 201
    .line 202
    const v18, 0x4106147b    # 8.38f

    .line 203
    .line 204
    .line 205
    const v13, 0x4130f5c3    # 11.06f

    .line 206
    .line 207
    .line 208
    const v14, 0x40f1999a    # 7.55f

    .line 209
    .line 210
    .line 211
    const/high16 v15, 0x41300000    # 11.0f

    .line 212
    .line 213
    const v16, 0x40ff0a3d    # 7.97f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x41400000    # 12.0f

    .line 220
    .line 221
    const/high16 v18, 0x41400000    # 12.0f

    .line 222
    .line 223
    const/high16 v13, 0x41300000    # 11.0f

    .line 224
    .line 225
    const v14, 0x41126666    # 9.15f

    .line 226
    .line 227
    .line 228
    const/high16 v15, 0x41400000    # 12.0f

    .line 229
    .line 230
    const/high16 v16, 0x41300000    # 11.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x41333333    # -0.4f

    .line 236
    .line 237
    .line 238
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3f733333    # 0.95f

    .line 242
    .line 243
    .line 244
    const v15, -0x41333333    # -0.4f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3ecccccd    # 0.4f

    .line 258
    .line 259
    .line 260
    const/high16 v18, -0x40400000    # -1.5f

    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, 0x3ecccccd    # 0.4f

    .line 264
    .line 265
    .line 266
    const v16, -0x40f33333    # -0.55f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, -0x40800000    # -1.0f

    .line 273
    .line 274
    const v18, -0x3f9851ec    # -3.62f

    .line 275
    .line 276
    .line 277
    const/high16 v14, -0x40800000    # -1.0f

    .line 278
    .line 279
    const/high16 v15, -0x40800000    # -1.0f

    .line 280
    .line 281
    const v16, -0x3fc9999a    # -2.85f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3ecccccd    # 0.4f

    .line 288
    .line 289
    .line 290
    const v18, -0x404f5c29    # -1.38f

    .line 291
    .line 292
    .line 293
    const v14, -0x412e147b    # -0.41f

    .line 294
    .line 295
    .line 296
    const v15, 0x3d75c28f    # 0.06f

    .line 297
    .line 298
    .line 299
    const v16, -0x40ab851f    # -0.83f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x41366666    # 11.4f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x41026666    # 8.15f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x41333333    # -0.4f

    .line 321
    .line 322
    .line 323
    const v18, 0x3fb0a3d7    # 1.38f

    .line 324
    .line 325
    .line 326
    const v13, -0x4151eb85    # -0.34f

    .line 327
    .line 328
    .line 329
    const v14, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const v15, -0x41333333    # -0.4f

    .line 333
    .line 334
    .line 335
    const v16, 0x3f7851ec    # 0.97f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v18, 0x4067ae14    # 3.62f

    .line 344
    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, 0x3f451eb8    # 0.77f

    .line 348
    .line 349
    .line 350
    const/high16 v15, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const v16, 0x402851ec    # 2.63f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x41333333    # -0.4f

    .line 359
    .line 360
    .line 361
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const v14, 0x3f733333    # 0.95f

    .line 364
    .line 365
    .line 366
    const v15, -0x41333333    # -0.4f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3ecccccd    # 0.4f

    .line 380
    .line 381
    .line 382
    const/high16 v18, -0x40400000    # -1.5f

    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const v15, 0x3ecccccd    # 0.4f

    .line 386
    .line 387
    .line 388
    const v16, -0x40f33333    # -0.55f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, -0x40800000    # -1.0f

    .line 395
    .line 396
    const v18, -0x3f9851ec    # -3.62f

    .line 397
    .line 398
    .line 399
    const/high16 v14, -0x40800000    # -1.0f

    .line 400
    .line 401
    const/high16 v15, -0x40800000    # -1.0f

    .line 402
    .line 403
    const v16, -0x3fc9999a    # -2.85f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x3ecccccd    # 0.4f

    .line 410
    .line 411
    .line 412
    const v18, -0x404f5c29    # -1.38f

    .line 413
    .line 414
    .line 415
    const v14, -0x412e147b    # -0.41f

    .line 416
    .line 417
    .line 418
    const v15, 0x3d75c28f    # 0.06f

    .line 419
    .line 420
    .line 421
    const v16, -0x40ab851f    # -0.83f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x41026666    # 8.15f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x40d00000    # 6.5f

    .line 437
    .line 438
    const v2, 0x41abc28f    # 21.47f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3e051eb8    # 0.13f

    .line 445
    .line 446
    .line 447
    const/high16 v18, -0x40400000    # -1.5f

    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const v15, 0x3e051eb8    # 0.13f

    .line 451
    .line 452
    .line 453
    const v16, -0x407851ec    # -1.06f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 460
    .line 461
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 462
    .line 463
    const v14, -0x402ccccd    # -1.65f

    .line 464
    .line 465
    .line 466
    const v15, -0x40533333    # -1.35f

    .line 467
    .line 468
    .line 469
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, -0x3fc147ae    # -2.98f

    .line 475
    .line 476
    .line 477
    const v18, 0x4029999a    # 2.65f

    .line 478
    .line 479
    .line 480
    const v13, -0x403ae148    # -1.54f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const v15, -0x3fcc28f6    # -2.81f

    .line 485
    .line 486
    .line 487
    const v16, 0x3f947ae1    # 1.16f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x41687ae1    # 14.53f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x41700000    # 15.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x408051ec    # 4.01f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, -0x40800000    # -1.0f

    .line 508
    .line 509
    const v18, 0x3f90a3d7    # 1.13f

    .line 510
    .line 511
    .line 512
    const v13, -0x40e66666    # -0.6f

    .line 513
    .line 514
    .line 515
    const v15, -0x40747ae1    # -1.09f

    .line 516
    .line 517
    .line 518
    const v16, 0x3f07ae14    # 0.53f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x411c0000    # 9.75f

    .line 525
    .line 526
    const/high16 v18, 0x41b00000    # 22.0f

    .line 527
    .line 528
    const v13, 0x4061eb85    # 3.53f

    .line 529
    .line 530
    .line 531
    const v14, 0x419bae14    # 19.46f

    .line 532
    .line 533
    .line 534
    const v15, 0x40cc7ae1    # 6.39f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x41b00000    # 22.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, 0x40d6b852    # 6.71f

    .line 543
    .line 544
    .line 545
    const v18, -0x3f38a3d7    # -6.23f

    .line 546
    .line 547
    .line 548
    const v13, 0x405eb852    # 3.48f

    .line 549
    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    const v15, 0x40cae148    # 6.34f

    .line 553
    .line 554
    .line 555
    const v16, -0x3fd147ae    # -2.73f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x3f933333    # 1.15f

    .line 562
    .line 563
    .line 564
    const v2, -0x3ed2147b    # -10.87f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x4194cccd    # 18.6f

    .line 571
    .line 572
    .line 573
    const/high16 v18, 0x40800000    # 4.0f

    .line 574
    .line 575
    const v13, 0x418d47ae    # 17.66f

    .line 576
    .line 577
    .line 578
    const v14, 0x408c7ae1    # 4.39f

    .line 579
    .line 580
    .line 581
    const v15, 0x4190a3d7    # 18.08f

    .line 582
    .line 583
    .line 584
    const/high16 v16, 0x40800000    # 4.0f

    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v18, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const v13, 0x3f0ccccd    # 0.55f

    .line 594
    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    const/high16 v15, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const v16, 0x3ee66666    # 0.45f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x42333333    # -0.1f

    .line 606
    .line 607
    .line 608
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 609
    .line 610
    const/4 v13, 0x0

    .line 611
    const v14, 0x3e99999a    # 0.3f

    .line 612
    .line 613
    .line 614
    const v15, -0x42333333    # -0.1f

    .line 615
    .line 616
    .line 617
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x40d00000    # 6.5f

    .line 623
    .line 624
    const v2, 0x41abc28f    # 21.47f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    const/16 v16, 0x3800

    .line 638
    .line 639
    const/16 v17, 0x0

    .line 640
    .line 641
    const/high16 v6, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/high16 v8, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const/4 v7, 0x0

    .line 646
    const/high16 v9, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v12, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const/4 v15, 0x0

    .line 652
    const-string v4, ""

    .line 653
    .line 654
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    sput-object v0, Landroidx/compose/material/icons/filled/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    return-object v0
.end method
