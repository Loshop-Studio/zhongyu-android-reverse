.class public final Landroidx/compose/material/icons/twotone/SoupKitchenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoupKitchen(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SoupKitchen"

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
    const v4, 0x4161eb85    # 14.12f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3f7428f6    # -4.37f

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40400000    # 3.0f

    .line 82
    .line 83
    const v21, -0x40c51eb8    # -0.73f

    .line 84
    .line 85
    .line 86
    const v22, 0x3fe3d70a    # 1.78f

    .line 87
    .line 88
    .line 89
    const v23, -0x3fe47ae1    # -2.43f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40400000    # 3.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f723d71    # -4.43f

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 103
    .line 104
    const v21, -0x4007ae14    # -1.94f

    .line 105
    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const v23, -0x3f951eb8    # -3.67f

    .line 110
    .line 111
    .line 112
    const v24, -0x40628f5c    # -1.23f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x410c7ae1    # 8.78f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/16 v16, 0x3800

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const v6, 0x3e99999a    # 0.3f

    .line 133
    .line 134
    .line 135
    const v8, 0x3e99999a    # 0.3f

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/high16 v9, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v12, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const-string v4, ""

    .line 147
    .line 148
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const v0, 0x40cccccd    # 6.4f

    .line 179
    .line 180
    .line 181
    const/high16 v2, 0x40e00000    # 7.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v17, 0x40c00000    # 6.0f

    .line 187
    .line 188
    const v18, 0x4106147b    # 8.38f

    .line 189
    .line 190
    .line 191
    const v13, 0x40c1eb85    # 6.06f

    .line 192
    .line 193
    .line 194
    const v14, 0x40f1999a    # 7.55f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v16, 0x40ff0a3d    # 7.97f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x40e00000    # 7.0f

    .line 206
    .line 207
    const/high16 v18, 0x41400000    # 12.0f

    .line 208
    .line 209
    const/high16 v13, 0x40c00000    # 6.0f

    .line 210
    .line 211
    const v14, 0x41126666    # 9.15f

    .line 212
    .line 213
    .line 214
    const/high16 v15, 0x40e00000    # 7.0f

    .line 215
    .line 216
    const/high16 v16, 0x41300000    # 11.0f

    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, -0x41333333    # -0.4f

    .line 222
    .line 223
    .line 224
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, 0x3f733333    # 0.95f

    .line 228
    .line 229
    .line 230
    const v15, -0x41333333    # -0.4f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x40a33333    # 5.1f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x3ecccccd    # 0.4f

    .line 245
    .line 246
    .line 247
    const/high16 v18, -0x40400000    # -1.5f

    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const v15, 0x3ecccccd    # 0.4f

    .line 251
    .line 252
    .line 253
    const v16, -0x40f33333    # -0.55f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x40800000    # -1.0f

    .line 260
    .line 261
    const v18, -0x3f9851ec    # -3.62f

    .line 262
    .line 263
    .line 264
    const/high16 v14, -0x40800000    # -1.0f

    .line 265
    .line 266
    const/high16 v15, -0x40800000    # -1.0f

    .line 267
    .line 268
    const v16, -0x3fc9999a    # -2.85f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, 0x409ccccd    # 4.9f

    .line 275
    .line 276
    .line 277
    const/high16 v18, 0x40e00000    # 7.0f

    .line 278
    .line 279
    const/high16 v13, 0x40900000    # 4.5f

    .line 280
    .line 281
    const v14, 0x40ff0a3d    # 7.97f

    .line 282
    .line 283
    .line 284
    const v15, 0x4091eb85    # 4.56f

    .line 285
    .line 286
    .line 287
    const v16, 0x40f1999a    # 7.55f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x40cccccd    # 6.4f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x41366666    # 11.4f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x41300000    # 11.0f

    .line 309
    .line 310
    const v18, 0x4106147b    # 8.38f

    .line 311
    .line 312
    .line 313
    const v13, 0x4130f5c3    # 11.06f

    .line 314
    .line 315
    .line 316
    const v14, 0x40f1999a    # 7.55f

    .line 317
    .line 318
    .line 319
    const/high16 v15, 0x41300000    # 11.0f

    .line 320
    .line 321
    const v16, 0x40ff0a3d    # 7.97f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x41400000    # 12.0f

    .line 328
    .line 329
    const/high16 v18, 0x41400000    # 12.0f

    .line 330
    .line 331
    const/high16 v13, 0x41300000    # 11.0f

    .line 332
    .line 333
    const v14, 0x41126666    # 9.15f

    .line 334
    .line 335
    .line 336
    const/high16 v15, 0x41400000    # 12.0f

    .line 337
    .line 338
    const/high16 v16, 0x41300000    # 11.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x41333333    # -0.4f

    .line 344
    .line 345
    .line 346
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const v14, 0x3f733333    # 0.95f

    .line 350
    .line 351
    .line 352
    const v15, -0x41333333    # -0.4f

    .line 353
    .line 354
    .line 355
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x3ecccccd    # 0.4f

    .line 366
    .line 367
    .line 368
    const/high16 v18, -0x40400000    # -1.5f

    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const v15, 0x3ecccccd    # 0.4f

    .line 372
    .line 373
    .line 374
    const v16, -0x40f33333    # -0.55f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40800000    # -1.0f

    .line 381
    .line 382
    const v18, -0x3f9851ec    # -3.62f

    .line 383
    .line 384
    .line 385
    const/high16 v14, -0x40800000    # -1.0f

    .line 386
    .line 387
    const/high16 v15, -0x40800000    # -1.0f

    .line 388
    .line 389
    const v16, -0x3fc9999a    # -2.85f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x3ecccccd    # 0.4f

    .line 396
    .line 397
    .line 398
    const v18, -0x404f5c29    # -1.38f

    .line 399
    .line 400
    .line 401
    const v14, -0x412e147b    # -0.41f

    .line 402
    .line 403
    .line 404
    const v15, 0x3d75c28f    # 0.06f

    .line 405
    .line 406
    .line 407
    const v16, -0x40ab851f    # -0.83f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x41366666    # 11.4f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x41026666    # 8.15f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x41333333    # -0.4f

    .line 429
    .line 430
    .line 431
    const v18, 0x3fb0a3d7    # 1.38f

    .line 432
    .line 433
    .line 434
    const v13, -0x4151eb85    # -0.34f

    .line 435
    .line 436
    .line 437
    const v14, 0x3f0ccccd    # 0.55f

    .line 438
    .line 439
    .line 440
    const v15, -0x41333333    # -0.4f

    .line 441
    .line 442
    .line 443
    const v16, 0x3f7851ec    # 0.97f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const v18, 0x4067ae14    # 3.62f

    .line 452
    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3f451eb8    # 0.77f

    .line 456
    .line 457
    .line 458
    const/high16 v15, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const v16, 0x402851ec    # 2.63f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x41333333    # -0.4f

    .line 467
    .line 468
    .line 469
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 470
    .line 471
    const v14, 0x3f733333    # 0.95f

    .line 472
    .line 473
    .line 474
    const v15, -0x41333333    # -0.4f

    .line 475
    .line 476
    .line 477
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x3ecccccd    # 0.4f

    .line 488
    .line 489
    .line 490
    const/high16 v18, -0x40400000    # -1.5f

    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const v15, 0x3ecccccd    # 0.4f

    .line 494
    .line 495
    .line 496
    const v16, -0x40f33333    # -0.55f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, -0x40800000    # -1.0f

    .line 503
    .line 504
    const v18, -0x3f9851ec    # -3.62f

    .line 505
    .line 506
    .line 507
    const/high16 v14, -0x40800000    # -1.0f

    .line 508
    .line 509
    const/high16 v15, -0x40800000    # -1.0f

    .line 510
    .line 511
    const v16, -0x3fc9999a    # -2.85f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x3ecccccd    # 0.4f

    .line 518
    .line 519
    .line 520
    const v18, -0x404f5c29    # -1.38f

    .line 521
    .line 522
    .line 523
    const v14, -0x412e147b    # -0.41f

    .line 524
    .line 525
    .line 526
    const v15, 0x3d75c28f    # 0.06f

    .line 527
    .line 528
    .line 529
    const v16, -0x40ab851f    # -0.83f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x41026666    # 8.15f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x4194cccd    # 18.6f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x40000000    # 2.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x3fc147ae    # -2.98f

    .line 553
    .line 554
    .line 555
    const v18, 0x4029999a    # 2.65f

    .line 556
    .line 557
    .line 558
    const v13, -0x403ae148    # -1.54f

    .line 559
    .line 560
    .line 561
    const/4 v14, 0x0

    .line 562
    const v15, -0x3fcc28f6    # -2.81f

    .line 563
    .line 564
    .line 565
    const v16, 0x3f947ae1    # 1.16f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x41687ae1    # 14.53f

    .line 572
    .line 573
    .line 574
    const/high16 v2, 0x41700000    # 15.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x408051ec    # 4.01f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, -0x40800000    # -1.0f

    .line 586
    .line 587
    const v18, 0x3f90a3d7    # 1.13f

    .line 588
    .line 589
    .line 590
    const v13, -0x40e66666    # -0.6f

    .line 591
    .line 592
    .line 593
    const v15, -0x40747ae1    # -1.09f

    .line 594
    .line 595
    .line 596
    const v16, 0x3f07ae14    # 0.53f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, 0x411c0000    # 9.75f

    .line 603
    .line 604
    const/high16 v18, 0x41b00000    # 22.0f

    .line 605
    .line 606
    const v13, 0x4061eb85    # 3.53f

    .line 607
    .line 608
    .line 609
    const v14, 0x419bae14    # 19.46f

    .line 610
    .line 611
    .line 612
    const v15, 0x40cc7ae1    # 6.39f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x41b00000    # 22.0f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, 0x40d6b852    # 6.71f

    .line 621
    .line 622
    .line 623
    const v18, -0x3f38a3d7    # -6.23f

    .line 624
    .line 625
    .line 626
    const v13, 0x405eb852    # 3.48f

    .line 627
    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    const v15, 0x40cae148    # 6.34f

    .line 631
    .line 632
    .line 633
    const v16, -0x3fd147ae    # -2.73f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x3f933333    # 1.15f

    .line 640
    .line 641
    .line 642
    const v2, -0x3ed2147b    # -10.87f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v17, 0x4194cccd    # 18.6f

    .line 649
    .line 650
    .line 651
    const/high16 v18, 0x40800000    # 4.0f

    .line 652
    .line 653
    const v13, 0x418d47ae    # 17.66f

    .line 654
    .line 655
    .line 656
    const v14, 0x408c7ae1    # 4.39f

    .line 657
    .line 658
    .line 659
    const v15, 0x4190a3d7    # 18.08f

    .line 660
    .line 661
    .line 662
    const/high16 v16, 0x40800000    # 4.0f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v17, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v18, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const v13, 0x3f0ccccd    # 0.55f

    .line 672
    .line 673
    .line 674
    const/4 v14, 0x0

    .line 675
    const/high16 v15, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const v16, 0x3ee66666    # 0.45f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, -0x42333333    # -0.1f

    .line 684
    .line 685
    .line 686
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const v14, 0x3e99999a    # 0.3f

    .line 690
    .line 691
    .line 692
    const v15, -0x42333333    # -0.1f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3ffc28f6    # 1.97f

    .line 701
    .line 702
    .line 703
    const/high16 v2, 0x3e800000    # 0.25f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v17, 0x3e051eb8    # 0.13f

    .line 709
    .line 710
    .line 711
    const/high16 v18, -0x40400000    # -1.5f

    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const v15, 0x3e051eb8    # 0.13f

    .line 715
    .line 716
    .line 717
    const v16, -0x407851ec    # -1.06f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v17, 0x4194cccd    # 18.6f

    .line 724
    .line 725
    .line 726
    const/high16 v18, 0x40000000    # 2.0f

    .line 727
    .line 728
    const v13, 0x41accccd    # 21.6f

    .line 729
    .line 730
    .line 731
    const v14, 0x40566666    # 3.35f

    .line 732
    .line 733
    .line 734
    const/high16 v15, 0x41a20000    # 20.25f

    .line 735
    .line 736
    const/high16 v16, 0x40000000    # 2.0f

    .line 737
    .line 738
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v0, 0x411c0000    # 9.75f

    .line 745
    .line 746
    const/high16 v2, 0x41a00000    # 20.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v17, -0x3f723d71    # -4.43f

    .line 752
    .line 753
    .line 754
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 755
    .line 756
    const v13, -0x4007ae14    # -1.94f

    .line 757
    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    const v15, -0x3f951eb8    # -3.67f

    .line 761
    .line 762
    .line 763
    const v16, -0x40628f5c    # -1.23f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x410c7ae1    # 8.78f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x3c23d70a    # 0.01f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, 0x411c0000    # 9.75f

    .line 782
    .line 783
    const/high16 v18, 0x41a00000    # 20.0f

    .line 784
    .line 785
    const v13, 0x41563d71    # 13.39f

    .line 786
    .line 787
    .line 788
    const v14, 0x41963d71    # 18.78f

    .line 789
    .line 790
    .line 791
    const v15, 0x413b0a3d    # 11.69f

    .line 792
    .line 793
    .line 794
    const/high16 v16, 0x41a00000    # 20.0f

    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    const/16 v16, 0x3800

    .line 807
    .line 808
    const/16 v17, 0x0

    .line 809
    .line 810
    const/high16 v6, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const/high16 v8, 0x3f800000    # 1.0f

    .line 813
    .line 814
    const/4 v7, 0x0

    .line 815
    const/high16 v12, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const/4 v14, 0x0

    .line 819
    const/4 v15, 0x0

    .line 820
    const-string v4, ""

    .line 821
    .line 822
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    sput-object v0, Landroidx/compose/material/icons/twotone/SoupKitchenKt;->_soupKitchen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    return-object v0
.end method
