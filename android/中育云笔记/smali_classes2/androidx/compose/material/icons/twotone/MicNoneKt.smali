.class public final Landroidx/compose/material/icons/twotone/MicNoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _micNone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicNone(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MicNoneKt;->_micNone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MicNone"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v25, 0x3f800000    # 1.0f

    .line 76
    .line 77
    const/high16 v26, -0x40800000    # -1.0f

    .line 78
    .line 79
    const v21, 0x3f0ccccd    # 0.55f

    .line 80
    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const/high16 v23, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v24, -0x4119999a    # -0.45f

    .line 87
    .line 88
    .line 89
    move-object/from16 v20, v2

    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40a00000    # 5.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, -0x40800000    # -1.0f

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v23, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v24, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x3ee66666    # 0.45f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v7, -0x40800000    # -1.0f

    .line 120
    .line 121
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/high16 v26, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const v22, 0x3f0ccccd    # 0.55f

    .line 134
    .line 135
    .line 136
    const v23, 0x3ee66666    # 0.45f

    .line 137
    .line 138
    .line 139
    const/high16 v24, 0x3f800000    # 1.0f

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const/16 v16, 0x3800

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const v6, 0x3e99999a    # 0.3f

    .line 156
    .line 157
    .line 158
    const v8, 0x3e99999a    # 0.3f

    .line 159
    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    const/high16 v9, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v12, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    const-string v4, ""

    .line 170
    .line 171
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v6

    .line 184
    const/4 v0, 0x0

    .line 185
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41600000    # 14.0f

    .line 202
    .line 203
    const/high16 v2, 0x41400000    # 12.0f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x40400000    # 3.0f

    .line 209
    .line 210
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 211
    .line 212
    const v13, 0x3fd47ae1    # 1.66f

    .line 213
    .line 214
    .line 215
    const/high16 v15, 0x40400000    # 3.0f

    .line 216
    .line 217
    const v16, -0x40547ae1    # -1.34f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41700000    # 15.0f

    .line 224
    .line 225
    const/high16 v2, 0x40a00000    # 5.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, -0x402b851f    # -1.66f

    .line 234
    .line 235
    .line 236
    const v15, -0x40547ae1    # -1.34f

    .line 237
    .line 238
    .line 239
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x4055c28f    # 3.34f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x41100000    # 9.0f

    .line 248
    .line 249
    const/high16 v4, 0x40a00000    # 5.0f

    .line 250
    .line 251
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40400000    # 3.0f

    .line 260
    .line 261
    const/high16 v18, 0x40400000    # 3.0f

    .line 262
    .line 263
    const v14, 0x3fd47ae1    # 1.66f

    .line 264
    .line 265
    .line 266
    const v15, 0x3fab851f    # 1.34f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x40400000    # 3.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41300000    # 11.0f

    .line 278
    .line 279
    const/high16 v2, 0x40a00000    # 5.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/high16 v18, -0x40800000    # -1.0f

    .line 287
    .line 288
    const v14, -0x40f33333    # -0.55f

    .line 289
    .line 290
    .line 291
    const v15, 0x3ee66666    # 0.45f

    .line 292
    .line 293
    .line 294
    const/high16 v16, -0x40800000    # -1.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3ee66666    # 0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x3f800000    # 1.0f

    .line 303
    .line 304
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40c00000    # 6.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, -0x40800000    # -1.0f

    .line 313
    .line 314
    const/high16 v18, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const v14, 0x3f0ccccd    # 0.55f

    .line 317
    .line 318
    .line 319
    const v15, -0x4119999a    # -0.45f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x3f800000    # 1.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, -0x4119999a    # -0.45f

    .line 328
    .line 329
    .line 330
    const/high16 v2, -0x40800000    # -1.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41300000    # 11.0f

    .line 336
    .line 337
    const/high16 v2, 0x40a00000    # 5.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41880000    # 17.0f

    .line 346
    .line 347
    const/high16 v2, 0x41300000    # 11.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x3f600000    # -5.0f

    .line 353
    .line 354
    const/high16 v18, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const v14, 0x4030a3d7    # 2.76f

    .line 357
    .line 358
    .line 359
    const v15, -0x3ff0a3d7    # -2.24f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x40a00000    # 5.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3ff0a3d7    # -2.24f

    .line 368
    .line 369
    .line 370
    const/high16 v2, -0x3f600000    # -5.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41300000    # 11.0f

    .line 376
    .line 377
    const/high16 v2, 0x40a00000    # 5.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x40c00000    # 6.0f

    .line 383
    .line 384
    const v18, 0x40dd70a4    # 6.92f

    .line 385
    .line 386
    .line 387
    const v14, 0x4061eb85    # 3.53f

    .line 388
    .line 389
    .line 390
    const v15, 0x40270a3d    # 2.61f

    .line 391
    .line 392
    .line 393
    const v16, 0x40cdc28f    # 6.43f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x41a80000    # 21.0f

    .line 400
    .line 401
    const/high16 v2, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, -0x3fbae148    # -3.08f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v18, -0x3f228f5c    # -6.92f

    .line 418
    .line 419
    .line 420
    const v13, 0x4058f5c3    # 3.39f

    .line 421
    .line 422
    .line 423
    const v14, -0x41051eb8    # -0.49f

    .line 424
    .line 425
    .line 426
    const/high16 v15, 0x40c00000    # 6.0f

    .line 427
    .line 428
    const v16, -0x3fa70a3d    # -3.39f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, -0x40000000    # -2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    const/16 v16, 0x3800

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/high16 v6, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/high16 v8, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    const/high16 v12, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v13, 0x0

    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    sput-object v0, Landroidx/compose/material/icons/twotone/MicNoneKt;->_micNone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    return-object v0
.end method
