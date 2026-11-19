.class public final Landroidx/compose/material/icons/twotone/CatchingPokemonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _catchingPokemon:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCatchingPokemon(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CatchingPokemonKt;->_catchingPokemon:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CatchingPokemon"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x40fe147b    # 7.94f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x40e00000    # 7.0f

    .line 81
    .line 82
    const v21, 0x40828f5c    # 4.08f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, 0x40ee6666    # 7.45f

    .line 88
    .line 89
    .line 90
    const v24, 0x40433333    # 3.05f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, -0x3f7e147b    # -4.06f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x41400000    # 12.0f

    .line 105
    .line 106
    const/high16 v26, 0x41000000    # 8.0f

    .line 107
    .line 108
    const v21, 0x4176e148    # 15.43f

    .line 109
    .line 110
    .line 111
    const v22, 0x411451ec    # 9.27f

    .line 112
    .line 113
    .line 114
    const v23, 0x415dc28f    # 13.86f

    .line 115
    .line 116
    .line 117
    const/high16 v24, 0x41000000    # 8.0f

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40400000    # 3.0f

    .line 123
    .line 124
    const v6, -0x3f8851ec    # -3.87f

    .line 125
    .line 126
    .line 127
    const v7, 0x3fa28f5c    # 1.27f

    .line 128
    .line 129
    .line 130
    const v8, -0x3fa47ae1    # -3.43f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x4081eb85    # 4.06f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v26, 0x40800000    # 4.0f

    .line 143
    .line 144
    const v21, 0x4091999a    # 4.55f

    .line 145
    .line 146
    .line 147
    const v22, 0x40e1999a    # 7.05f

    .line 148
    .line 149
    .line 150
    const v23, 0x40fd70a4    # 7.92f

    .line 151
    .line 152
    .line 153
    const/high16 v24, 0x40800000    # 4.0f

    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const/16 v16, 0x3800

    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const v6, 0x3e99999a    # 0.3f

    .line 170
    .line 171
    .line 172
    const v8, 0x3e99999a    # 0.3f

    .line 173
    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/high16 v2, 0x41400000    # 12.0f

    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x40000000    # 2.0f

    .line 223
    .line 224
    const/high16 v18, 0x41400000    # 12.0f

    .line 225
    .line 226
    const v13, 0x40cf5c29    # 6.48f

    .line 227
    .line 228
    .line 229
    const/high16 v14, 0x40000000    # 2.0f

    .line 230
    .line 231
    const/high16 v15, 0x40000000    # 2.0f

    .line 232
    .line 233
    const v16, 0x40cf5c29    # 6.48f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x41200000    # 10.0f

    .line 240
    .line 241
    const/high16 v18, 0x41200000    # 10.0f

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const v14, 0x40b0a3d7    # 5.52f

    .line 245
    .line 246
    .line 247
    const v15, 0x408f5c29    # 4.48f

    .line 248
    .line 249
    .line 250
    const/high16 v16, 0x41200000    # 10.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x3f70a3d7    # -4.48f

    .line 256
    .line 257
    .line 258
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 259
    .line 260
    const/high16 v4, 0x41200000    # 10.0f

    .line 261
    .line 262
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x41400000    # 12.0f

    .line 266
    .line 267
    const/high16 v18, 0x40000000    # 2.0f

    .line 268
    .line 269
    const/high16 v13, 0x41b00000    # 22.0f

    .line 270
    .line 271
    const v14, 0x40cf5c29    # 6.48f

    .line 272
    .line 273
    .line 274
    const v15, 0x418c28f6    # 17.52f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40800000    # 4.0f

    .line 286
    .line 287
    const/high16 v2, 0x41400000    # 12.0f

    .line 288
    .line 289
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x40fe147b    # 7.94f

    .line 293
    .line 294
    .line 295
    const/high16 v18, 0x40e00000    # 7.0f

    .line 296
    .line 297
    const v13, 0x40828f5c    # 4.08f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const v15, 0x40ee6666    # 7.45f

    .line 302
    .line 303
    .line 304
    const v16, 0x40433333    # 3.05f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, -0x3f7e147b    # -4.06f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, 0x41400000    # 12.0f

    .line 317
    .line 318
    const/high16 v18, 0x41000000    # 8.0f

    .line 319
    .line 320
    const v13, 0x4176e148    # 15.43f

    .line 321
    .line 322
    .line 323
    const v14, 0x411451ec    # 9.27f

    .line 324
    .line 325
    .line 326
    const v15, 0x415dc28f    # 13.86f

    .line 327
    .line 328
    .line 329
    const/high16 v16, 0x41000000    # 8.0f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x40400000    # 3.0f

    .line 335
    .line 336
    const v2, -0x3f8851ec    # -3.87f

    .line 337
    .line 338
    .line 339
    const v4, 0x3fa28f5c    # 1.27f

    .line 340
    .line 341
    .line 342
    const v6, -0x3fa47ae1    # -3.43f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x4081eb85    # 4.06f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v18, 0x40800000    # 4.0f

    .line 355
    .line 356
    const v13, 0x4091999a    # 4.55f

    .line 357
    .line 358
    .line 359
    const v14, 0x40e1999a    # 7.05f

    .line 360
    .line 361
    .line 362
    const v15, 0x40fd70a4    # 7.92f

    .line 363
    .line 364
    .line 365
    const/high16 v16, 0x40800000    # 4.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41600000    # 14.0f

    .line 374
    .line 375
    const/high16 v2, 0x41400000    # 12.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40000000    # -2.0f

    .line 381
    .line 382
    const/high16 v18, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, 0x3f8ccccd    # 1.1f

    .line 386
    .line 387
    .line 388
    const v15, -0x4099999a    # -0.9f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x4099999a    # -0.9f

    .line 397
    .line 398
    .line 399
    const/high16 v2, -0x40000000    # -2.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x40000000    # 2.0f

    .line 405
    .line 406
    const/high16 v18, -0x40000000    # -2.0f

    .line 407
    .line 408
    const v14, -0x40733333    # -1.1f

    .line 409
    .line 410
    .line 411
    const v15, 0x3f666666    # 0.9f

    .line 412
    .line 413
    .line 414
    const/high16 v16, -0x40000000    # -2.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x412e6666    # 10.9f

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x41600000    # 14.0f

    .line 423
    .line 424
    const/high16 v4, 0x41400000    # 12.0f

    .line 425
    .line 426
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41a00000    # 20.0f

    .line 433
    .line 434
    const/high16 v2, 0x41400000    # 12.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x3f01eb85    # -7.94f

    .line 440
    .line 441
    .line 442
    const/high16 v18, -0x3f200000    # -7.0f

    .line 443
    .line 444
    const v13, -0x3f7d70a4    # -4.08f

    .line 445
    .line 446
    .line 447
    const/4 v14, 0x0

    .line 448
    const v15, -0x3f11999a    # -7.45f

    .line 449
    .line 450
    .line 451
    const v16, -0x3fbccccd    # -3.05f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x4081eb85    # 4.06f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x4077ae14    # 3.87f

    .line 464
    .line 465
    .line 466
    const/high16 v18, 0x40400000    # 3.0f

    .line 467
    .line 468
    const v13, 0x3ee147ae    # 0.44f

    .line 469
    .line 470
    .line 471
    const v14, 0x3fdd70a4    # 1.73f

    .line 472
    .line 473
    .line 474
    const v15, 0x4000a3d7    # 2.01f

    .line 475
    .line 476
    .line 477
    const/high16 v16, 0x40400000    # 3.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x4077ae14    # 3.87f

    .line 483
    .line 484
    .line 485
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 486
    .line 487
    const v4, 0x405b851f    # 3.43f

    .line 488
    .line 489
    .line 490
    const v6, -0x405d70a4    # -1.27f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x4081eb85    # 4.06f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x41400000    # 12.0f

    .line 503
    .line 504
    const/high16 v18, 0x41a00000    # 20.0f

    .line 505
    .line 506
    const v13, 0x419b999a    # 19.45f

    .line 507
    .line 508
    .line 509
    const v14, 0x4187999a    # 16.95f

    .line 510
    .line 511
    .line 512
    const v15, 0x4180a3d7    # 16.08f

    .line 513
    .line 514
    .line 515
    const/high16 v16, 0x41a00000    # 20.0f

    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/16 v16, 0x3800

    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/high16 v12, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const/4 v14, 0x0

    .line 540
    const/4 v15, 0x0

    .line 541
    const-string v4, ""

    .line 542
    .line 543
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, Landroidx/compose/material/icons/twotone/CatchingPokemonKt;->_catchingPokemon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 552
    .line 553
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-object v0
.end method
