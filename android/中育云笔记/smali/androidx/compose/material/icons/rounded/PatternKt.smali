.class public final Landroidx/compose/material/icons/rounded/PatternKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pattern:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPattern(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PatternKt;->_pattern:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Pattern"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x40e33333    # 7.1f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x41000000    # 8.0f

    .line 105
    .line 106
    const/high16 v4, 0x40c00000    # 6.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41600000    # 14.0f

    .line 120
    .line 121
    const/high16 v2, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v13, 0x3f8ccccd    # 1.1f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v16, -0x4099999a    # -0.9f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, -0x4099999a    # -0.9f

    .line 139
    .line 140
    .line 141
    const/high16 v2, -0x40000000    # -2.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/high16 v4, -0x40000000    # -2.0f

    .line 152
    .line 153
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x409ccccd    # 4.9f

    .line 157
    .line 158
    .line 159
    const/high16 v2, 0x41600000    # 14.0f

    .line 160
    .line 161
    const/high16 v4, 0x40c00000    # 6.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41400000    # 12.0f

    .line 170
    .line 171
    const/high16 v2, 0x41000000    # 8.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x4099999a    # -0.9f

    .line 180
    .line 181
    .line 182
    const/high16 v2, -0x40000000    # -2.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x3f666666    # 0.9f

    .line 188
    .line 189
    .line 190
    const/high16 v2, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v4, -0x40000000    # -2.0f

    .line 193
    .line 194
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x412e6666    # 10.9f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x41400000    # 12.0f

    .line 201
    .line 202
    const/high16 v4, 0x41000000    # 8.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41900000    # 18.0f

    .line 211
    .line 212
    const/high16 v2, 0x41200000    # 10.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x40000000    # -2.0f

    .line 218
    .line 219
    const/high16 v18, 0x40000000    # 2.0f

    .line 220
    .line 221
    const v13, -0x40733333    # -1.1f

    .line 222
    .line 223
    .line 224
    const/high16 v15, -0x40000000    # -2.0f

    .line 225
    .line 226
    const v16, 0x3f666666    # 0.9f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x3f666666    # 0.9f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, -0x4099999a    # -0.9f

    .line 241
    .line 242
    .line 243
    const/high16 v4, -0x40000000    # -2.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x4198cccd    # 19.1f

    .line 249
    .line 250
    .line 251
    const/high16 v2, 0x41900000    # 18.0f

    .line 252
    .line 253
    const/high16 v4, 0x41200000    # 10.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x418fd70a    # 17.98f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x41800000    # 16.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x4023d70a    # -1.72f

    .line 270
    .line 271
    .line 272
    const/high16 v18, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const v13, -0x40c28f5c    # -0.74f

    .line 275
    .line 276
    .line 277
    const v15, -0x4050a3d7    # -1.37f

    .line 278
    .line 279
    .line 280
    const v16, 0x3ecccccd    # 0.4f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3fdd70a4    # -2.54f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v18, -0x40800000    # -1.0f

    .line 293
    .line 294
    const v13, -0x4151eb85    # -0.34f

    .line 295
    .line 296
    .line 297
    const v14, -0x40e66666    # -0.6f

    .line 298
    .line 299
    .line 300
    const v15, -0x40851eb8    # -0.98f

    .line 301
    .line 302
    .line 303
    const/high16 v16, -0x40800000    # -1.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x4023d70a    # -1.72f

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const v4, -0x4050a3d7    # -1.37f

    .line 314
    .line 315
    .line 316
    const v6, 0x3ecccccd    # 0.4f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x41068f5c    # 8.41f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x40447ae1    # 3.07f

    .line 329
    .line 330
    .line 331
    const v2, -0x3fbb851f    # -3.07f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/high16 v18, 0x41600000    # 14.0f

    .line 340
    .line 341
    const v13, 0x413a6666    # 11.65f

    .line 342
    .line 343
    .line 344
    const v14, 0x415f851f    # 13.97f

    .line 345
    .line 346
    .line 347
    const v15, 0x413d1eb8    # 11.82f

    .line 348
    .line 349
    .line 350
    const/high16 v16, 0x41600000    # 14.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40000000    # 2.0f

    .line 356
    .line 357
    const/high16 v18, -0x40000000    # -2.0f

    .line 358
    .line 359
    const v13, 0x3f8ccccd    # 1.1f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, 0x40000000    # 2.0f

    .line 364
    .line 365
    const v16, -0x4099999a    # -0.9f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x4270a3d7    # -0.07f

    .line 372
    .line 373
    .line 374
    const v18, -0x40fd70a4    # -0.51f

    .line 375
    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, -0x41c7ae14    # -0.18f

    .line 379
    .line 380
    .line 381
    const v15, -0x430a3d71    # -0.03f

    .line 382
    .line 383
    .line 384
    const v16, -0x414ccccd    # -0.35f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x3f9c28f6    # -3.56f

    .line 391
    .line 392
    .line 393
    const v2, 0x4063d70a    # 3.56f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41900000    # 18.0f

    .line 400
    .line 401
    const/high16 v18, 0x41000000    # 8.0f

    .line 402
    .line 403
    const v13, 0x418d3333    # 17.65f

    .line 404
    .line 405
    .line 406
    const v14, 0x40ff0a3d    # 7.97f

    .line 407
    .line 408
    .line 409
    const v15, 0x418e8f5c    # 17.82f

    .line 410
    .line 411
    .line 412
    const/high16 v16, 0x41000000    # 8.0f

    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x40000000    # 2.0f

    .line 418
    .line 419
    const/high16 v18, -0x40000000    # -2.0f

    .line 420
    .line 421
    const v13, 0x3f8ccccd    # 1.1f

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const/high16 v15, 0x40000000    # 2.0f

    .line 426
    .line 427
    const v16, -0x4099999a    # -0.9f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, -0x4099999a    # -0.9f

    .line 434
    .line 435
    .line 436
    const/high16 v2, -0x40000000    # -2.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x3f666666    # 0.9f

    .line 442
    .line 443
    .line 444
    const/high16 v2, 0x40000000    # 2.0f

    .line 445
    .line 446
    const/high16 v4, -0x40000000    # -2.0f

    .line 447
    .line 448
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3d8f5c29    # 0.07f

    .line 452
    .line 453
    .line 454
    const v18, 0x3f028f5c    # 0.51f

    .line 455
    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const v14, 0x3e3851ec    # 0.18f

    .line 459
    .line 460
    .line 461
    const v15, 0x3cf5c28f    # 0.03f

    .line 462
    .line 463
    .line 464
    const v16, 0x3eb33333    # 0.35f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x3f9c28f6    # -3.56f

    .line 471
    .line 472
    .line 473
    const v2, 0x4063d70a    # 3.56f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x41400000    # 12.0f

    .line 480
    .line 481
    const/high16 v18, 0x41200000    # 10.0f

    .line 482
    .line 483
    const v13, 0x4145999a    # 12.35f

    .line 484
    .line 485
    .line 486
    const v14, 0x41207ae1    # 10.03f

    .line 487
    .line 488
    .line 489
    const v15, 0x4142e148    # 12.18f

    .line 490
    .line 491
    .line 492
    const/high16 v16, 0x41200000    # 10.0f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, -0x40000000    # -2.0f

    .line 498
    .line 499
    const/high16 v18, 0x40000000    # 2.0f

    .line 500
    .line 501
    const v13, -0x40733333    # -1.1f

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const/high16 v15, -0x40000000    # -2.0f

    .line 506
    .line 507
    const v16, 0x3f666666    # 0.9f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3d8f5c29    # 0.07f

    .line 514
    .line 515
    .line 516
    const v18, 0x3f028f5c    # 0.51f

    .line 517
    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const v14, 0x3e3851ec    # 0.18f

    .line 521
    .line 522
    .line 523
    const v15, 0x3cf5c28f    # 0.03f

    .line 524
    .line 525
    .line 526
    const v16, 0x3eb33333    # 0.35f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v17, 0x40c00000    # 6.0f

    .line 536
    .line 537
    const/high16 v18, 0x41800000    # 16.0f

    .line 538
    .line 539
    const v13, 0x40cb3333    # 6.35f

    .line 540
    .line 541
    .line 542
    const v14, 0x41803d71    # 16.03f

    .line 543
    .line 544
    .line 545
    const v15, 0x40c5c28f    # 6.18f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x41800000    # 16.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v17, -0x40000000    # -2.0f

    .line 554
    .line 555
    const/high16 v18, 0x40000000    # 2.0f

    .line 556
    .line 557
    const v13, -0x40733333    # -1.1f

    .line 558
    .line 559
    .line 560
    const/4 v14, 0x0

    .line 561
    const/high16 v15, -0x40000000    # -2.0f

    .line 562
    .line 563
    const v16, 0x3f666666    # 0.9f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x3f666666    # 0.9f

    .line 570
    .line 571
    .line 572
    const/high16 v2, 0x40000000    # 2.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x3fdc28f6    # 1.72f

    .line 578
    .line 579
    .line 580
    const/high16 v18, -0x40800000    # -1.0f

    .line 581
    .line 582
    const v13, 0x3f3d70a4    # 0.74f

    .line 583
    .line 584
    .line 585
    const v15, 0x3faf5c29    # 1.37f

    .line 586
    .line 587
    .line 588
    const v16, -0x41333333    # -0.4f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x40247ae1    # 2.57f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v18, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const v13, 0x3eae147b    # 0.34f

    .line 603
    .line 604
    .line 605
    const v14, 0x3f19999a    # 0.6f

    .line 606
    .line 607
    .line 608
    const v15, 0x3f7ae148    # 0.98f

    .line 609
    .line 610
    .line 611
    const/high16 v16, 0x3f800000    # 1.0f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x3fdc28f6    # 1.72f

    .line 617
    .line 618
    .line 619
    const/high16 v2, -0x40800000    # -1.0f

    .line 620
    .line 621
    const v4, 0x3faf5c29    # 1.37f

    .line 622
    .line 623
    .line 624
    const v6, -0x41333333    # -0.4f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x40233333    # 2.55f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x40000000    # 2.0f

    .line 640
    .line 641
    const/high16 v18, -0x40000000    # -2.0f

    .line 642
    .line 643
    const v13, 0x3f8ccccd    # 1.1f

    .line 644
    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const/high16 v15, 0x40000000    # 2.0f

    .line 648
    .line 649
    const v16, -0x4099999a    # -0.9f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x418fd70a    # 17.98f

    .line 656
    .line 657
    .line 658
    const/high16 v18, 0x41800000    # 16.0f

    .line 659
    .line 660
    const v13, 0x419fd70a    # 19.98f

    .line 661
    .line 662
    .line 663
    const v14, 0x41873333    # 16.9f

    .line 664
    .line 665
    .line 666
    const v15, 0x4198a3d7    # 19.08f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x41800000    # 16.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const/16 v16, 0x3800

    .line 682
    .line 683
    const/16 v17, 0x0

    .line 684
    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/high16 v8, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/4 v7, 0x0

    .line 690
    const/high16 v9, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v12, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const/4 v14, 0x0

    .line 696
    const/4 v15, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sput-object v0, Landroidx/compose/material/icons/rounded/PatternKt;->_pattern:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v0
.end method
