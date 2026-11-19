.class public final Landroidx/compose/material/icons/twotone/RecentActorsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _recentActors:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRecentActors(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RecentActorsKt;->_recentActors:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RecentActors"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41200000    # 10.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41500000    # 13.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41000000    # 8.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v25, 0x3ff9999a    # 1.95f

    .line 104
    .line 105
    .line 106
    const v26, 0x3ff9999a    # 1.95f

    .line 107
    .line 108
    .line 109
    const v21, 0x3f88f5c3    # 1.07f

    .line 110
    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const v23, 0x3ff9999a    # 1.95f

    .line 115
    .line 116
    .line 117
    const v24, 0x3f5eb852    # 0.87f

    .line 118
    .line 119
    .line 120
    move-object/from16 v20, v2

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v25, -0x40066666    # -1.95f

    .line 126
    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, 0x3f88f5c3    # 1.07f

    .line 131
    .line 132
    .line 133
    const v23, -0x40a147ae    # -0.87f

    .line 134
    .line 135
    .line 136
    const v24, 0x3ff9999a    # 1.95f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x40a147ae    # -0.87f

    .line 143
    .line 144
    .line 145
    const v6, -0x40066666    # -1.95f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40ddc28f    # 6.93f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41000000    # 8.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x413e3d71    # 11.89f

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x41800000    # 16.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v4, 0x4083851f    # 4.11f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, -0x40d9999a    # -0.65f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v25, 0x4078f5c3    # 3.89f

    .line 183
    .line 184
    .line 185
    const v26, -0x40066666    # -1.95f

    .line 186
    .line 187
    .line 188
    const v22, -0x4059999a    # -1.3f

    .line 189
    .line 190
    .line 191
    const v23, 0x4025c28f    # 2.59f

    .line 192
    .line 193
    .line 194
    const v24, -0x40066666    # -1.95f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x3f266666    # 0.65f

    .line 201
    .line 202
    .line 203
    const v6, 0x3ff9999a    # 1.95f

    .line 204
    .line 205
    .line 206
    const v7, 0x4078f5c3    # 3.89f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x413e3d71    # 11.89f

    .line 213
    .line 214
    .line 215
    const/high16 v6, 0x41800000    # 16.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/16 v16, 0x3800

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const v6, 0x3e99999a    # 0.3f

    .line 232
    .line 233
    .line 234
    const v8, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/high16 v9, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v12, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v4, ""

    .line 246
    .line 247
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    const/4 v2, 0x0

    .line 261
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41a80000    # 21.0f

    .line 278
    .line 279
    const/high16 v6, 0x40a00000    # 5.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x40000000    # 2.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v4, 0x41600000    # 14.0f

    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v4, -0x40000000    # -2.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x41880000    # 17.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x41600000    # 14.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, -0x40000000    # -2.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x41980000    # 19.0f

    .line 326
    .line 327
    const/high16 v6, 0x41600000    # 14.0f

    .line 328
    .line 329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/high16 v26, -0x40800000    # -1.0f

    .line 335
    .line 336
    const v21, 0x3f0ccccd    # 0.55f

    .line 337
    .line 338
    .line 339
    const/16 v22, 0x0

    .line 340
    .line 341
    const/high16 v23, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v24, -0x4119999a    # -0.45f

    .line 344
    .line 345
    .line 346
    move-object/from16 v20, v2

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x41700000    # 15.0f

    .line 352
    .line 353
    const/high16 v6, 0x40c00000    # 6.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, -0x40800000    # -1.0f

    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    const v22, -0x40f33333    # -0.55f

    .line 363
    .line 364
    .line 365
    const v23, -0x4119999a    # -0.45f

    .line 366
    .line 367
    .line 368
    const/high16 v24, -0x40800000    # -1.0f

    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x40000000    # 2.0f

    .line 374
    .line 375
    const/high16 v6, 0x40a00000    # 5.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v26, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const v21, -0x40f33333    # -0.55f

    .line 383
    .line 384
    .line 385
    const/16 v22, 0x0

    .line 386
    .line 387
    const/high16 v23, -0x40800000    # -1.0f

    .line 388
    .line 389
    const v24, 0x3ee66666    # 0.45f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x41400000    # 12.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v25, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/16 v21, 0x0

    .line 403
    .line 404
    const v22, 0x3f0ccccd    # 0.55f

    .line 405
    .line 406
    .line 407
    const v23, 0x3ee66666    # 0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v24, 0x3f800000    # 1.0f

    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x40400000    # 3.0f

    .line 422
    .line 423
    const/high16 v6, 0x40e00000    # 7.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x41200000    # 10.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x41880000    # 17.0f

    .line 437
    .line 438
    const/high16 v6, 0x40400000    # 3.0f

    .line 439
    .line 440
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x40400000    # 3.0f

    .line 444
    .line 445
    const/high16 v6, 0x40e00000    # 7.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/high16 v6, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v8, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const-string v4, ""

    .line 463
    .line 464
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 465
    .line 466
    .line 467
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 474
    .line 475
    .line 476
    move-result-wide v6

    .line 477
    const/4 v2, 0x0

    .line 478
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 482
    .line 483
    .line 484
    move-result v10

    .line 485
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    const v4, 0x411f0a3d    # 9.94f

    .line 495
    .line 496
    .line 497
    const/high16 v6, 0x41000000    # 8.0f

    .line 498
    .line 499
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/4 v4, 0x0

    .line 503
    const v6, -0x40066666    # -1.95f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v26, 0x4079999a    # 3.9f

    .line 510
    .line 511
    .line 512
    const/16 v27, 0x0

    .line 513
    .line 514
    const v21, 0x3ff9999a    # 1.95f

    .line 515
    .line 516
    .line 517
    const v22, 0x3ff9999a    # 1.95f

    .line 518
    .line 519
    .line 520
    const/16 v23, 0x0

    .line 521
    .line 522
    const/16 v24, 0x1

    .line 523
    .line 524
    const/16 v25, 0x1

    .line 525
    .line 526
    move-object/from16 v20, v2

    .line 527
    .line 528
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v26, -0x3f866666    # -3.9f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v7, 0x0

    .line 544
    const-string v4, ""

    .line 545
    .line 546
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 547
    .line 548
    .line 549
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 554
    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 556
    .line 557
    .line 558
    move-result-wide v6

    .line 559
    const/4 v0, 0x0

    .line 560
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 564
    .line 565
    .line 566
    move-result v10

    .line 567
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 574
    .line 575
    .line 576
    const v0, 0x41566666    # 13.4f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x41000000    # 8.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x3f870a3d    # -3.89f

    .line 585
    .line 586
    .line 587
    const v18, 0x3ff9999a    # 1.95f

    .line 588
    .line 589
    .line 590
    const v13, -0x4059999a    # -1.3f

    .line 591
    .line 592
    .line 593
    const v15, -0x3f870a3d    # -3.89f

    .line 594
    .line 595
    .line 596
    const v16, 0x3f266666    # 0.65f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x41800000    # 16.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x40f8f5c3    # 7.78f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, -0x40d9999a    # -0.65f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v18, -0x40066666    # -1.95f

    .line 620
    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const v14, -0x4059999a    # -1.3f

    .line 624
    .line 625
    .line 626
    const v15, -0x3fda3d71    # -2.59f

    .line 627
    .line 628
    .line 629
    const v16, -0x40066666    # -1.95f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    const/16 v16, 0x3800

    .line 643
    .line 644
    const/16 v17, 0x0

    .line 645
    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/4 v7, 0x0

    .line 649
    const/high16 v12, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    const-string v4, ""

    .line 654
    .line 655
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    sput-object v0, Landroidx/compose/material/icons/twotone/RecentActorsKt;->_recentActors:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0
.end method
