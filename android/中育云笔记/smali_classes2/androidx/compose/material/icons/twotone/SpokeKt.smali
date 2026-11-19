.class public final Landroidx/compose/material/icons/twotone/SpokeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spoke:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpoke(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SpokeKt;->_spoke:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Spoke"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v21, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40000000    # -2.0f

    .line 87
    .line 88
    const v24, -0x4099999a    # -0.9f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x40000000    # 2.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, -0x40733333    # -1.1f

    .line 101
    .line 102
    .line 103
    const v23, 0x3f666666    # 0.9f

    .line 104
    .line 105
    .line 106
    const/high16 v24, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x41400000    # 12.0f

    .line 120
    .line 121
    const/high16 v26, 0x41100000    # 9.0f

    .line 122
    .line 123
    const/high16 v21, 0x41600000    # 14.0f

    .line 124
    .line 125
    const v22, 0x4101999a    # 8.1f

    .line 126
    .line 127
    .line 128
    const v23, 0x4151999a    # 13.1f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41980000    # 19.0f

    .line 140
    .line 141
    const/high16 v6, 0x40e00000    # 7.0f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x40000000    # -2.0f

    .line 147
    .line 148
    const/high16 v26, -0x40000000    # -2.0f

    .line 149
    .line 150
    const v21, -0x40733333    # -1.1f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/high16 v23, -0x40000000    # -2.0f

    .line 156
    .line 157
    const v24, -0x4099999a    # -0.9f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, 0x40000000    # 2.0f

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const v22, -0x40733333    # -1.1f

    .line 168
    .line 169
    .line 170
    const v23, 0x3f666666    # 0.9f

    .line 171
    .line 172
    .line 173
    const/high16 v24, -0x40000000    # -2.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x3f666666    # 0.9f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x40000000    # 2.0f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x40e00000    # 7.0f

    .line 187
    .line 188
    const/high16 v26, 0x41980000    # 19.0f

    .line 189
    .line 190
    const/high16 v21, 0x41100000    # 9.0f

    .line 191
    .line 192
    const v22, 0x4190cccd    # 18.1f

    .line 193
    .line 194
    .line 195
    const v23, 0x4101999a    # 8.1f

    .line 196
    .line 197
    .line 198
    const/high16 v24, 0x41980000    # 19.0f

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41880000    # 17.0f

    .line 207
    .line 208
    const/high16 v6, 0x41980000    # 19.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, -0x40000000    # -2.0f

    .line 214
    .line 215
    const/high16 v26, -0x40000000    # -2.0f

    .line 216
    .line 217
    const v21, -0x40733333    # -1.1f

    .line 218
    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const/high16 v23, -0x40000000    # -2.0f

    .line 223
    .line 224
    const v24, -0x4099999a    # -0.9f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, 0x40000000    # 2.0f

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    const v22, -0x40733333    # -1.1f

    .line 235
    .line 236
    .line 237
    const v23, 0x3f666666    # 0.9f

    .line 238
    .line 239
    .line 240
    const/high16 v24, -0x40000000    # -2.0f

    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, 0x3f666666    # 0.9f

    .line 246
    .line 247
    .line 248
    const/high16 v6, 0x40000000    # 2.0f

    .line 249
    .line 250
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41880000    # 17.0f

    .line 254
    .line 255
    const/high16 v26, 0x41980000    # 19.0f

    .line 256
    .line 257
    const/high16 v21, 0x41980000    # 19.0f

    .line 258
    .line 259
    const v22, 0x4190cccd    # 18.1f

    .line 260
    .line 261
    .line 262
    const v23, 0x4190cccd    # 18.1f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x41980000    # 19.0f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v16, 0x3800

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const v6, 0x3e99999a    # 0.3f

    .line 282
    .line 283
    .line 284
    const v8, 0x3e99999a    # 0.3f

    .line 285
    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/high16 v9, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v12, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const/4 v14, 0x0

    .line 294
    const/4 v15, 0x0

    .line 295
    const-string v4, ""

    .line 296
    .line 297
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    const/4 v0, 0x0

    .line 311
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41800000    # 16.0f

    .line 328
    .line 329
    const/high16 v2, 0x40e00000    # 7.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x3f800000    # -4.0f

    .line 335
    .line 336
    const/high16 v18, -0x3f800000    # -4.0f

    .line 337
    .line 338
    const v14, -0x3ff28f5c    # -2.21f

    .line 339
    .line 340
    .line 341
    const v15, -0x401ae148    # -1.79f

    .line 342
    .line 343
    .line 344
    const/high16 v16, -0x3f800000    # -4.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x409947ae    # 4.79f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x41000000    # 8.0f

    .line 353
    .line 354
    const/high16 v4, 0x40e00000    # 7.0f

    .line 355
    .line 356
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x40800000    # 4.0f

    .line 360
    .line 361
    const/high16 v18, 0x40800000    # 4.0f

    .line 362
    .line 363
    const v14, 0x400d70a4    # 2.21f

    .line 364
    .line 365
    .line 366
    const v15, 0x3fe51eb8    # 1.79f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40800000    # 4.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x41135c29    # 9.21f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x41800000    # 16.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41100000    # 9.0f

    .line 386
    .line 387
    const/high16 v2, 0x41400000    # 12.0f

    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, -0x40000000    # -2.0f

    .line 393
    .line 394
    const/high16 v18, -0x40000000    # -2.0f

    .line 395
    .line 396
    const v13, -0x40733333    # -1.1f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const/high16 v15, -0x40000000    # -2.0f

    .line 401
    .line 402
    const v16, -0x4099999a    # -0.9f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x40000000    # 2.0f

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, -0x40733333    # -1.1f

    .line 412
    .line 413
    .line 414
    const v15, 0x3f666666    # 0.9f

    .line 415
    .line 416
    .line 417
    const/high16 v16, -0x40000000    # -2.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3f666666    # 0.9f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40000000    # 2.0f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x41400000    # 12.0f

    .line 431
    .line 432
    const/high16 v18, 0x41100000    # 9.0f

    .line 433
    .line 434
    const/high16 v13, 0x41600000    # 14.0f

    .line 435
    .line 436
    const v14, 0x4101999a    # 8.1f

    .line 437
    .line 438
    .line 439
    const v15, 0x4151999a    # 13.1f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x41100000    # 9.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41500000    # 13.0f

    .line 451
    .line 452
    const/high16 v2, 0x40e00000    # 7.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, -0x3f800000    # -4.0f

    .line 458
    .line 459
    const/high16 v18, 0x40800000    # 4.0f

    .line 460
    .line 461
    const v13, -0x3ff28f5c    # -2.21f

    .line 462
    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    const/high16 v15, -0x3f800000    # -4.0f

    .line 466
    .line 467
    const v16, 0x3fe51eb8    # 1.79f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x40800000    # 4.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x400d70a4    # 2.21f

    .line 477
    .line 478
    .line 479
    const v15, 0x3fe51eb8    # 1.79f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x40800000    # 4.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, -0x3f800000    # -4.0f

    .line 488
    .line 489
    const v2, -0x401ae148    # -1.79f

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x40800000    # 4.0f

    .line 493
    .line 494
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x40e00000    # 7.0f

    .line 498
    .line 499
    const/high16 v18, 0x41500000    # 13.0f

    .line 500
    .line 501
    const/high16 v13, 0x41300000    # 11.0f

    .line 502
    .line 503
    const v14, 0x416ca3d7    # 14.79f

    .line 504
    .line 505
    .line 506
    const v15, 0x41135c29    # 9.21f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x41500000    # 13.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41980000    # 19.0f

    .line 518
    .line 519
    const/high16 v2, 0x40e00000    # 7.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, -0x40000000    # -2.0f

    .line 525
    .line 526
    const/high16 v18, -0x40000000    # -2.0f

    .line 527
    .line 528
    const v13, -0x40733333    # -1.1f

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const/high16 v15, -0x40000000    # -2.0f

    .line 533
    .line 534
    const v16, -0x4099999a    # -0.9f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x40000000    # 2.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, -0x40733333    # -1.1f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f666666    # 0.9f

    .line 547
    .line 548
    .line 549
    const/high16 v16, -0x40000000    # -2.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x3f666666    # 0.9f

    .line 555
    .line 556
    .line 557
    const/high16 v2, 0x40000000    # 2.0f

    .line 558
    .line 559
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x40e00000    # 7.0f

    .line 563
    .line 564
    const/high16 v18, 0x41980000    # 19.0f

    .line 565
    .line 566
    const/high16 v13, 0x41100000    # 9.0f

    .line 567
    .line 568
    const v14, 0x4190cccd    # 18.1f

    .line 569
    .line 570
    .line 571
    const v15, 0x4101999a    # 8.1f

    .line 572
    .line 573
    .line 574
    const/high16 v16, 0x41980000    # 19.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41500000    # 13.0f

    .line 583
    .line 584
    const/high16 v2, 0x41880000    # 17.0f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, -0x3f800000    # -4.0f

    .line 590
    .line 591
    const/high16 v18, 0x40800000    # 4.0f

    .line 592
    .line 593
    const v13, -0x3ff28f5c    # -2.21f

    .line 594
    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    const/high16 v15, -0x3f800000    # -4.0f

    .line 598
    .line 599
    const v16, 0x3fe51eb8    # 1.79f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, 0x40800000    # 4.0f

    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const v14, 0x400d70a4    # 2.21f

    .line 609
    .line 610
    .line 611
    const v15, 0x3fe51eb8    # 1.79f

    .line 612
    .line 613
    .line 614
    const/high16 v16, 0x40800000    # 4.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, -0x3f800000    # -4.0f

    .line 620
    .line 621
    const v2, -0x401ae148    # -1.79f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v17, 0x41880000    # 17.0f

    .line 628
    .line 629
    const/high16 v18, 0x41500000    # 13.0f

    .line 630
    .line 631
    const/high16 v13, 0x41a80000    # 21.0f

    .line 632
    .line 633
    const v14, 0x416ca3d7    # 14.79f

    .line 634
    .line 635
    .line 636
    const v15, 0x4199ae14    # 19.21f

    .line 637
    .line 638
    .line 639
    const/high16 v16, 0x41500000    # 13.0f

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, 0x41880000    # 17.0f

    .line 648
    .line 649
    const/high16 v2, 0x41980000    # 19.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v17, -0x40000000    # -2.0f

    .line 655
    .line 656
    const/high16 v18, -0x40000000    # -2.0f

    .line 657
    .line 658
    const v13, -0x40733333    # -1.1f

    .line 659
    .line 660
    .line 661
    const/4 v14, 0x0

    .line 662
    const/high16 v15, -0x40000000    # -2.0f

    .line 663
    .line 664
    const v16, -0x4099999a    # -0.9f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v17, 0x40000000    # 2.0f

    .line 671
    .line 672
    const/4 v13, 0x0

    .line 673
    const v14, -0x40733333    # -1.1f

    .line 674
    .line 675
    .line 676
    const v15, 0x3f666666    # 0.9f

    .line 677
    .line 678
    .line 679
    const/high16 v16, -0x40000000    # -2.0f

    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x3f666666    # 0.9f

    .line 685
    .line 686
    .line 687
    const/high16 v2, 0x40000000    # 2.0f

    .line 688
    .line 689
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, 0x41880000    # 17.0f

    .line 693
    .line 694
    const/high16 v18, 0x41980000    # 19.0f

    .line 695
    .line 696
    const/high16 v13, 0x41980000    # 19.0f

    .line 697
    .line 698
    const v14, 0x4190cccd    # 18.1f

    .line 699
    .line 700
    .line 701
    const v15, 0x4190cccd    # 18.1f

    .line 702
    .line 703
    .line 704
    const/high16 v16, 0x41980000    # 19.0f

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/high16 v8, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v7, 0x0

    .line 725
    const/high16 v12, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/4 v13, 0x0

    .line 728
    const/4 v14, 0x0

    .line 729
    const/4 v15, 0x0

    .line 730
    const-string v4, ""

    .line 731
    .line 732
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    sput-object v0, Landroidx/compose/material/icons/twotone/SpokeKt;->_spoke:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 741
    .line 742
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    return-object v0
.end method
