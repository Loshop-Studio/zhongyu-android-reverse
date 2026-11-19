.class public final Landroidx/compose/material/icons/rounded/SportsMmaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsMma:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsMma(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsMmaKt;->_sportsMma:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsMma"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v26, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3f0ccccd    # 0.55f

    .line 84
    .line 85
    .line 86
    const v23, 0x3ee66666    # 0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x3f800000    # 1.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41000000    # 8.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v26, -0x40800000    # -1.0f

    .line 102
    .line 103
    const v21, 0x3f0ccccd    # 0.55f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const v24, -0x4119999a    # -0.45f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40e00000    # 7.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41a00000    # 20.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const/16 v16, 0x3800

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/high16 v6, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/high16 v8, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/high16 v9, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/high16 v12, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v14, 0x0

    .line 153
    const/4 v15, 0x0

    .line 154
    const-string v4, ""

    .line 155
    .line 156
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 164
    .line 165
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 166
    .line 167
    .line 168
    move-result-wide v6

    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41900000    # 18.0f

    .line 187
    .line 188
    const/high16 v2, 0x40e00000    # 7.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, -0x40800000    # -1.0f

    .line 194
    .line 195
    const/high16 v18, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const v13, -0x40f33333    # -0.55f

    .line 198
    .line 199
    .line 200
    const/high16 v15, -0x40800000    # -1.0f

    .line 201
    .line 202
    const v16, 0x3ee66666    # 0.45f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40a00000    # 5.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, -0x40000000    # -2.0f

    .line 214
    .line 215
    const/high16 v18, -0x40000000    # -2.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, -0x40733333    # -1.1f

    .line 219
    .line 220
    .line 221
    const v15, -0x4099999a    # -0.9f

    .line 222
    .line 223
    .line 224
    const/high16 v16, -0x40000000    # -2.0f

    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40e00000    # 7.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, 0x40a00000    # 5.0f

    .line 235
    .line 236
    const/high16 v18, 0x40a00000    # 5.0f

    .line 237
    .line 238
    const v13, 0x40bccccd    # 5.9f

    .line 239
    .line 240
    .line 241
    const/high16 v14, 0x40400000    # 3.0f

    .line 242
    .line 243
    const/high16 v15, 0x40a00000    # 5.0f

    .line 244
    .line 245
    const v16, 0x4079999a    # 3.9f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x40b9999a    # 5.8f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3d23d70a    # 0.04f

    .line 258
    .line 259
    .line 260
    const v18, 0x3ec7ae14    # 0.39f

    .line 261
    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x3e051eb8    # 0.13f

    .line 265
    .line 266
    .line 267
    const v15, 0x3c23d70a    # 0.01f

    .line 268
    .line 269
    .line 270
    const v16, 0x3e851eb8    # 0.26f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x40800000    # 4.0f

    .line 277
    .line 278
    const v2, 0x3f4ccccd    # 0.8f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3f7ae148    # 0.98f

    .line 285
    .line 286
    .line 287
    const v18, 0x3f4ccccd    # 0.8f

    .line 288
    .line 289
    .line 290
    const v13, 0x3db851ec    # 0.09f

    .line 291
    .line 292
    .line 293
    const v14, 0x3ef0a3d7    # 0.47f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x3f000000    # 0.5f

    .line 297
    .line 298
    const v16, 0x3f4ccccd    # 0.8f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x4125c28f    # 10.36f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v18, -0x40b33333    # -0.8f

    .line 311
    .line 312
    .line 313
    const v13, 0x3ee66666    # 0.45f

    .line 314
    .line 315
    .line 316
    const/4 v14, 0x0

    .line 317
    const v15, 0x3f63d70a    # 0.89f

    .line 318
    .line 319
    .line 320
    const v16, -0x4147ae14    # -0.36f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, -0x3f800000    # -4.0f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41980000    # 19.0f

    .line 332
    .line 333
    const v18, 0x412ccccd    # 10.8f

    .line 334
    .line 335
    .line 336
    const v13, 0x4197eb85    # 18.99f

    .line 337
    .line 338
    .line 339
    const v14, 0x4130f5c3    # 11.06f

    .line 340
    .line 341
    .line 342
    const/high16 v15, 0x41980000    # 19.0f

    .line 343
    .line 344
    const v16, 0x412ee148    # 10.93f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41000000    # 8.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x41900000    # 18.0f

    .line 356
    .line 357
    const/high16 v18, 0x40e00000    # 7.0f

    .line 358
    .line 359
    const/high16 v13, 0x41980000    # 19.0f

    .line 360
    .line 361
    const v14, 0x40ee6666    # 7.45f

    .line 362
    .line 363
    .line 364
    const v15, 0x41946666    # 18.55f

    .line 365
    .line 366
    .line 367
    const/high16 v16, 0x40e00000    # 7.0f

    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41600000    # 14.0f

    .line 376
    .line 377
    const/high16 v2, 0x41200000    # 10.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41000000    # 8.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, -0x40800000    # -1.0f

    .line 388
    .line 389
    const/high16 v18, -0x40800000    # -1.0f

    .line 390
    .line 391
    const v13, -0x40f33333    # -0.55f

    .line 392
    .line 393
    .line 394
    const/4 v14, 0x0

    .line 395
    const/high16 v15, -0x40800000    # -1.0f

    .line 396
    .line 397
    const v16, -0x4119999a    # -0.45f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const v14, -0x40f33333    # -0.55f

    .line 410
    .line 411
    .line 412
    const v15, 0x3ee66666    # 0.45f

    .line 413
    .line 414
    .line 415
    const/high16 v16, -0x40800000    # -1.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v18, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const v13, 0x3f0ccccd    # 0.55f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/high16 v15, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const v16, 0x3ee66666    # 0.45f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x41600000    # 14.0f

    .line 445
    .line 446
    const/high16 v18, 0x41200000    # 10.0f

    .line 447
    .line 448
    const/high16 v13, 0x41700000    # 15.0f

    .line 449
    .line 450
    const v14, 0x4118cccd    # 9.55f

    .line 451
    .line 452
    .line 453
    const v15, 0x4168cccd    # 14.55f

    .line 454
    .line 455
    .line 456
    const/high16 v16, 0x41200000    # 10.0f

    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v16, 0x3800

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/high16 v12, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const/4 v14, 0x0

    .line 479
    const/4 v15, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsMmaKt;->_sportsMma:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    return-object v0
.end method
