.class public final Landroidx/compose/material/icons/rounded/FireTruckKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireTruck(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FireTruckKt;->_fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FireTruck"

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
    const v4, 0x41b73333    # 22.9f

    .line 71
    .line 72
    .line 73
    const v6, 0x412b0a3d    # 10.69f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x4047ae14    # -1.44f

    .line 80
    .line 81
    .line 82
    const v6, -0x3f75c28f    # -4.32f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x419c7ae1    # 19.56f

    .line 89
    .line 90
    .line 91
    const/high16 v26, 0x40a00000    # 5.0f

    .line 92
    .line 93
    const v21, 0x41a970a4    # 21.18f

    .line 94
    .line 95
    .line 96
    const v22, 0x40b1999a    # 5.55f

    .line 97
    .line 98
    .line 99
    const v23, 0x41a35c29    # 20.42f

    .line 100
    .line 101
    .line 102
    const/high16 v24, 0x40a00000    # 5.0f

    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v4, 0x41980000    # 19.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x40800000    # 4.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, -0x40800000    # -1.0f

    .line 120
    .line 121
    const/high16 v26, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const v22, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    const v23, -0x4119999a    # -0.45f

    .line 129
    .line 130
    .line 131
    const/high16 v24, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, -0x40800000    # -1.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v26, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v21, -0x40f33333    # -0.55f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/high16 v23, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v24, 0x3ee66666    # 0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x3f800000    # 1.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, -0x40000000    # -2.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, -0x40000000    # -2.0f

    .line 167
    .line 168
    const/high16 v26, 0x40000000    # 2.0f

    .line 169
    .line 170
    const v21, -0x40733333    # -1.1f

    .line 171
    .line 172
    .line 173
    const/high16 v23, -0x40000000    # -2.0f

    .line 174
    .line 175
    const v24, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40800000    # 4.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40400000    # 3.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, 0x40000000    # 2.0f

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const v22, 0x3f8ccccd    # 1.1f

    .line 202
    .line 203
    .line 204
    const v23, 0x3f666666    # 0.9f

    .line 205
    .line 206
    .line 207
    const/high16 v24, 0x40000000    # 2.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x3f800000    # 1.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x40400000    # 3.0f

    .line 218
    .line 219
    const/high16 v26, 0x40400000    # 3.0f

    .line 220
    .line 221
    const v22, 0x3fd47ae1    # 1.66f

    .line 222
    .line 223
    .line 224
    const v23, 0x3fab851f    # 1.34f

    .line 225
    .line 226
    .line 227
    const/high16 v24, 0x40400000    # 3.0f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 233
    .line 234
    const v6, -0x40547ae1    # -1.34f

    .line 235
    .line 236
    .line 237
    const/high16 v7, 0x40400000    # 3.0f

    .line 238
    .line 239
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x40800000    # 4.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 251
    .line 252
    invoke-virtual {v2, v7, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x40000000    # 2.0f

    .line 261
    .line 262
    const/high16 v26, -0x40000000    # -2.0f

    .line 263
    .line 264
    const v21, 0x3f8ccccd    # 1.1f

    .line 265
    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const/high16 v23, 0x40000000    # 2.0f

    .line 270
    .line 271
    const v24, -0x4099999a    # -0.9f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, -0x3f6a3d71    # -4.68f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v25, 0x41b73333    # 22.9f

    .line 284
    .line 285
    .line 286
    const v26, 0x412b0a3d    # 10.69f

    .line 287
    .line 288
    .line 289
    const/high16 v21, 0x41b80000    # 23.0f

    .line 290
    .line 291
    const v22, 0x4131c28f    # 11.11f

    .line 292
    .line 293
    .line 294
    const v23, 0x41b7c28f    # 22.97f

    .line 295
    .line 296
    .line 297
    const v24, 0x412e6666    # 10.9f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x40e00000    # 7.0f

    .line 307
    .line 308
    const/high16 v6, 0x41980000    # 19.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v25, -0x40800000    # -1.0f

    .line 314
    .line 315
    const/high16 v26, -0x40800000    # -1.0f

    .line 316
    .line 317
    const v21, -0x40f33333    # -0.55f

    .line 318
    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/high16 v23, -0x40800000    # -1.0f

    .line 323
    .line 324
    const v24, -0x4119999a    # -0.45f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x3ee66666    # 0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v6, -0x40800000    # -1.0f

    .line 334
    .line 335
    const/high16 v7, 0x3f800000    # 1.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v6, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x40f1999a    # 7.55f

    .line 346
    .line 347
    .line 348
    const/high16 v6, 0x40e00000    # 7.0f

    .line 349
    .line 350
    const/high16 v7, 0x41980000    # 19.0f

    .line 351
    .line 352
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x41880000    # 17.0f

    .line 359
    .line 360
    const/high16 v6, 0x41980000    # 19.0f

    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x3ee66666    # 0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v6, -0x40800000    # -1.0f

    .line 372
    .line 373
    const/high16 v7, 0x3f800000    # 1.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v6, 0x3f800000    # 1.0f

    .line 379
    .line 380
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x418c6666    # 17.55f

    .line 384
    .line 385
    .line 386
    const/high16 v6, 0x41880000    # 17.0f

    .line 387
    .line 388
    const/high16 v7, 0x41980000    # 19.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x41300000    # 11.0f

    .line 397
    .line 398
    const/high16 v6, 0x41600000    # 14.0f

    .line 399
    .line 400
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v4, 0x40e00000    # 7.0f

    .line 404
    .line 405
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, 0x40b1eb85    # 5.56f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, 0x3faa3d71    # 1.33f

    .line 415
    .line 416
    .line 417
    const/high16 v6, 0x40800000    # 4.0f

    .line 418
    .line 419
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v4, 0x41600000    # 14.0f

    .line 423
    .line 424
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const/16 v16, 0x3800

    .line 435
    .line 436
    const/16 v17, 0x0

    .line 437
    .line 438
    const/high16 v6, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/high16 v8, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/4 v7, 0x0

    .line 443
    const/high16 v9, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/high16 v12, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v13, 0x0

    .line 448
    const/4 v14, 0x0

    .line 449
    const/4 v15, 0x0

    .line 450
    const-string v4, ""

    .line 451
    .line 452
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 453
    .line 454
    .line 455
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 460
    .line 461
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 462
    .line 463
    .line 464
    move-result-wide v6

    .line 465
    const/4 v0, 0x0

    .line 466
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 470
    .line 471
    .line 472
    move-result v10

    .line 473
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 474
    .line 475
    .line 476
    move-result v11

    .line 477
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41240000    # 10.25f

    .line 483
    .line 484
    const/high16 v2, 0x41080000    # 8.5f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41200000    # 10.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, -0x40000000    # -2.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x3e800000    # 0.25f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x41300000    # 11.0f

    .line 505
    .line 506
    const/high16 v18, 0x40b80000    # 5.75f

    .line 507
    .line 508
    const v13, 0x412a8f5c    # 10.66f

    .line 509
    .line 510
    .line 511
    const/high16 v14, 0x40d00000    # 6.5f

    .line 512
    .line 513
    const/high16 v15, 0x41300000    # 11.0f

    .line 514
    .line 515
    const v16, 0x40c51eb8    # 6.16f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/4 v0, 0x0

    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x41240000    # 10.25f

    .line 526
    .line 527
    const/high16 v18, 0x40a00000    # 5.0f

    .line 528
    .line 529
    const/high16 v13, 0x41300000    # 11.0f

    .line 530
    .line 531
    const v14, 0x40aae148    # 5.34f

    .line 532
    .line 533
    .line 534
    const v15, 0x412a8f5c    # 10.66f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x40a00000    # 5.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v0, -0x3ef80000    # -8.5f

    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v18, 0x40b80000    # 5.75f

    .line 550
    .line 551
    const v13, 0x3fab851f    # 1.34f

    .line 552
    .line 553
    .line 554
    const/high16 v14, 0x40a00000    # 5.0f

    .line 555
    .line 556
    const/high16 v15, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const v16, 0x40aae148    # 5.34f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/4 v0, 0x0

    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 569
    .line 570
    const/high16 v18, 0x40d00000    # 6.5f

    .line 571
    .line 572
    const/high16 v13, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const v14, 0x40c51eb8    # 6.16f

    .line 575
    .line 576
    .line 577
    const v15, 0x3fab851f    # 1.34f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x40d00000    # 6.5f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40000000    # 2.0f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v18, 0x41140000    # 9.25f

    .line 601
    .line 602
    const v13, 0x3fab851f    # 1.34f

    .line 603
    .line 604
    .line 605
    const/high16 v14, 0x41080000    # 8.5f

    .line 606
    .line 607
    const/high16 v15, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const v16, 0x410d70a4    # 8.84f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/4 v0, 0x0

    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 620
    .line 621
    const/high16 v18, 0x41200000    # 10.0f

    .line 622
    .line 623
    const/high16 v13, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const v14, 0x411a8f5c    # 9.66f

    .line 626
    .line 627
    .line 628
    const v15, 0x3fab851f    # 1.34f

    .line 629
    .line 630
    .line 631
    const/high16 v16, 0x41200000    # 10.0f

    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41080000    # 8.5f

    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, 0x41300000    # 11.0f

    .line 642
    .line 643
    const/high16 v18, 0x41140000    # 9.25f

    .line 644
    .line 645
    const v13, 0x412a8f5c    # 10.66f

    .line 646
    .line 647
    .line 648
    const/high16 v14, 0x41200000    # 10.0f

    .line 649
    .line 650
    const/high16 v15, 0x41300000    # 11.0f

    .line 651
    .line 652
    const v16, 0x411a8f5c    # 9.66f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/4 v0, 0x0

    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x41240000    # 10.25f

    .line 663
    .line 664
    const/high16 v18, 0x41080000    # 8.5f

    .line 665
    .line 666
    const/high16 v13, 0x41300000    # 11.0f

    .line 667
    .line 668
    const v14, 0x410d70a4    # 8.84f

    .line 669
    .line 670
    .line 671
    const v15, 0x412a8f5c    # 10.66f

    .line 672
    .line 673
    .line 674
    const/high16 v16, 0x41080000    # 8.5f

    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x40a80000    # 5.25f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x40600000    # 3.5f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, -0x40000000    # -2.0f

    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x41080000    # 8.5f

    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x40d80000    # 6.75f

    .line 714
    .line 715
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, -0x40000000    # -2.0f

    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v0, 0x41080000    # 8.5f

    .line 724
    .line 725
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const/16 v16, 0x3800

    .line 739
    .line 740
    const/16 v17, 0x0

    .line 741
    .line 742
    const/high16 v6, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v12, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v13, 0x0

    .line 748
    const/4 v14, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    const-string v4, ""

    .line 751
    .line 752
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sput-object v0, Landroidx/compose/material/icons/rounded/FireTruckKt;->_fireTruck:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    return-object v0
.end method
