.class public final Landroidx/compose/material/icons/twotone/TimeToLeaveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timeToLeave:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimeToLeave(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TimeToLeaveKt;->_timeToLeave:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TimeToLeave"

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
    const v4, 0x40a3d70a    # 5.12f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x3eae147b    # 0.34f

    .line 79
    .line 80
    .line 81
    const v6, -0x420a3d71    # -0.12f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    const/high16 v6, 0x41800000    # 16.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41600000    # 14.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x3f6ae148    # -4.66f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, -0x4151eb85    # -0.34f

    .line 106
    .line 107
    .line 108
    const v6, -0x420a3d71    # -0.12f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x40a3d70a    # 5.12f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41300000    # 11.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41700000    # 15.0f

    .line 126
    .line 127
    const/high16 v6, 0x40f00000    # 7.5f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, -0x40400000    # -1.5f

    .line 133
    .line 134
    const/high16 v26, -0x40400000    # -1.5f

    .line 135
    .line 136
    const v21, -0x40ab851f    # -0.83f

    .line 137
    .line 138
    .line 139
    const/16 v22, 0x0

    .line 140
    .line 141
    const/high16 v23, -0x40400000    # -1.5f

    .line 142
    .line 143
    const v24, -0x40d47ae1    # -0.67f

    .line 144
    .line 145
    .line 146
    move-object/from16 v20, v2

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40d570a4    # 6.67f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41400000    # 12.0f

    .line 155
    .line 156
    const/high16 v7, 0x40f00000    # 7.5f

    .line 157
    .line 158
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, 0x3f2b851f    # 0.67f

    .line 162
    .line 163
    .line 164
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x410547ae    # 8.33f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x41700000    # 15.0f

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x3f2b851f    # 0.67f

    .line 189
    .line 190
    .line 191
    const/high16 v6, -0x40400000    # -1.5f

    .line 192
    .line 193
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 194
    .line 195
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 199
    .line 200
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, -0x40d47ae1    # -0.67f

    .line 204
    .line 205
    .line 206
    const/high16 v6, -0x40400000    # -1.5f

    .line 207
    .line 208
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    const/16 v16, 0x3800

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const v6, 0x3e99999a    # 0.3f

    .line 223
    .line 224
    .line 225
    const v8, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const/4 v7, 0x0

    .line 229
    const/high16 v9, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v12, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    const-string v4, ""

    .line 237
    .line 238
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const v4, 0x41975c29    # 18.92f

    .line 269
    .line 270
    .line 271
    const v6, 0x40a051ec    # 5.01f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, 0x418c0000    # 17.5f

    .line 278
    .line 279
    const/high16 v26, 0x40800000    # 4.0f

    .line 280
    .line 281
    const v21, 0x4195c28f    # 18.72f

    .line 282
    .line 283
    .line 284
    const v22, 0x408d70a4    # 4.42f

    .line 285
    .line 286
    .line 287
    const v23, 0x419147ae    # 18.16f

    .line 288
    .line 289
    .line 290
    const/high16 v24, 0x40800000    # 4.0f

    .line 291
    .line 292
    move-object/from16 v20, v2

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, -0x3ed00000    # -11.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v25, -0x404a3d71    # -1.42f

    .line 303
    .line 304
    .line 305
    const v26, 0x3f8147ae    # 1.01f

    .line 306
    .line 307
    .line 308
    const v21, -0x40d70a3d    # -0.66f

    .line 309
    .line 310
    .line 311
    const/16 v22, 0x0

    .line 312
    .line 313
    const v23, -0x40651eb8    # -1.21f

    .line 314
    .line 315
    .line 316
    const v24, 0x3ed70a3d    # 0.42f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x40400000    # 3.0f

    .line 323
    .line 324
    const/high16 v6, 0x41300000    # 11.0f

    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41000000    # 8.0f

    .line 330
    .line 331
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v25, 0x3f800000    # 1.0f

    .line 335
    .line 336
    const/high16 v26, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/16 v21, 0x0

    .line 339
    .line 340
    const v22, 0x3f0ccccd    # 0.55f

    .line 341
    .line 342
    .line 343
    const v23, 0x3ee66666    # 0.45f

    .line 344
    .line 345
    .line 346
    const/high16 v24, 0x3f800000    # 1.0f

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x3f800000    # 1.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v26, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v21, 0x3f0ccccd    # 0.55f

    .line 359
    .line 360
    .line 361
    const/16 v22, 0x0

    .line 362
    .line 363
    const/high16 v23, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v24, -0x4119999a    # -0.45f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x41400000    # 12.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x3f800000    # 1.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v26, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const v22, 0x3f0ccccd    # 0.55f

    .line 391
    .line 392
    .line 393
    const v23, 0x3ee66666    # 0.45f

    .line 394
    .line 395
    .line 396
    const/high16 v24, 0x3f800000    # 1.0f

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v26, -0x40800000    # -1.0f

    .line 405
    .line 406
    const v21, 0x3f0ccccd    # 0.55f

    .line 407
    .line 408
    .line 409
    const/16 v22, 0x0

    .line 410
    .line 411
    const/high16 v23, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const v24, -0x4119999a    # -0.45f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v4, -0x3f000000    # -8.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v4, -0x3ffae148    # -2.08f

    .line 425
    .line 426
    .line 427
    const v6, -0x3f4051ec    # -5.99f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x40db3333    # 6.85f

    .line 437
    .line 438
    .line 439
    const/high16 v6, 0x40c00000    # 6.0f

    .line 440
    .line 441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x4124a3d7    # 10.29f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v4, 0x3f851eb8    # 1.04f

    .line 451
    .line 452
    .line 453
    const/high16 v6, 0x40400000    # 3.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, 0x40b9eb85    # 5.81f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 465
    .line 466
    const v6, 0x3f851eb8    # 1.04f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v4, 0x41980000    # 19.0f

    .line 476
    .line 477
    const/high16 v6, 0x41800000    # 16.0f

    .line 478
    .line 479
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v4, 0x40a00000    # 5.0f

    .line 483
    .line 484
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v4, -0x3f6ae148    # -4.66f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v4, 0x3df5c28f    # 0.12f

    .line 494
    .line 495
    .line 496
    const v6, -0x4151eb85    # -0.34f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v4, 0x415c51ec    # 13.77f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v4, 0x3de147ae    # 0.11f

    .line 509
    .line 510
    .line 511
    const v6, 0x3eae147b    # 0.34f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x41800000    # 16.0f

    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v8, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 544
    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    const/4 v2, 0x0

    .line 550
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    const/high16 v4, 0x41580000    # 13.5f

    .line 567
    .line 568
    const/high16 v6, 0x40f00000    # 7.5f

    .line 569
    .line 570
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/4 v4, 0x0

    .line 574
    const/high16 v6, -0x40400000    # -1.5f

    .line 575
    .line 576
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v26, 0x40400000    # 3.0f

    .line 580
    .line 581
    const/16 v27, 0x0

    .line 582
    .line 583
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 584
    .line 585
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 586
    .line 587
    const/16 v23, 0x0

    .line 588
    .line 589
    const/16 v24, 0x1

    .line 590
    .line 591
    const/16 v25, 0x1

    .line 592
    .line 593
    move-object/from16 v20, v2

    .line 594
    .line 595
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 599
    .line 600
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v7, 0x0

    .line 610
    const-string v4, ""

    .line 611
    .line 612
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 613
    .line 614
    .line 615
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 620
    .line 621
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 622
    .line 623
    .line 624
    move-result-wide v6

    .line 625
    const/4 v0, 0x0

    .line 626
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 630
    .line 631
    .line 632
    move-result v10

    .line 633
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 634
    .line 635
    .line 636
    move-result v11

    .line 637
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x41580000    # 13.5f

    .line 643
    .line 644
    const/high16 v2, 0x41840000    # 16.5f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/4 v0, 0x0

    .line 650
    const/high16 v2, -0x40400000    # -1.5f

    .line 651
    .line 652
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v18, 0x40400000    # 3.0f

    .line 656
    .line 657
    const/16 v19, 0x0

    .line 658
    .line 659
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 660
    .line 661
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 662
    .line 663
    const/16 v16, 0x1

    .line 664
    .line 665
    const/16 v17, 0x1

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 671
    .line 672
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    const/16 v16, 0x3800

    .line 680
    .line 681
    const/16 v17, 0x0

    .line 682
    .line 683
    const/high16 v6, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v7, 0x0

    .line 686
    const/high16 v12, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v14, 0x0

    .line 690
    const-string v4, ""

    .line 691
    .line 692
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    sput-object v0, Landroidx/compose/material/icons/twotone/TimeToLeaveKt;->_timeToLeave:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 701
    .line 702
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    return-object v0
.end method
