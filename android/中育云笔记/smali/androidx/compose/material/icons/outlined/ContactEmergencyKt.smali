.class public final Landroidx/compose/material/icons/outlined/ContactEmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactEmergency(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ContactEmergency"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v21, 0x3fd33333    # 1.65f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40400000    # 3.0f

    .line 87
    .line 88
    const v24, -0x40533333    # -1.35f

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
    const v4, -0x40533333    # -1.35f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x3faccccd    # 1.35f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x40400000    # 3.0f

    .line 108
    .line 109
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x40eb3333    # 7.35f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41600000    # 14.0f

    .line 118
    .line 119
    const/high16 v7, 0x41100000    # 9.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41200000    # 10.0f

    .line 128
    .line 129
    const/high16 v6, 0x41100000    # 9.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v26, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const v21, 0x3f0a3d71    # 0.54f

    .line 139
    .line 140
    .line 141
    const/high16 v23, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v24, 0x3eeb851f    # 0.46f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const v6, -0x41147ae1    # -0.46f

    .line 152
    .line 153
    .line 154
    const/high16 v7, -0x40800000    # -1.0f

    .line 155
    .line 156
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x41147ae1    # -0.46f

    .line 160
    .line 161
    .line 162
    const/high16 v6, -0x40800000    # -1.0f

    .line 163
    .line 164
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x41075c29    # 8.46f

    .line 168
    .line 169
    .line 170
    const/high16 v6, 0x41200000    # 10.0f

    .line 171
    .line 172
    const/high16 v7, 0x41100000    # 9.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const/16 v16, 0x3800

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v8, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const/high16 v9, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v12, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    const-string v4, ""

    .line 201
    .line 202
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    const/4 v2, 0x0

    .line 216
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x41b00000    # 22.0f

    .line 233
    .line 234
    const/high16 v6, 0x40400000    # 3.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x40000000    # 2.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/16 v25, 0x0

    .line 245
    .line 246
    const/high16 v26, 0x40a00000    # 5.0f

    .line 247
    .line 248
    const v21, 0x3f666666    # 0.9f

    .line 249
    .line 250
    .line 251
    const/high16 v22, 0x40400000    # 3.0f

    .line 252
    .line 253
    const/16 v23, 0x0

    .line 254
    .line 255
    const v24, 0x4079999a    # 3.9f

    .line 256
    .line 257
    .line 258
    move-object/from16 v20, v2

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41600000    # 14.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x40000000    # 2.0f

    .line 269
    .line 270
    const/high16 v26, 0x40000000    # 2.0f

    .line 271
    .line 272
    const/16 v21, 0x0

    .line 273
    .line 274
    const v22, 0x3f8ccccd    # 1.1f

    .line 275
    .line 276
    .line 277
    const v23, 0x3f666666    # 0.9f

    .line 278
    .line 279
    .line 280
    const/high16 v24, 0x40000000    # 2.0f

    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41a00000    # 20.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v25, 0x3ffeb852    # 1.99f

    .line 291
    .line 292
    .line 293
    const/high16 v26, -0x40000000    # -2.0f

    .line 294
    .line 295
    const v21, 0x3f8ccccd    # 1.1f

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const v23, 0x3ffeb852    # 1.99f

    .line 301
    .line 302
    .line 303
    const v24, -0x4099999a    # -0.9f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x40a00000    # 5.0f

    .line 310
    .line 311
    const/high16 v6, 0x41c00000    # 24.0f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v25, 0x41b00000    # 22.0f

    .line 317
    .line 318
    const/high16 v26, 0x40400000    # 3.0f

    .line 319
    .line 320
    const/high16 v21, 0x41c00000    # 24.0f

    .line 321
    .line 322
    const v22, 0x4079999a    # 3.9f

    .line 323
    .line 324
    .line 325
    const v23, 0x41b8cccd    # 23.1f

    .line 326
    .line 327
    .line 328
    const/high16 v24, 0x40400000    # 3.0f

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x409147ae    # 4.54f

    .line 337
    .line 338
    .line 339
    const/high16 v6, 0x41980000    # 19.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, 0x408eb852    # 4.46f

    .line 345
    .line 346
    .line 347
    const/high16 v26, -0x40000000    # -2.0f

    .line 348
    .line 349
    const v21, 0x3f8ccccd    # 1.1f

    .line 350
    .line 351
    .line 352
    const v22, -0x4063d70a    # -1.22f

    .line 353
    .line 354
    .line 355
    const v23, 0x402c28f6    # 2.69f

    .line 356
    .line 357
    .line 358
    const/high16 v24, -0x40000000    # -2.0f

    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v4, 0x3f47ae14    # 0.78f

    .line 364
    .line 365
    .line 366
    const v6, 0x408eb852    # 4.46f

    .line 367
    .line 368
    .line 369
    const/high16 v7, 0x40000000    # 2.0f

    .line 370
    .line 371
    const v8, 0x40570a3d    # 3.36f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, 0x409147ae    # 4.54f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x41b00000    # 22.0f

    .line 387
    .line 388
    const/high16 v6, 0x41980000    # 19.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v4, -0x3f3d70a4    # -6.08f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, -0x3f228f5c    # -6.92f

    .line 400
    .line 401
    .line 402
    const/high16 v26, -0x3f800000    # -4.0f

    .line 403
    .line 404
    const v21, -0x404f5c29    # -1.38f

    .line 405
    .line 406
    .line 407
    const v22, -0x3fe70a3d    # -2.39f

    .line 408
    .line 409
    .line 410
    const v23, -0x3f828f5c    # -3.96f

    .line 411
    .line 412
    .line 413
    const/high16 v24, -0x3f800000    # -4.0f

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v4, -0x3f228f5c    # -6.92f

    .line 419
    .line 420
    .line 421
    const/high16 v6, 0x40800000    # 4.0f

    .line 422
    .line 423
    const v7, -0x3f4eb852    # -5.54f

    .line 424
    .line 425
    .line 426
    const v8, 0x3fce147b    # 1.61f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x40a00000    # 5.0f

    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x41a00000    # 20.0f

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x41980000    # 19.0f

    .line 448
    .line 449
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v8, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const-string v4, ""

    .line 465
    .line 466
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 467
    .line 468
    .line 469
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 474
    .line 475
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 476
    .line 477
    .line 478
    move-result-wide v6

    .line 479
    const/4 v0, 0x0

    .line 480
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 494
    .line 495
    .line 496
    const v2, 0x417c7ae1    # 15.78f

    .line 497
    .line 498
    .line 499
    const v4, 0x41326666    # 11.15f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v2, -0x40a66666    # -0.85f

    .line 506
    .line 507
    .line 508
    const v4, 0x3fbc28f6    # 1.47f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v2, 0x3fd9999a    # 1.7f

    .line 515
    .line 516
    .line 517
    const/4 v4, 0x0

    .line 518
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 522
    .line 523
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v2, -0x40266666    # -1.7f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v2, 0x3f59999a    # 0.85f

    .line 533
    .line 534
    .line 535
    const v4, 0x3fbc28f6    # 1.47f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v2, 0x3f400000    # 0.75f

    .line 542
    .line 543
    const v4, -0x4059999a    # -1.3f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v2, -0x4043d70a    # -1.47f

    .line 550
    .line 551
    .line 552
    const v4, -0x40a66666    # -0.85f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v2, -0x40a66666    # -0.85f

    .line 559
    .line 560
    .line 561
    const v4, 0x3fbc28f6    # 1.47f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v2, -0x40c00000    # -0.75f

    .line 568
    .line 569
    const v4, -0x4059999a    # -1.3f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v2, -0x4043d70a    # -1.47f

    .line 576
    .line 577
    .line 578
    const v4, 0x3f59999a    # 0.85f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v2, -0x40266666    # -1.7f

    .line 585
    .line 586
    .line 587
    const/4 v4, 0x0

    .line 588
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v2, -0x40400000    # -1.5f

    .line 592
    .line 593
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v2, 0x3fd9999a    # 1.7f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v2, -0x4043d70a    # -1.47f

    .line 603
    .line 604
    .line 605
    const v4, -0x40a66666    # -0.85f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v2, -0x40c00000    # -0.75f

    .line 612
    .line 613
    const v4, 0x3fa66666    # 1.3f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v2, 0x3f59999a    # 0.85f

    .line 620
    .line 621
    .line 622
    const v4, 0x3fbc28f6    # 1.47f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v2, -0x4043d70a    # -1.47f

    .line 629
    .line 630
    .line 631
    const v4, 0x3f59999a    # 0.85f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    const/high16 v6, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const-string v4, ""

    .line 648
    .line 649
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    sput-object v0, Landroidx/compose/material/icons/outlined/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    return-object v0
.end method
