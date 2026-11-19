.class public final Landroidx/compose/material/icons/twotone/WeekendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _weekend:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWeekend(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WeekendKt;->_weekend:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Weekend"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v21, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v24, 0x3ee66666    # 0.45f

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, -0x3f800000    # -4.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v26, -0x40800000    # -1.0f

    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const v22, -0x40f33333    # -0.55f

    .line 114
    .line 115
    .line 116
    const v23, -0x4119999a    # -0.45f

    .line 117
    .line 118
    .line 119
    const/high16 v24, -0x40800000    # -1.0f

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, -0x40800000    # -1.0f

    .line 125
    .line 126
    const v6, 0x3ee66666    # 0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v7, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40a00000    # 5.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v26, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v22, 0x3f0ccccd    # 0.55f

    .line 144
    .line 145
    .line 146
    const v23, 0x3ee66666    # 0.45f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41900000    # 18.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v26, -0x40800000    # -1.0f

    .line 160
    .line 161
    const v21, 0x3f0ccccd    # 0.55f

    .line 162
    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const/high16 v23, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const v24, -0x4119999a    # -0.45f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, -0x3f600000    # -5.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, -0x40800000    # -1.0f

    .line 180
    .line 181
    const/16 v21, 0x0

    .line 182
    .line 183
    const v22, -0x40f33333    # -0.55f

    .line 184
    .line 185
    .line 186
    const v23, -0x4119999a    # -0.45f

    .line 187
    .line 188
    .line 189
    const/high16 v24, -0x40800000    # -1.0f

    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41600000    # 14.0f

    .line 198
    .line 199
    const/high16 v6, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, -0x40000000    # -2.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v25, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const v26, -0x3ff1eb85    # -2.22f

    .line 217
    .line 218
    .line 219
    const v22, -0x409eb852    # -0.88f

    .line 220
    .line 221
    .line 222
    const v23, 0x3ec7ae14    # 0.39f

    .line 223
    .line 224
    .line 225
    const v24, -0x402a3d71    # -1.67f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x40e00000    # 7.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, -0x40800000    # -1.0f

    .line 237
    .line 238
    const/high16 v26, -0x40800000    # -1.0f

    .line 239
    .line 240
    const v22, -0x40f33333    # -0.55f

    .line 241
    .line 242
    .line 243
    const v23, -0x4119999a    # -0.45f

    .line 244
    .line 245
    .line 246
    const/high16 v24, -0x40800000    # -1.0f

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40c00000    # 6.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v26, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const v21, -0x40f33333    # -0.55f

    .line 259
    .line 260
    .line 261
    const/16 v22, 0x0

    .line 262
    .line 263
    const/high16 v23, -0x40800000    # -1.0f

    .line 264
    .line 265
    const v24, 0x3ee66666    # 0.45f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x4031eb85    # 2.78f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const v26, 0x400e147b    # 2.22f

    .line 280
    .line 281
    .line 282
    const v21, 0x3f1c28f6    # 0.61f

    .line 283
    .line 284
    .line 285
    const v22, 0x3f0ccccd    # 0.55f

    .line 286
    .line 287
    .line 288
    const/high16 v23, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const v24, 0x3fab851f    # 1.34f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const/16 v16, 0x3800

    .line 309
    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    const v6, 0x3e99999a    # 0.3f

    .line 313
    .line 314
    .line 315
    const v8, 0x3e99999a    # 0.3f

    .line 316
    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const/high16 v9, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/high16 v12, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const/4 v14, 0x0

    .line 325
    const/4 v15, 0x0

    .line 326
    const-string v4, ""

    .line 327
    .line 328
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 329
    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 338
    .line 339
    .line 340
    move-result-wide v6

    .line 341
    const/4 v0, 0x0

    .line 342
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41100000    # 9.0f

    .line 359
    .line 360
    const/high16 v2, 0x41a80000    # 21.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41a80000    # 21.0f

    .line 366
    .line 367
    const/high16 v2, 0x40e00000    # 7.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 373
    .line 374
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 375
    .line 376
    const v14, -0x402ccccd    # -1.65f

    .line 377
    .line 378
    .line 379
    const v15, -0x40533333    # -1.35f

    .line 380
    .line 381
    .line 382
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40c00000    # 6.0f

    .line 388
    .line 389
    const/high16 v2, 0x40800000    # 4.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x40400000    # 3.0f

    .line 395
    .line 396
    const/high16 v18, 0x40e00000    # 7.0f

    .line 397
    .line 398
    const v13, 0x408b3333    # 4.35f

    .line 399
    .line 400
    .line 401
    const/high16 v14, 0x40800000    # 4.0f

    .line 402
    .line 403
    const/high16 v15, 0x40400000    # 3.0f

    .line 404
    .line 405
    const v16, 0x40ab3333    # 5.35f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x40000000    # 2.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 417
    .line 418
    const/high16 v18, 0x40400000    # 3.0f

    .line 419
    .line 420
    const v13, -0x402ccccd    # -1.65f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 425
    .line 426
    const v16, 0x3faccccd    # 1.35f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40a00000    # 5.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x40400000    # 3.0f

    .line 438
    .line 439
    const/4 v13, 0x0

    .line 440
    const v14, 0x3fd33333    # 1.65f

    .line 441
    .line 442
    .line 443
    const v15, 0x3faccccd    # 1.35f

    .line 444
    .line 445
    .line 446
    const/high16 v16, 0x40400000    # 3.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41900000    # 18.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 457
    .line 458
    const v13, 0x3fd33333    # 1.65f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const/high16 v15, 0x40400000    # 3.0f

    .line 463
    .line 464
    const v16, -0x40533333    # -1.35f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, -0x3f600000    # -5.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, -0x402ccccd    # -1.65f

    .line 479
    .line 480
    .line 481
    const v15, -0x40533333    # -1.35f

    .line 482
    .line 483
    .line 484
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x40e00000    # 7.0f

    .line 493
    .line 494
    const/high16 v2, 0x40a00000    # 5.0f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v18, -0x40800000    # -1.0f

    .line 502
    .line 503
    const v14, -0x40f33333    # -0.55f

    .line 504
    .line 505
    .line 506
    const v15, 0x3ee66666    # 0.45f

    .line 507
    .line 508
    .line 509
    const/high16 v16, -0x40800000    # -1.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41400000    # 12.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v18, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v13, 0x3f0ccccd    # 0.55f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const v16, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x4031eb85    # 2.78f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v17, -0x40800000    # -1.0f

    .line 540
    .line 541
    const v18, 0x400e147b    # 2.22f

    .line 542
    .line 543
    .line 544
    const v13, -0x40e3d70a    # -0.61f

    .line 545
    .line 546
    .line 547
    const v14, 0x3f0ccccd    # 0.55f

    .line 548
    .line 549
    .line 550
    const/high16 v15, -0x40800000    # -1.0f

    .line 551
    .line 552
    const v16, 0x3fab851f    # 1.34f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x40000000    # 2.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41600000    # 14.0f

    .line 564
    .line 565
    const/high16 v2, 0x40c00000    # 6.0f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, -0x40000000    # -2.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v18, -0x3ff1eb85    # -2.22f

    .line 576
    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const v14, -0x409eb852    # -0.88f

    .line 580
    .line 581
    .line 582
    const v15, -0x413851ec    # -0.39f

    .line 583
    .line 584
    .line 585
    const v16, -0x402a3d71    # -1.67f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40e00000    # 7.0f

    .line 592
    .line 593
    const/high16 v2, 0x40a00000    # 5.0f

    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, 0x41b00000    # 22.0f

    .line 602
    .line 603
    const/high16 v2, 0x41880000    # 17.0f

    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v18, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const v14, 0x3f0ccccd    # 0.55f

    .line 611
    .line 612
    .line 613
    const v15, -0x4119999a    # -0.45f

    .line 614
    .line 615
    .line 616
    const/high16 v16, 0x3f800000    # 1.0f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x40400000    # 3.0f

    .line 622
    .line 623
    const/high16 v2, 0x41900000    # 18.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v18, -0x40800000    # -1.0f

    .line 629
    .line 630
    const v13, -0x40f33333    # -0.55f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const/high16 v15, -0x40800000    # -1.0f

    .line 635
    .line 636
    const v16, -0x4119999a    # -0.45f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, -0x3f600000    # -5.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v17, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const v14, -0x40f33333    # -0.55f

    .line 651
    .line 652
    .line 653
    const v15, 0x3ee66666    # 0.45f

    .line 654
    .line 655
    .line 656
    const/high16 v16, -0x40800000    # -1.0f

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3ee66666    # 0.45f

    .line 662
    .line 663
    .line 664
    const/high16 v2, 0x3f800000    # 1.0f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x40800000    # 4.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x41800000    # 16.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, -0x3f800000    # -4.0f

    .line 680
    .line 681
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x3ee66666    # 0.45f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v0, 0x40a00000    # 5.0f

    .line 694
    .line 695
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const/16 v16, 0x3800

    .line 706
    .line 707
    const/16 v17, 0x0

    .line 708
    .line 709
    const/high16 v6, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/high16 v8, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    const/high16 v12, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v14, 0x0

    .line 717
    const/4 v15, 0x0

    .line 718
    const-string v4, ""

    .line 719
    .line 720
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    sput-object v0, Landroidx/compose/material/icons/twotone/WeekendKt;->_weekend:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 729
    .line 730
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    return-object v0
.end method
