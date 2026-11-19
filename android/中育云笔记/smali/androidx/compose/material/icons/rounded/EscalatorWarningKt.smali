.class public final Landroidx/compose/material/icons/rounded/EscalatorWarningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _escalatorWarning:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEscalatorWarning(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EscalatorWarningKt;->_escalatorWarning:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EscalatorWarning"

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
    const/high16 v0, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, 0x3f666666    # 0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    const/high16 v4, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x40accccd    # 5.4f

    .line 107
    .line 108
    .line 109
    const/high16 v2, 0x40d00000    # 6.5f

    .line 110
    .line 111
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41180000    # 9.5f

    .line 118
    .line 119
    const/high16 v2, 0x41780000    # 15.5f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 125
    .line 126
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, 0x3f547ae1    # 0.83f

    .line 130
    .line 131
    .line 132
    const v15, 0x3f2b851f    # 0.67f

    .line 133
    .line 134
    .line 135
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, -0x40d47ae1    # -0.67f

    .line 141
    .line 142
    .line 143
    const/high16 v2, -0x40400000    # -1.5f

    .line 144
    .line 145
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x418ea3d7    # 17.83f

    .line 151
    .line 152
    .line 153
    const/high16 v2, 0x41880000    # 17.0f

    .line 154
    .line 155
    const/high16 v4, 0x41000000    # 8.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x410ab852    # 8.67f

    .line 161
    .line 162
    .line 163
    const/high16 v2, 0x41180000    # 9.5f

    .line 164
    .line 165
    const/high16 v4, 0x41780000    # 15.5f

    .line 166
    .line 167
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41940000    # 18.5f

    .line 174
    .line 175
    const/high16 v2, 0x41400000    # 12.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x3fca3d71    # -2.84f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x40466666    # -1.45f

    .line 187
    .line 188
    .line 189
    const v18, 0x3f5c28f6    # 0.86f

    .line 190
    .line 191
    .line 192
    const v13, -0x40eb851f    # -0.58f

    .line 193
    .line 194
    .line 195
    const v14, 0x3c23d70a    # 0.01f

    .line 196
    .line 197
    .line 198
    const v15, -0x406e147b    # -1.14f

    .line 199
    .line 200
    .line 201
    const v16, 0x3ea3d70a    # 0.32f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x40947ae1    # -0.92f

    .line 208
    .line 209
    .line 210
    const v2, 0x3fa8f5c3    # 1.32f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x411b851f    # 9.72f

    .line 217
    .line 218
    .line 219
    const/high16 v2, 0x41000000    # 8.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x410028f6    # 8.01f

    .line 225
    .line 226
    .line 227
    const/high16 v18, 0x40e00000    # 7.0f

    .line 228
    .line 229
    const v13, 0x4115999a    # 9.35f

    .line 230
    .line 231
    .line 232
    const v14, 0x40ebd70a    # 7.37f

    .line 233
    .line 234
    .line 235
    const v15, 0x410b0a3d    # 8.69f

    .line 236
    .line 237
    .line 238
    const v16, 0x40e051ec    # 7.01f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x40a00000    # 5.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x40400000    # 3.0f

    .line 250
    .line 251
    const/high16 v18, 0x41100000    # 9.0f

    .line 252
    .line 253
    const v13, 0x4079999a    # 3.9f

    .line 254
    .line 255
    .line 256
    const/high16 v14, 0x40e00000    # 7.0f

    .line 257
    .line 258
    const/high16 v15, 0x40400000    # 3.0f

    .line 259
    .line 260
    const v16, 0x40fccccd    # 7.9f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/high16 v18, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, 0x3f0ccccd    # 0.55f

    .line 275
    .line 276
    .line 277
    const v15, 0x3ee66666    # 0.45f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x3f800000    # 1.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x3f000000    # 0.5f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40c00000    # 6.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x40400000    # 3.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v18, -0x40800000    # -1.0f

    .line 304
    .line 305
    const v13, 0x3f0ccccd    # 0.55f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const/high16 v15, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const v16, -0x4119999a    # -0.45f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, -0x3ee9c28f    # -9.39f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x400f5c29    # 2.24f

    .line 324
    .line 325
    .line 326
    const v2, 0x4078f5c3    # 3.89f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3f5eb852    # 0.87f

    .line 333
    .line 334
    .line 335
    const/high16 v18, 0x3f000000    # 0.5f

    .line 336
    .line 337
    const v13, 0x3e3851ec    # 0.18f

    .line 338
    .line 339
    .line 340
    const v14, 0x3e9eb852    # 0.31f

    .line 341
    .line 342
    .line 343
    const v15, 0x3f028f5c    # 0.51f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x3f000000    # 0.5f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x3f8ccccd    # 1.1f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3f51eb85    # 0.82f

    .line 358
    .line 359
    .line 360
    const v18, -0x4123d70a    # -0.43f

    .line 361
    .line 362
    .line 363
    const v13, 0x3ea8f5c3    # 0.33f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const v15, 0x3f2147ae    # 0.63f

    .line 368
    .line 369
    .line 370
    const v16, -0x41dc28f6    # -0.16f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41700000    # 15.0f

    .line 377
    .line 378
    const v2, 0x416e6666    # 14.9f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41a80000    # 21.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v18, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, 0x3f0ccccd    # 0.55f

    .line 395
    .line 396
    .line 397
    const v15, 0x3ee66666    # 0.45f

    .line 398
    .line 399
    .line 400
    const/high16 v16, 0x3f800000    # 1.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x40000000    # 2.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v18, -0x40800000    # -1.0f

    .line 411
    .line 412
    const v13, 0x3f0ccccd    # 0.55f

    .line 413
    .line 414
    .line 415
    const/4 v14, 0x0

    .line 416
    const/high16 v15, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const v16, -0x4119999a    # -0.45f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, -0x3f800000    # -4.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/4 v0, 0x0

    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x41940000    # 18.5f

    .line 442
    .line 443
    const/high16 v18, 0x41400000    # 12.0f

    .line 444
    .line 445
    const/high16 v13, 0x41a00000    # 20.0f

    .line 446
    .line 447
    const v14, 0x414ae148    # 12.68f

    .line 448
    .line 449
    .line 450
    const v15, 0x419aa3d7    # 19.33f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x41400000    # 12.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/16 v16, 0x3800

    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const/high16 v6, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v8, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const/high16 v9, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const/4 v14, 0x0

    .line 480
    const/4 v15, 0x0

    .line 481
    const-string v4, ""

    .line 482
    .line 483
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    sput-object v0, Landroidx/compose/material/icons/rounded/EscalatorWarningKt;->_escalatorWarning:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    return-object v0
.end method
