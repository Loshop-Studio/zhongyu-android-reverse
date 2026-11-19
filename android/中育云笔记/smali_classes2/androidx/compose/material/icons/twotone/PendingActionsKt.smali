.class public final Landroidx/compose/material/icons/twotone/PendingActionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pendingActions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPendingActions(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PendingActionsKt;->_pendingActions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PendingActions"

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
    const v4, 0x419acccd    # 19.35f

    .line 71
    .line 72
    .line 73
    const v6, 0x41953333    # 18.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3ff66666    # -2.15f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, 0x41600000    # 14.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x3f800000    # 1.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, 0x40328f5c    # 2.79f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x3feccccd    # 1.85f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x419acccd    # 19.35f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41200000    # 10.0f

    .line 117
    .line 118
    const/high16 v6, 0x41880000    # 17.0f

    .line 119
    .line 120
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x3f800000    # 1.0f

    .line 124
    .line 125
    const v26, 0x3da3d70a    # 0.08f

    .line 126
    .line 127
    .line 128
    const v21, 0x3eae147b    # 0.34f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const v23, 0x3f2b851f    # 0.67f

    .line 134
    .line 135
    .line 136
    const v24, 0x3cf5c28f    # 0.03f

    .line 137
    .line 138
    .line 139
    move-object/from16 v20, v2

    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x40a00000    # 5.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, -0x40000000    # -2.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41000000    # 8.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x40a00000    # 5.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v4, 0x40c00000    # 6.0f

    .line 170
    .line 171
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x41700000    # 15.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v4, 0x4095c28f    # 4.68f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, 0x41200000    # 10.0f

    .line 186
    .line 187
    const/high16 v26, 0x41880000    # 17.0f

    .line 188
    .line 189
    const/high16 v21, 0x41240000    # 10.25f

    .line 190
    .line 191
    const v22, 0x4198b852    # 19.09f

    .line 192
    .line 193
    .line 194
    const/high16 v23, 0x41200000    # 10.0f

    .line 195
    .line 196
    const v24, 0x4190a3d7    # 18.08f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x41880000    # 17.0f

    .line 203
    .line 204
    const/high16 v26, 0x41200000    # 10.0f

    .line 205
    .line 206
    const/high16 v21, 0x41200000    # 10.0f

    .line 207
    .line 208
    const v22, 0x4152147b    # 13.13f

    .line 209
    .line 210
    .line 211
    const v23, 0x4152147b    # 13.13f

    .line 212
    .line 213
    .line 214
    const/high16 v24, 0x41200000    # 10.0f

    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v4, 0x41400000    # 12.0f

    .line 223
    .line 224
    const/high16 v6, 0x40a00000    # 5.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, -0x40800000    # -1.0f

    .line 230
    .line 231
    const/high16 v26, -0x40800000    # -1.0f

    .line 232
    .line 233
    const v21, -0x40f33333    # -0.55f

    .line 234
    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    const/high16 v23, -0x40800000    # -1.0f

    .line 239
    .line 240
    const v24, -0x4119999a    # -0.45f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v25, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const v22, -0x40f33333    # -0.55f

    .line 251
    .line 252
    .line 253
    const v23, 0x3ee66666    # 0.45f

    .line 254
    .line 255
    .line 256
    const/high16 v24, -0x40800000    # -1.0f

    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v26, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const v21, 0x3f0ccccd    # 0.55f

    .line 264
    .line 265
    .line 266
    const/16 v22, 0x0

    .line 267
    .line 268
    const/high16 v23, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v24, 0x3ee66666    # 0.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v25, 0x41400000    # 12.0f

    .line 277
    .line 278
    const/high16 v26, 0x40a00000    # 5.0f

    .line 279
    .line 280
    const/high16 v21, 0x41500000    # 13.0f

    .line 281
    .line 282
    const v22, 0x4091999a    # 4.55f

    .line 283
    .line 284
    .line 285
    const v23, 0x4148cccd    # 12.55f

    .line 286
    .line 287
    .line 288
    const/high16 v24, 0x40a00000    # 5.0f

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const/16 v16, 0x3800

    .line 301
    .line 302
    const/16 v17, 0x0

    .line 303
    .line 304
    const v6, 0x3e99999a    # 0.3f

    .line 305
    .line 306
    .line 307
    const v8, 0x3e99999a    # 0.3f

    .line 308
    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/high16 v9, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v12, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const/4 v13, 0x0

    .line 316
    const/4 v14, 0x0

    .line 317
    const/4 v15, 0x0

    .line 318
    const-string v4, ""

    .line 319
    .line 320
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v6

    .line 333
    const/4 v0, 0x0

    .line 334
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41880000    # 17.0f

    .line 351
    .line 352
    const/high16 v2, 0x41400000    # 12.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, -0x3f600000    # -5.0f

    .line 358
    .line 359
    const/high16 v18, 0x40a00000    # 5.0f

    .line 360
    .line 361
    const v13, -0x3fcf5c29    # -2.76f

    .line 362
    .line 363
    .line 364
    const/high16 v15, -0x3f600000    # -5.0f

    .line 365
    .line 366
    const v16, 0x400f5c29    # 2.24f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x400f5c29    # 2.24f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x40a00000    # 5.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x40a00000    # 5.0f

    .line 381
    .line 382
    const/high16 v18, -0x3f600000    # -5.0f

    .line 383
    .line 384
    const v13, 0x4030a3d7    # 2.76f

    .line 385
    .line 386
    .line 387
    const/high16 v15, 0x40a00000    # 5.0f

    .line 388
    .line 389
    const v16, -0x3ff0a3d7    # -2.24f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x419e147b    # 19.76f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x41880000    # 17.0f

    .line 399
    .line 400
    const/high16 v4, 0x41400000    # 12.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x419acccd    # 19.35f

    .line 409
    .line 410
    .line 411
    const v2, 0x41953333    # 18.65f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x3ff66666    # -2.15f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41600000    # 14.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x3f800000    # 1.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40328f5c    # 2.79f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x3feccccd    # 1.85f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x419acccd    # 19.35f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41900000    # 18.0f

    .line 455
    .line 456
    const/high16 v2, 0x40400000    # 3.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, -0x3fb47ae1    # -3.18f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41400000    # 12.0f

    .line 468
    .line 469
    const/high16 v18, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const v13, 0x41666666    # 14.4f

    .line 472
    .line 473
    .line 474
    const v14, 0x3feb851f    # 1.84f

    .line 475
    .line 476
    .line 477
    const v15, 0x4154cccd    # 13.3f

    .line 478
    .line 479
    .line 480
    const/high16 v16, 0x3f800000    # 1.0f

    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x3feb851f    # 1.84f

    .line 486
    .line 487
    .line 488
    const v2, 0x4112e148    # 9.18f

    .line 489
    .line 490
    .line 491
    const/high16 v4, 0x40400000    # 3.0f

    .line 492
    .line 493
    const v6, 0x4119999a    # 9.6f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x40c00000    # 6.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x40800000    # 4.0f

    .line 505
    .line 506
    const/high16 v18, 0x40a00000    # 5.0f

    .line 507
    .line 508
    const v13, 0x409ccccd    # 4.9f

    .line 509
    .line 510
    .line 511
    const/high16 v14, 0x40400000    # 3.0f

    .line 512
    .line 513
    const/high16 v15, 0x40800000    # 4.0f

    .line 514
    .line 515
    const v16, 0x4079999a    # 3.9f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x41700000    # 15.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x40000000    # 2.0f

    .line 527
    .line 528
    const/high16 v18, 0x40000000    # 2.0f

    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const v14, 0x3f8ccccd    # 1.1f

    .line 532
    .line 533
    .line 534
    const v15, 0x3f666666    # 0.9f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x40c3851f    # 6.11f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, -0x404a3d71    # -1.42f

    .line 549
    .line 550
    .line 551
    const/high16 v18, -0x40000000    # -2.0f

    .line 552
    .line 553
    const v13, -0x40e8f5c3    # -0.59f

    .line 554
    .line 555
    .line 556
    const v14, -0x40ee147b    # -0.57f

    .line 557
    .line 558
    .line 559
    const v15, -0x40770a3d    # -1.07f

    .line 560
    .line 561
    .line 562
    const/high16 v16, -0x40600000    # -1.25f

    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40c00000    # 6.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x40a00000    # 5.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40000000    # 2.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x40400000    # 3.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41000000    # 8.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40a00000    # 5.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40000000    # 2.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x40a28f5c    # 5.08f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x40000000    # 2.0f

    .line 609
    .line 610
    const v18, 0x3f19999a    # 0.6f

    .line 611
    .line 612
    .line 613
    const v13, 0x3f35c28f    # 0.71f

    .line 614
    .line 615
    .line 616
    const v14, 0x3dcccccd    # 0.1f

    .line 617
    .line 618
    .line 619
    const v15, 0x3fb0a3d7    # 1.38f

    .line 620
    .line 621
    .line 622
    const v16, 0x3e9eb852    # 0.31f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40a00000    # 5.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x41900000    # 18.0f

    .line 634
    .line 635
    const/high16 v18, 0x40400000    # 3.0f

    .line 636
    .line 637
    const/high16 v13, 0x41a00000    # 20.0f

    .line 638
    .line 639
    const v14, 0x4079999a    # 3.9f

    .line 640
    .line 641
    .line 642
    const v15, 0x4198cccd    # 19.1f

    .line 643
    .line 644
    .line 645
    const/high16 v16, 0x40400000    # 3.0f

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41400000    # 12.0f

    .line 654
    .line 655
    const/high16 v2, 0x40a00000    # 5.0f

    .line 656
    .line 657
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v17, -0x40800000    # -1.0f

    .line 661
    .line 662
    const/high16 v18, -0x40800000    # -1.0f

    .line 663
    .line 664
    const v13, -0x40f33333    # -0.55f

    .line 665
    .line 666
    .line 667
    const/4 v14, 0x0

    .line 668
    const/high16 v15, -0x40800000    # -1.0f

    .line 669
    .line 670
    const v16, -0x4119999a    # -0.45f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v13, 0x0

    .line 679
    const v14, -0x40f33333    # -0.55f

    .line 680
    .line 681
    .line 682
    const v15, 0x3ee66666    # 0.45f

    .line 683
    .line 684
    .line 685
    const/high16 v16, -0x40800000    # -1.0f

    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v18, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const v13, 0x3f0ccccd    # 0.55f

    .line 693
    .line 694
    .line 695
    const/4 v14, 0x0

    .line 696
    const/high16 v15, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const v16, 0x3ee66666    # 0.45f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v17, 0x41400000    # 12.0f

    .line 705
    .line 706
    const/high16 v18, 0x40a00000    # 5.0f

    .line 707
    .line 708
    const/high16 v13, 0x41500000    # 13.0f

    .line 709
    .line 710
    const v14, 0x4091999a    # 4.55f

    .line 711
    .line 712
    .line 713
    const v15, 0x4148cccd    # 12.55f

    .line 714
    .line 715
    .line 716
    const/high16 v16, 0x40a00000    # 5.0f

    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    const/16 v16, 0x3800

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/high16 v6, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v8, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    const/high16 v12, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/4 v13, 0x0

    .line 740
    const/4 v14, 0x0

    .line 741
    const/4 v15, 0x0

    .line 742
    const-string v4, ""

    .line 743
    .line 744
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    sput-object v0, Landroidx/compose/material/icons/twotone/PendingActionsKt;->_pendingActions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 753
    .line 754
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    return-object v0
.end method
