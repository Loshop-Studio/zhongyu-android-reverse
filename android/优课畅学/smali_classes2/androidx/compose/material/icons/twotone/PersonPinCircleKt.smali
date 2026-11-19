.class public final Landroidx/compose/material/icons/twotone/PersonPinCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonPinCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonPinCircleKt;->_personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonPinCircle"

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
    const v4, 0x41233333    # 10.2f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41940000    # 18.5f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3f3ae148    # -6.16f

    .line 79
    .line 80
    .line 81
    const v26, 0x411828f6    # 9.51f

    .line 82
    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, 0x40247ae1    # 2.57f

    .line 87
    .line 88
    .line 89
    const v23, -0x3ff9999a    # -2.1f

    .line 90
    .line 91
    .line 92
    const v24, 0x40b947ae    # 5.79f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x41a0147b    # 20.01f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x41400000    # 12.0f

    .line 104
    .line 105
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, -0x4151eb85    # -0.34f

    .line 109
    .line 110
    .line 111
    const v6, -0x416147ae    # -0.31f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40b00000    # 5.5f

    .line 118
    .line 119
    const v26, 0x41233333    # 10.2f

    .line 120
    .line 121
    .line 122
    const v21, 0x40f33333    # 7.6f

    .line 123
    .line 124
    .line 125
    const v22, 0x417fd70a    # 15.99f

    .line 126
    .line 127
    .line 128
    const/high16 v23, 0x40b00000    # 5.5f

    .line 129
    .line 130
    const v24, 0x414c51ec    # 12.77f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x40d00000    # 6.5f

    .line 137
    .line 138
    const v26, -0x3f29999a    # -6.7f

    .line 139
    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const v22, -0x3f8a3d71    # -3.84f

    .line 144
    .line 145
    .line 146
    const v23, 0x40347ae1    # 2.82f

    .line 147
    .line 148
    .line 149
    const v24, -0x3f29999a    # -6.7f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, 0x40cb3333    # 6.35f

    .line 156
    .line 157
    .line 158
    const v6, 0x41233333    # 10.2f

    .line 159
    .line 160
    .line 161
    const/high16 v7, 0x41940000    # 18.5f

    .line 162
    .line 163
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/16 v16, 0x3800

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const v6, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const/high16 v8, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/high16 v9, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/high16 v12, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    const-string v4, ""

    .line 191
    .line 192
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    const/4 v0, 0x0

    .line 206
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    const/high16 v0, 0x41300000    # 11.0f

    .line 223
    .line 224
    const/high16 v2, 0x41400000    # 12.0f

    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x40800000    # 4.0f

    .line 230
    .line 231
    const/high16 v18, 0x40000000    # 2.0f

    .line 232
    .line 233
    const v13, 0x3faa3d71    # 1.33f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x40800000    # 4.0f

    .line 237
    .line 238
    const v16, 0x3f2b851f    # 0.67f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3e23d70a    # 0.16f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x41400000    # 12.0f

    .line 251
    .line 252
    const/high16 v18, 0x41700000    # 15.0f

    .line 253
    .line 254
    const v13, 0x41707ae1    # 15.03f

    .line 255
    .line 256
    .line 257
    const v14, 0x41647ae1    # 14.28f

    .line 258
    .line 259
    .line 260
    const v15, 0x4159999a    # 13.6f

    .line 261
    .line 262
    .line 263
    const/high16 v16, 0x41700000    # 15.0f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, -0x3f800000    # -4.0f

    .line 269
    .line 270
    const v2, -0x40147ae1    # -1.84f

    .line 271
    .line 272
    .line 273
    const v4, -0x3fbe147b    # -3.03f

    .line 274
    .line 275
    .line 276
    const v6, -0x40c7ae14    # -0.72f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41500000    # 13.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v18, 0x41300000    # 11.0f

    .line 288
    .line 289
    const/high16 v13, 0x41000000    # 8.0f

    .line 290
    .line 291
    const v14, 0x413ab852    # 11.67f

    .line 292
    .line 293
    .line 294
    const v15, 0x412ab852    # 10.67f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x41300000    # 11.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41200000    # 10.0f

    .line 306
    .line 307
    const/high16 v2, 0x41400000    # 12.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, -0x40000000    # -2.0f

    .line 313
    .line 314
    const/high16 v18, -0x40000000    # -2.0f

    .line 315
    .line 316
    const v13, -0x40733333    # -1.1f

    .line 317
    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    const/high16 v15, -0x40000000    # -2.0f

    .line 321
    .line 322
    const v16, -0x4099999a    # -0.9f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, -0x40000000    # -2.0f

    .line 329
    .line 330
    const v2, 0x3f666666    # 0.9f

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x40000000    # 2.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3f666666    # 0.9f

    .line 339
    .line 340
    .line 341
    const/high16 v2, 0x40000000    # 2.0f

    .line 342
    .line 343
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x4151999a    # 13.1f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x41200000    # 10.0f

    .line 350
    .line 351
    const/high16 v4, 0x41400000    # 12.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41900000    # 18.0f

    .line 360
    .line 361
    const v2, 0x41233333    # 10.2f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x41400000    # 12.0f

    .line 368
    .line 369
    const/high16 v18, 0x40800000    # 4.0f

    .line 370
    .line 371
    const/high16 v13, 0x41900000    # 18.0f

    .line 372
    .line 373
    const v14, 0x40d23d71    # 6.57f

    .line 374
    .line 375
    .line 376
    const v15, 0x4175999a    # 15.35f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x40800000    # 4.0f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x40247ae1    # 2.57f

    .line 385
    .line 386
    .line 387
    const v2, 0x40c66666    # 6.2f

    .line 388
    .line 389
    .line 390
    const/high16 v4, -0x3f400000    # -6.0f

    .line 391
    .line 392
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x40c00000    # 6.0f

    .line 396
    .line 397
    const v18, 0x41123d71    # 9.14f

    .line 398
    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v14, 0x4015c28f    # 2.34f

    .line 402
    .line 403
    .line 404
    const v15, 0x3ff9999a    # 1.95f

    .line 405
    .line 406
    .line 407
    const v16, 0x40ae147b    # 5.44f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x41900000    # 18.0f

    .line 414
    .line 415
    const v18, 0x41233333    # 10.2f

    .line 416
    .line 417
    .line 418
    const v13, 0x41806666    # 16.05f

    .line 419
    .line 420
    .line 421
    const v14, 0x417a3d71    # 15.64f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x41900000    # 18.0f

    .line 425
    .line 426
    const v16, 0x4148a3d7    # 12.54f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40000000    # 2.0f

    .line 436
    .line 437
    const/high16 v2, 0x41400000    # 12.0f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, 0x41000000    # 8.0f

    .line 443
    .line 444
    const v18, 0x41033333    # 8.2f

    .line 445
    .line 446
    .line 447
    const v13, 0x40866666    # 4.2f

    .line 448
    .line 449
    .line 450
    const/4 v14, 0x0

    .line 451
    const/high16 v15, 0x41000000    # 8.0f

    .line 452
    .line 453
    const v16, 0x404e147b    # 3.22f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, -0x3f000000    # -8.0f

    .line 460
    .line 461
    const v18, 0x413ccccd    # 11.8f

    .line 462
    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const v14, 0x40547ae1    # 3.32f

    .line 466
    .line 467
    .line 468
    const v15, -0x3fd51eb8    # -2.67f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x40e80000    # 7.25f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v18, -0x3ec33333    # -11.8f

    .line 477
    .line 478
    .line 479
    const v13, -0x3f5570a4    # -5.33f

    .line 480
    .line 481
    .line 482
    const v14, -0x3f6e6666    # -4.55f

    .line 483
    .line 484
    .line 485
    const/high16 v15, -0x3f000000    # -8.0f

    .line 486
    .line 487
    const v16, -0x3ef851ec    # -8.48f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x41400000    # 12.0f

    .line 494
    .line 495
    const/high16 v18, 0x40000000    # 2.0f

    .line 496
    .line 497
    const/high16 v13, 0x40800000    # 4.0f

    .line 498
    .line 499
    const v14, 0x40a70a3d    # 5.22f

    .line 500
    .line 501
    .line 502
    const v15, 0x40f9999a    # 7.8f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const/16 v16, 0x3800

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const/high16 v6, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const/high16 v12, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const/4 v14, 0x0

    .line 528
    const/4 v15, 0x0

    .line 529
    const-string v4, ""

    .line 530
    .line 531
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonPinCircleKt;->_personPinCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 540
    .line 541
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    return-object v0
.end method
