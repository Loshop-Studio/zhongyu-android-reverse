.class public final Landroidx/compose/material/icons/rounded/SmartToyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _smartToy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSmartToy(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SmartToyKt;->_smartToy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SmartToy"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x40733333    # -1.1f

    .line 88
    .line 89
    .line 90
    const v15, -0x4099999a    # -0.9f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x40000000    # -2.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 104
    .line 105
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 106
    .line 107
    const v14, -0x402b851f    # -1.66f

    .line 108
    .line 109
    .line 110
    const v15, -0x40547ae1    # -1.34f

    .line 111
    .line 112
    .line 113
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4055c28f    # 3.34f

    .line 119
    .line 120
    .line 121
    const/high16 v2, 0x40a00000    # 5.0f

    .line 122
    .line 123
    const/high16 v4, 0x41100000    # 9.0f

    .line 124
    .line 125
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x40800000    # 4.0f

    .line 134
    .line 135
    const/high16 v18, 0x40e00000    # 7.0f

    .line 136
    .line 137
    const v13, 0x409ccccd    # 4.9f

    .line 138
    .line 139
    .line 140
    const/high16 v14, 0x40a00000    # 5.0f

    .line 141
    .line 142
    const/high16 v15, 0x40800000    # 4.0f

    .line 143
    .line 144
    const v16, 0x40bccccd    # 5.9f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x40000000    # 2.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 156
    .line 157
    const/high16 v18, 0x40400000    # 3.0f

    .line 158
    .line 159
    const v13, -0x402b851f    # -1.66f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 164
    .line 165
    const v16, 0x3fab851f    # 1.34f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x40400000    # 3.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3fd47ae1    # 1.66f

    .line 175
    .line 176
    .line 177
    const v15, 0x3fab851f    # 1.34f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x40400000    # 3.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x40800000    # 4.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v18, 0x40000000    # 2.0f

    .line 193
    .line 194
    const v14, 0x3f8ccccd    # 1.1f

    .line 195
    .line 196
    .line 197
    const v15, 0x3f666666    # 0.9f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v18, -0x40000000    # -2.0f

    .line 211
    .line 212
    const v13, 0x3f8ccccd    # 1.1f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/high16 v15, 0x40000000    # 2.0f

    .line 217
    .line 218
    const v16, -0x4099999a    # -0.9f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, -0x3f800000    # -4.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x40400000    # 3.0f

    .line 230
    .line 231
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 232
    .line 233
    const v13, 0x3fd47ae1    # 1.66f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x40400000    # 3.0f

    .line 237
    .line 238
    const v16, -0x40547ae1    # -1.34f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x41a00000    # 20.0f

    .line 245
    .line 246
    const/high16 v18, 0x41100000    # 9.0f

    .line 247
    .line 248
    const/high16 v13, 0x41b80000    # 23.0f

    .line 249
    .line 250
    const v14, 0x412570a4    # 10.34f

    .line 251
    .line 252
    .line 253
    const v15, 0x41ad47ae    # 21.66f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x41100000    # 9.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41380000    # 11.5f

    .line 265
    .line 266
    const/high16 v2, 0x40f00000    # 7.5f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x41100000    # 9.0f

    .line 272
    .line 273
    const/high16 v18, 0x41200000    # 10.0f

    .line 274
    .line 275
    const/high16 v13, 0x40f00000    # 7.5f

    .line 276
    .line 277
    const v14, 0x412ab852    # 10.67f

    .line 278
    .line 279
    .line 280
    const v15, 0x4102b852    # 8.17f

    .line 281
    .line 282
    .line 283
    const/high16 v16, 0x41200000    # 10.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x3f2b851f    # 0.67f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 292
    .line 293
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x411d47ae    # 9.83f

    .line 297
    .line 298
    .line 299
    const/high16 v2, 0x41500000    # 13.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x414547ae    # 12.33f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x41380000    # 11.5f

    .line 308
    .line 309
    const/high16 v4, 0x40f00000    # 7.5f

    .line 310
    .line 311
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41880000    # 17.0f

    .line 318
    .line 319
    const/high16 v2, 0x41700000    # 15.0f

    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x41100000    # 9.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x40800000    # -1.0f

    .line 330
    .line 331
    const/high16 v18, -0x40800000    # -1.0f

    .line 332
    .line 333
    const v13, -0x40f33333    # -0.55f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const/high16 v15, -0x40800000    # -1.0f

    .line 338
    .line 339
    const v16, -0x4119999a    # -0.45f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/4 v0, 0x0

    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const v14, -0x40f33333    # -0.55f

    .line 353
    .line 354
    .line 355
    const v15, 0x3ee66666    # 0.45f

    .line 356
    .line 357
    .line 358
    const/high16 v16, -0x40800000    # -1.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x40c00000    # 6.0f

    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v18, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const v13, 0x3f0ccccd    # 0.55f

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const/high16 v15, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const v16, 0x3ee66666    # 0.45f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41700000    # 15.0f

    .line 387
    .line 388
    const/high16 v18, 0x41880000    # 17.0f

    .line 389
    .line 390
    const/high16 v13, 0x41800000    # 16.0f

    .line 391
    .line 392
    const v14, 0x41846666    # 16.55f

    .line 393
    .line 394
    .line 395
    const v15, 0x4178cccd    # 15.55f

    .line 396
    .line 397
    .line 398
    const/high16 v16, 0x41880000    # 17.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41700000    # 15.0f

    .line 407
    .line 408
    const/high16 v2, 0x41500000    # 13.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, -0x40400000    # -1.5f

    .line 414
    .line 415
    const/high16 v18, -0x40400000    # -1.5f

    .line 416
    .line 417
    const v13, -0x40ab851f    # -0.83f

    .line 418
    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/high16 v15, -0x40400000    # -1.5f

    .line 422
    .line 423
    const v16, -0x40d47ae1    # -0.67f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x4162b852    # 14.17f

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x41200000    # 10.0f

    .line 433
    .line 434
    const/high16 v4, 0x41700000    # 15.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x3f2b851f    # 0.67f

    .line 440
    .line 441
    .line 442
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 443
    .line 444
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x417d47ae    # 15.83f

    .line 448
    .line 449
    .line 450
    const/high16 v2, 0x41700000    # 15.0f

    .line 451
    .line 452
    const/high16 v4, 0x41500000    # 13.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    const/16 v16, 0x3800

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    const/high16 v6, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/high16 v8, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    const/high16 v9, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v12, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const/4 v15, 0x0

    .line 479
    const-string v4, ""

    .line 480
    .line 481
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    sput-object v0, Landroidx/compose/material/icons/rounded/SmartToyKt;->_smartToy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 490
    .line 491
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object v0
.end method
