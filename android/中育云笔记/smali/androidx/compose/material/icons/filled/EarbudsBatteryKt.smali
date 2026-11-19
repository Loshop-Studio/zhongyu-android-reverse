.class public final Landroidx/compose/material/icons/filled/EarbudsBatteryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEarbudsBattery(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.EarbudsBattery"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x40000000    # -2.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, -0x40800000    # -1.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, -0x40800000    # -1.0f

    .line 103
    .line 104
    const/high16 v26, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v21, -0x40f33333    # -0.55f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const/high16 v23, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v24, 0x3ee66666    # 0.45f

    .line 114
    .line 115
    .line 116
    move-object/from16 v20, v2

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41100000    # 9.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, 0x3f0ccccd    # 0.55f

    .line 131
    .line 132
    .line 133
    const v23, 0x3ee66666    # 0.45f

    .line 134
    .line 135
    .line 136
    const/high16 v24, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40800000    # 4.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v26, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v21, 0x3f0ccccd    # 0.55f

    .line 149
    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const/high16 v23, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const v24, -0x4119999a    # -0.45f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41000000    # 8.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41a80000    # 21.0f

    .line 167
    .line 168
    const/high16 v26, 0x40e00000    # 7.0f

    .line 169
    .line 170
    const/high16 v21, 0x41b00000    # 22.0f

    .line 171
    .line 172
    const v22, 0x40ee6666    # 7.45f

    .line 173
    .line 174
    .line 175
    const v23, 0x41ac6666    # 21.55f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x40e00000    # 7.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v8, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/high16 v9, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v12, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const-string v4, ""

    .line 207
    .line 208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const v0, 0x4129eb85    # 10.62f

    .line 239
    .line 240
    .line 241
    const/high16 v2, 0x40c00000    # 6.0f

    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40e80000    # 7.25f

    .line 247
    .line 248
    const v18, 0x4116147b    # 9.38f

    .line 249
    .line 250
    .line 251
    const v13, 0x410c28f6    # 8.76f

    .line 252
    .line 253
    .line 254
    const/high16 v14, 0x40c00000    # 6.0f

    .line 255
    .line 256
    const/high16 v15, 0x40e80000    # 7.25f

    .line 257
    .line 258
    const v16, 0x40f051ec    # 7.51f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40a80000    # 5.25f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x400f5c29    # -1.88f

    .line 270
    .line 271
    .line 272
    const v18, 0x3ff0a3d7    # 1.88f

    .line 273
    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, 0x3f851eb8    # 1.04f

    .line 277
    .line 278
    .line 279
    const v15, -0x40a8f5c3    # -0.84f

    .line 280
    .line 281
    .line 282
    const v16, 0x3ff0a3d7    # 1.88f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x417a8f5c    # 15.66f

    .line 289
    .line 290
    .line 291
    const v2, 0x4169eb85    # 14.62f

    .line 292
    .line 293
    .line 294
    const/high16 v4, 0x40600000    # 3.5f

    .line 295
    .line 296
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, -0x3f69999a    # -4.7f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40800000    # 4.0f

    .line 306
    .line 307
    const/high16 v18, 0x41200000    # 10.0f

    .line 308
    .line 309
    const v13, 0x406a3d71    # 3.66f

    .line 310
    .line 311
    .line 312
    const v14, 0x411f851f    # 9.97f

    .line 313
    .line 314
    .line 315
    const v15, 0x40751eb8    # 3.83f

    .line 316
    .line 317
    .line 318
    const/high16 v16, 0x41200000    # 10.0f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40000000    # 2.0f

    .line 324
    .line 325
    const/high16 v18, -0x40000000    # -2.0f

    .line 326
    .line 327
    const v13, 0x3f8ccccd    # 1.1f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/high16 v15, 0x40000000    # 2.0f

    .line 332
    .line 333
    const v16, -0x4099999a    # -0.9f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x40a33333    # 5.1f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x40800000    # 4.0f

    .line 343
    .line 344
    const/high16 v4, 0x40c00000    # 6.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x40dccccd    # 6.9f

    .line 350
    .line 351
    .line 352
    const/high16 v2, 0x41000000    # 8.0f

    .line 353
    .line 354
    const/high16 v4, 0x40000000    # 2.0f

    .line 355
    .line 356
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/16 v17, 0x0

    .line 360
    .line 361
    const v18, 0x40d3d70a    # 6.62f

    .line 362
    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    const v14, 0x3d23d70a    # 0.04f

    .line 366
    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    const v16, 0x40d3d70a    # 6.62f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x40ac28f6    # 5.38f

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x41900000    # 18.0f

    .line 379
    .line 380
    const/high16 v13, 0x40000000    # 2.0f

    .line 381
    .line 382
    const v14, 0x4183eb85    # 16.49f

    .line 383
    .line 384
    .line 385
    const v15, 0x4060a3d7    # 3.51f

    .line 386
    .line 387
    .line 388
    const/high16 v16, 0x41900000    # 18.0f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x403eb852    # -1.51f

    .line 394
    .line 395
    .line 396
    const v2, -0x3fa7ae14    # -3.38f

    .line 397
    .line 398
    .line 399
    const v4, 0x405851ec    # 3.38f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x4116147b    # 9.38f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x3ff0a3d7    # 1.88f

    .line 412
    .line 413
    .line 414
    const v18, -0x400f5c29    # -1.88f

    .line 415
    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, -0x407ae148    # -1.04f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f570a3d    # 0.84f

    .line 422
    .line 423
    .line 424
    const v16, -0x400f5c29    # -1.88f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x3f570a3d    # 0.84f

    .line 431
    .line 432
    .line 433
    const v2, 0x3ff0a3d7    # 1.88f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40966666    # 4.7f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x41400000    # 12.0f

    .line 446
    .line 447
    const/high16 v18, 0x41600000    # 14.0f

    .line 448
    .line 449
    const v13, 0x414570a4    # 12.34f

    .line 450
    .line 451
    .line 452
    const v14, 0x41607ae1    # 14.03f

    .line 453
    .line 454
    .line 455
    const v15, 0x4142b852    # 12.17f

    .line 456
    .line 457
    .line 458
    const/high16 v16, 0x41600000    # 14.0f

    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v17, -0x40000000    # -2.0f

    .line 464
    .line 465
    const/high16 v18, 0x40000000    # 2.0f

    .line 466
    .line 467
    const v13, -0x40733333    # -1.1f

    .line 468
    .line 469
    .line 470
    const/4 v14, 0x0

    .line 471
    const/high16 v15, -0x40000000    # -2.0f

    .line 472
    .line 473
    const v16, 0x3f666666    # 0.9f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x3f666666    # 0.9f

    .line 480
    .line 481
    .line 482
    const/high16 v2, 0x40000000    # 2.0f

    .line 483
    .line 484
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x4099999a    # -0.9f

    .line 488
    .line 489
    .line 490
    const/high16 v2, -0x40000000    # -2.0f

    .line 491
    .line 492
    const/high16 v4, 0x40000000    # 2.0f

    .line 493
    .line 494
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/16 v17, 0x0

    .line 498
    .line 499
    const v18, -0x3f2c28f6    # -6.62f

    .line 500
    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const v14, -0x42dc28f6    # -0.04f

    .line 504
    .line 505
    .line 506
    const/4 v15, 0x0

    .line 507
    const v16, -0x3f2c28f6    # -6.62f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x4129eb85    # 10.62f

    .line 514
    .line 515
    .line 516
    const/high16 v18, 0x40c00000    # 6.0f

    .line 517
    .line 518
    const/high16 v13, 0x41600000    # 14.0f

    .line 519
    .line 520
    const v14, 0x40f051ec    # 7.51f

    .line 521
    .line 522
    .line 523
    const v15, 0x4147d70a    # 12.49f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x40c00000    # 6.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const/high16 v12, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const/4 v14, 0x0

    .line 549
    const/4 v15, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    sput-object v0, Landroidx/compose/material/icons/filled/EarbudsBatteryKt;->_earbudsBattery:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    return-object v0
.end method
