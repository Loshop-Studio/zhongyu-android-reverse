.class public final Landroidx/compose/material/icons/outlined/BroadcastOnPersonalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBroadcastOnPersonal(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BroadcastOnPersonal"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    const/high16 v6, -0x3f700000    # -4.5f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x40828f5c    # 4.08f

    .line 90
    .line 91
    .line 92
    const v6, 0x4043d70a    # 3.06f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x40270a3d    # 2.61f

    .line 99
    .line 100
    .line 101
    const v26, -0x40f5c28f    # -0.54f

    .line 102
    .line 103
    .line 104
    const v21, 0x3f4f5c29    # 0.81f

    .line 105
    .line 106
    .line 107
    const v22, -0x415c28f6    # -0.32f

    .line 108
    .line 109
    .line 110
    const v23, 0x3fd851ec    # 1.69f

    .line 111
    .line 112
    .line 113
    const v24, -0x40fd70a4    # -0.51f

    .line 114
    .line 115
    .line 116
    move-object/from16 v20, v2

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v6, 0x40400000    # 3.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v6, 0x41100000    # 9.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41400000    # 12.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x410c28f6    # 8.76f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, -0x406a3d71    # -1.17f

    .line 147
    .line 148
    .line 149
    const/high16 v26, -0x40000000    # -2.0f

    .line 150
    .line 151
    const v21, -0x410a3d71    # -0.48f

    .line 152
    .line 153
    .line 154
    const v22, -0x40e66666    # -0.6f

    .line 155
    .line 156
    .line 157
    const v23, -0x409eb852    # -0.88f

    .line 158
    .line 159
    .line 160
    const v24, -0x405d70a4    # -1.27f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40800000    # 4.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const/16 v16, 0x3800

    .line 179
    .line 180
    const/16 v17, 0x0

    .line 181
    .line 182
    const/high16 v6, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v8, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    const/high16 v9, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/high16 v12, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    const-string v4, ""

    .line 195
    .line 196
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x416c0000    # 14.75f

    .line 227
    .line 228
    const/high16 v6, 0x41880000    # 17.0f

    .line 229
    .line 230
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, -0x40600000    # -1.25f

    .line 234
    .line 235
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 236
    .line 237
    const v21, -0x40cf5c29    # -0.69f

    .line 238
    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const/high16 v23, -0x40600000    # -1.25f

    .line 243
    .line 244
    const v24, 0x3f0f5c29    # 0.56f

    .line 245
    .line 246
    .line 247
    move-object/from16 v20, v2

    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x3f000000    # 0.5f

    .line 253
    .line 254
    const v26, 0x3f7851ec    # 0.97f

    .line 255
    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const v22, 0x3ecccccd    # 0.4f

    .line 260
    .line 261
    .line 262
    const v23, 0x3e4ccccd    # 0.2f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x3f400000    # 0.75f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41b00000    # 22.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v4, -0x3f5f0a3d    # -5.03f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v26, -0x4087ae14    # -0.97f

    .line 287
    .line 288
    .line 289
    const v21, 0x3e99999a    # 0.3f

    .line 290
    .line 291
    .line 292
    const v22, -0x41947ae1    # -0.23f

    .line 293
    .line 294
    .line 295
    const/high16 v23, 0x3f000000    # 0.5f

    .line 296
    .line 297
    const v24, -0x40ee147b    # -0.57f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v25, 0x41880000    # 17.0f

    .line 304
    .line 305
    const/high16 v26, 0x416c0000    # 14.75f

    .line 306
    .line 307
    const/high16 v21, 0x41920000    # 18.25f

    .line 308
    .line 309
    const v22, 0x4174f5c3    # 15.31f

    .line 310
    .line 311
    .line 312
    const v23, 0x418d851f    # 17.69f

    .line 313
    .line 314
    .line 315
    const/high16 v24, 0x416c0000    # 14.75f

    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    const/high16 v6, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const-string v4, ""

    .line 331
    .line 332
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 340
    .line 341
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x41400000    # 12.0f

    .line 363
    .line 364
    const/high16 v6, 0x41880000    # 17.0f

    .line 365
    .line 366
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, -0x3f800000    # -4.0f

    .line 370
    .line 371
    const/high16 v26, 0x40800000    # 4.0f

    .line 372
    .line 373
    const v21, -0x3ff28f5c    # -2.21f

    .line 374
    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const/high16 v23, -0x3f800000    # -4.0f

    .line 379
    .line 380
    const v24, 0x3fe51eb8    # 1.79f

    .line 381
    .line 382
    .line 383
    move-object/from16 v20, v2

    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x3f95c28f    # 1.17f

    .line 389
    .line 390
    .line 391
    const v26, 0x40351eb8    # 2.83f

    .line 392
    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const v22, 0x3f8ccccd    # 1.1f

    .line 397
    .line 398
    .line 399
    const v23, 0x3ee66666    # 0.45f

    .line 400
    .line 401
    .line 402
    const v24, 0x40066666    # 2.1f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, -0x407851ec    # -1.06f

    .line 409
    .line 410
    .line 411
    const v6, 0x3f87ae14    # 1.06f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v25, -0x40c51eb8    # -0.73f

    .line 418
    .line 419
    .line 420
    const v26, -0x401d70a4    # -1.77f

    .line 421
    .line 422
    .line 423
    const v21, -0x4119999a    # -0.45f

    .line 424
    .line 425
    .line 426
    const v22, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    const v23, -0x40c51eb8    # -0.73f

    .line 430
    .line 431
    .line 432
    const v24, -0x4075c28f    # -1.08f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v25, 0x40200000    # 2.5f

    .line 439
    .line 440
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const v22, -0x404f5c29    # -1.38f

    .line 445
    .line 446
    .line 447
    const v23, 0x3f8f5c29    # 1.12f

    .line 448
    .line 449
    .line 450
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v4, 0x3f8f5c29    # 1.12f

    .line 456
    .line 457
    .line 458
    const/high16 v6, 0x40200000    # 2.5f

    .line 459
    .line 460
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, -0x40c51eb8    # -0.73f

    .line 464
    .line 465
    .line 466
    const v26, 0x3fe147ae    # 1.76f

    .line 467
    .line 468
    .line 469
    const v22, 0x3f30a3d7    # 0.69f

    .line 470
    .line 471
    .line 472
    const v23, -0x4170a3d7    # -0.28f

    .line 473
    .line 474
    .line 475
    const v24, 0x3fa7ae14    # 1.31f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x3f87ae14    # 1.06f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v25, 0x41a80000    # 21.0f

    .line 488
    .line 489
    const/high16 v26, 0x41800000    # 16.0f

    .line 490
    .line 491
    const v21, 0x41a46666    # 20.55f

    .line 492
    .line 493
    .line 494
    const v22, 0x4190cccd    # 18.1f

    .line 495
    .line 496
    .line 497
    const/high16 v23, 0x41a80000    # 21.0f

    .line 498
    .line 499
    const v24, 0x4188cccd    # 17.1f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v25, 0x41880000    # 17.0f

    .line 506
    .line 507
    const/high16 v26, 0x41400000    # 12.0f

    .line 508
    .line 509
    const/high16 v21, 0x41a80000    # 21.0f

    .line 510
    .line 511
    const v22, 0x415ca3d7    # 13.79f

    .line 512
    .line 513
    .line 514
    const v23, 0x4199ae14    # 19.21f

    .line 515
    .line 516
    .line 517
    const/high16 v24, 0x41400000    # 12.0f

    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v7, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 542
    .line 543
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 544
    .line 545
    .line 546
    move-result-wide v6

    .line 547
    const/4 v0, 0x0

    .line 548
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 556
    .line 557
    .line 558
    move-result v11

    .line 559
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41180000    # 9.5f

    .line 565
    .line 566
    const/high16 v2, 0x41880000    # 17.0f

    .line 567
    .line 568
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, -0x3f300000    # -6.5f

    .line 572
    .line 573
    const/high16 v18, 0x40d00000    # 6.5f

    .line 574
    .line 575
    const v13, -0x3f9a3d71    # -3.59f

    .line 576
    .line 577
    .line 578
    const/high16 v15, -0x3f300000    # -6.5f

    .line 579
    .line 580
    const v16, 0x403a3d71    # 2.91f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x3ff33333    # 1.9f

    .line 587
    .line 588
    .line 589
    const v18, 0x40933333    # 4.6f

    .line 590
    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const v14, 0x3fe51eb8    # 1.79f

    .line 594
    .line 595
    .line 596
    const v15, 0x3f3ae148    # 0.73f

    .line 597
    .line 598
    .line 599
    const v16, 0x405ae148    # 3.42f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x407851ec    # -1.06f

    .line 606
    .line 607
    .line 608
    const v2, 0x3f87ae14    # 1.06f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v17, 0x41400000    # 12.0f

    .line 615
    .line 616
    const/high16 v18, 0x41800000    # 16.0f

    .line 617
    .line 618
    const v13, 0x4148f5c3    # 12.56f

    .line 619
    .line 620
    .line 621
    const v14, 0x41950a3d    # 18.63f

    .line 622
    .line 623
    .line 624
    const/high16 v15, 0x41400000    # 12.0f

    .line 625
    .line 626
    const v16, 0x418b0a3d    # 17.38f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v17, 0x40a00000    # 5.0f

    .line 633
    .line 634
    const/high16 v18, -0x3f600000    # -5.0f

    .line 635
    .line 636
    const/4 v13, 0x0

    .line 637
    const v14, -0x3fcf5c29    # -2.76f

    .line 638
    .line 639
    .line 640
    const v15, 0x400f5c29    # 2.24f

    .line 641
    .line 642
    .line 643
    const/high16 v16, -0x3f600000    # -5.0f

    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x400f5c29    # 2.24f

    .line 649
    .line 650
    .line 651
    const/high16 v2, 0x40a00000    # 5.0f

    .line 652
    .line 653
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, -0x40451eb8    # -1.46f

    .line 657
    .line 658
    .line 659
    const v18, 0x406147ae    # 3.52f

    .line 660
    .line 661
    .line 662
    const v14, 0x3faf5c29    # 1.37f

    .line 663
    .line 664
    .line 665
    const v15, -0x40f0a3d7    # -0.56f

    .line 666
    .line 667
    .line 668
    const v16, 0x4027ae14    # 2.62f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, 0x3f88f5c3    # 1.07f

    .line 675
    .line 676
    .line 677
    const v2, 0x3f87ae14    # 1.06f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, 0x3ff1eb85    # 1.89f

    .line 684
    .line 685
    .line 686
    const v18, -0x3f6d70a4    # -4.58f

    .line 687
    .line 688
    .line 689
    const v13, 0x3f95c28f    # 1.17f

    .line 690
    .line 691
    .line 692
    const v14, -0x4068f5c3    # -1.18f

    .line 693
    .line 694
    .line 695
    const v15, 0x3ff1eb85    # 1.89f

    .line 696
    .line 697
    .line 698
    const v16, -0x3fcccccd    # -2.8f

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v17, 0x41880000    # 17.0f

    .line 705
    .line 706
    const/high16 v18, 0x41180000    # 9.5f

    .line 707
    .line 708
    const/high16 v13, 0x41bc0000    # 23.5f

    .line 709
    .line 710
    const v14, 0x41468f5c    # 12.41f

    .line 711
    .line 712
    .line 713
    const v15, 0x41a4b852    # 20.59f

    .line 714
    .line 715
    .line 716
    const/high16 v16, 0x41180000    # 9.5f

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
    const/4 v7, 0x0

    .line 735
    const/high16 v12, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v13, 0x0

    .line 738
    const/4 v14, 0x0

    .line 739
    const/4 v15, 0x0

    .line 740
    const-string v4, ""

    .line 741
    .line 742
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sput-object v0, Landroidx/compose/material/icons/outlined/BroadcastOnPersonalKt;->_broadcastOnPersonal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 751
    .line 752
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    return-object v0
.end method
