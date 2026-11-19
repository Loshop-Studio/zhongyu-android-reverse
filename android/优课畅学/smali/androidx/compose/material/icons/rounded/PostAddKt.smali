.class public final Landroidx/compose/material/icons/rounded/PostAddKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _postAdd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPostAdd(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PostAddKt;->_postAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PostAdd"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v4, 0x40a70a3d    # 5.22f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, 0x3f0ccccd    # 0.55f

    .line 105
    .line 106
    .line 107
    const v23, -0x4119999a    # -0.45f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x3f800000    # 1.0f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40c00000    # 6.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v26, -0x40800000    # -1.0f

    .line 121
    .line 122
    const v21, -0x40f33333    # -0.55f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/high16 v23, -0x40800000    # -1.0f

    .line 128
    .line 129
    const v24, -0x4119999a    # -0.45f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41000000    # 8.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const v22, -0x40f33333    # -0.55f

    .line 145
    .line 146
    .line 147
    const v23, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    const/high16 v24, -0x40800000    # -1.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x40a00000    # 5.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v21, 0x3f0ccccd    # 0.55f

    .line 161
    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const/high16 v23, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const v24, -0x4119999a    # -0.45f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, -0x40800000    # -1.0f

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    const v22, -0x40f33333    # -0.55f

    .line 178
    .line 179
    .line 180
    const v23, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v24, -0x40800000    # -1.0f

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, 0x40400000    # 3.0f

    .line 192
    .line 193
    const/high16 v26, 0x40e00000    # 7.0f

    .line 194
    .line 195
    const v21, 0x4079999a    # 3.9f

    .line 196
    .line 197
    .line 198
    const/high16 v22, 0x40a00000    # 5.0f

    .line 199
    .line 200
    const/high16 v23, 0x40400000    # 3.0f

    .line 201
    .line 202
    const v24, 0x40bccccd    # 5.9f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41400000    # 12.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x40000000    # 2.0f

    .line 214
    .line 215
    const/high16 v26, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    const v22, 0x3f8ccccd    # 1.1f

    .line 220
    .line 221
    .line 222
    const v23, 0x3f666666    # 0.9f

    .line 223
    .line 224
    .line 225
    const/high16 v24, 0x40000000    # 2.0f

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v26, -0x40000000    # -2.0f

    .line 234
    .line 235
    const v21, 0x3f8ccccd    # 1.1f

    .line 236
    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/high16 v23, 0x40000000    # 2.0f

    .line 241
    .line 242
    const v24, -0x4099999a    # -0.9f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, -0x3f400000    # -6.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41900000    # 18.0f

    .line 254
    .line 255
    const/high16 v26, 0x41400000    # 12.0f

    .line 256
    .line 257
    const/high16 v21, 0x41980000    # 19.0f

    .line 258
    .line 259
    const v22, 0x41473333    # 12.45f

    .line 260
    .line 261
    .line 262
    const v23, 0x41946666    # 18.55f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x41400000    # 12.0f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v16, 0x3800

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const/high16 v6, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/high16 v8, 0x3f800000    # 1.0f

    .line 284
    .line 285
    const/4 v7, 0x0

    .line 286
    const/high16 v9, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v12, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const/4 v14, 0x0

    .line 292
    const/4 v15, 0x0

    .line 293
    const-string v4, ""

    .line 294
    .line 295
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 303
    .line 304
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 305
    .line 306
    .line 307
    move-result-wide v6

    .line 308
    const/4 v2, 0x0

    .line 309
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const v4, 0x41a828f6    # 21.02f

    .line 326
    .line 327
    .line 328
    const/high16 v6, 0x40a00000    # 5.0f

    .line 329
    .line 330
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x41980000    # 19.0f

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x403eb852    # 2.98f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, 0x419028f6    # 18.02f

    .line 345
    .line 346
    .line 347
    const/high16 v26, 0x40000000    # 2.0f

    .line 348
    .line 349
    const v22, 0x401c28f6    # 2.44f

    .line 350
    .line 351
    .line 352
    const v23, 0x41947ae1    # 18.56f

    .line 353
    .line 354
    .line 355
    const/high16 v24, 0x40000000    # 2.0f

    .line 356
    .line 357
    move-object/from16 v20, v2

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, -0x430a3d71    # -0.03f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v25, 0x41880000    # 17.0f

    .line 369
    .line 370
    const v26, 0x403eb852    # 2.98f

    .line 371
    .line 372
    .line 373
    const v21, 0x418b851f    # 17.44f

    .line 374
    .line 375
    .line 376
    const/high16 v22, 0x40000000    # 2.0f

    .line 377
    .line 378
    const/high16 v23, 0x41880000    # 17.0f

    .line 379
    .line 380
    const v24, 0x401c28f6    # 2.44f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x40a00000    # 5.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v4, -0x3fff5c29    # -2.01f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v25, 0x41600000    # 14.0f

    .line 398
    .line 399
    const v26, 0x40bf5c29    # 5.98f

    .line 400
    .line 401
    .line 402
    const v21, 0x41673333    # 14.45f

    .line 403
    .line 404
    .line 405
    const/high16 v22, 0x40a00000    # 5.0f

    .line 406
    .line 407
    const v23, 0x416028f6    # 14.01f

    .line 408
    .line 409
    .line 410
    const v24, 0x40ae147b    # 5.44f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/16 v25, 0x0

    .line 417
    .line 418
    const v26, 0x3cf5c28f    # 0.03f

    .line 419
    .line 420
    .line 421
    const/16 v21, 0x0

    .line 422
    .line 423
    const v22, 0x3c23d70a    # 0.01f

    .line 424
    .line 425
    .line 426
    const/16 v23, 0x0

    .line 427
    .line 428
    const v24, 0x3ca3d70a    # 0.02f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v25, 0x416fd70a    # 14.99f

    .line 435
    .line 436
    .line 437
    const/high16 v26, 0x40e00000    # 7.0f

    .line 438
    .line 439
    const/high16 v21, 0x41600000    # 14.0f

    .line 440
    .line 441
    const v22, 0x40d1eb85    # 6.56f

    .line 442
    .line 443
    .line 444
    const v23, 0x41670a3d    # 14.44f

    .line 445
    .line 446
    .line 447
    const/high16 v24, 0x40e00000    # 7.0f

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v4, 0x41880000    # 17.0f

    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, 0x4000a3d7    # 2.01f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x3f7d70a4    # 0.99f

    .line 464
    .line 465
    .line 466
    const v26, 0x3f7ae148    # 0.98f

    .line 467
    .line 468
    .line 469
    const/16 v21, 0x0

    .line 470
    .line 471
    const v22, 0x3f0a3d71    # 0.54f

    .line 472
    .line 473
    .line 474
    const v23, 0x3ee147ae    # 0.44f

    .line 475
    .line 476
    .line 477
    const v24, 0x3f7d70a4    # 0.99f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v25, 0x3cf5c28f    # 0.03f

    .line 484
    .line 485
    .line 486
    const/16 v26, 0x0

    .line 487
    .line 488
    const v21, 0x3c23d70a    # 0.01f

    .line 489
    .line 490
    .line 491
    const/16 v22, 0x0

    .line 492
    .line 493
    const v23, 0x3ca3d70a    # 0.02f

    .line 494
    .line 495
    .line 496
    const/16 v24, 0x0

    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v25, 0x3f7ae148    # 0.98f

    .line 502
    .line 503
    .line 504
    const v26, -0x40851eb8    # -0.98f

    .line 505
    .line 506
    .line 507
    const v21, 0x3f0a3d71    # 0.54f

    .line 508
    .line 509
    .line 510
    const v23, 0x3f7ae148    # 0.98f

    .line 511
    .line 512
    .line 513
    const v24, -0x411eb852    # -0.44f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x40e00000    # 7.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v4, 0x400147ae    # 2.02f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v25, 0x41b00000    # 22.0f

    .line 531
    .line 532
    const v26, 0x40c0a3d7    # 6.02f

    .line 533
    .line 534
    .line 535
    const v21, 0x41ac7ae1    # 21.56f

    .line 536
    .line 537
    .line 538
    const/high16 v22, 0x40e00000    # 7.0f

    .line 539
    .line 540
    const/high16 v23, 0x41b00000    # 22.0f

    .line 541
    .line 542
    const v24, 0x40d1eb85    # 6.56f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v4, 0x40bf5c29    # 5.98f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v25, 0x41a828f6    # 21.02f

    .line 555
    .line 556
    .line 557
    const/high16 v26, 0x40a00000    # 5.0f

    .line 558
    .line 559
    const/high16 v21, 0x41b00000    # 22.0f

    .line 560
    .line 561
    const v22, 0x40ae147b    # 5.44f

    .line 562
    .line 563
    .line 564
    const v23, 0x41ac7ae1    # 21.56f

    .line 565
    .line 566
    .line 567
    const/high16 v24, 0x40a00000    # 5.0f

    .line 568
    .line 569
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/high16 v6, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    const-string v4, ""

    .line 583
    .line 584
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 585
    .line 586
    .line 587
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 592
    .line 593
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 594
    .line 595
    .line 596
    move-result-wide v6

    .line 597
    const/4 v2, 0x0

    .line 598
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 602
    .line 603
    .line 604
    move-result v10

    .line 605
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 612
    .line 613
    .line 614
    const/high16 v4, 0x41100000    # 9.0f

    .line 615
    .line 616
    const/high16 v6, 0x41600000    # 14.0f

    .line 617
    .line 618
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v4, 0x41000000    # 8.0f

    .line 622
    .line 623
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v25, -0x40800000    # -1.0f

    .line 627
    .line 628
    const/high16 v26, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const v21, -0x40f33333    # -0.55f

    .line 631
    .line 632
    .line 633
    const/16 v22, 0x0

    .line 634
    .line 635
    const/high16 v23, -0x40800000    # -1.0f

    .line 636
    .line 637
    const v24, 0x3ee66666    # 0.45f

    .line 638
    .line 639
    .line 640
    move-object/from16 v20, v2

    .line 641
    .line 642
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v25, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/16 v21, 0x0

    .line 648
    .line 649
    const v22, 0x3f0ccccd    # 0.55f

    .line 650
    .line 651
    .line 652
    const v23, 0x3ee66666    # 0.45f

    .line 653
    .line 654
    .line 655
    const/high16 v24, 0x3f800000    # 1.0f

    .line 656
    .line 657
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, 0x40c00000    # 6.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v26, -0x40800000    # -1.0f

    .line 666
    .line 667
    const v21, 0x3f0ccccd    # 0.55f

    .line 668
    .line 669
    .line 670
    const/16 v22, 0x0

    .line 671
    .line 672
    const/high16 v23, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const v24, -0x4119999a    # -0.45f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v25, 0x41600000    # 14.0f

    .line 681
    .line 682
    const/high16 v26, 0x41100000    # 9.0f

    .line 683
    .line 684
    const/high16 v21, 0x41700000    # 15.0f

    .line 685
    .line 686
    const v22, 0x41173333    # 9.45f

    .line 687
    .line 688
    .line 689
    const v23, 0x4168cccd    # 14.55f

    .line 690
    .line 691
    .line 692
    const/high16 v24, 0x41100000    # 9.0f

    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/4 v7, 0x0

    .line 707
    const-string v4, ""

    .line 708
    .line 709
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 710
    .line 711
    .line 712
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 717
    .line 718
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 719
    .line 720
    .line 721
    move-result-wide v6

    .line 722
    const/4 v2, 0x0

    .line 723
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 727
    .line 728
    .line 729
    move-result v10

    .line 730
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 731
    .line 732
    .line 733
    move-result v11

    .line 734
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 737
    .line 738
    .line 739
    const/high16 v4, 0x41600000    # 14.0f

    .line 740
    .line 741
    const/high16 v6, 0x41400000    # 12.0f

    .line 742
    .line 743
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v4, 0x41000000    # 8.0f

    .line 747
    .line 748
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v25, -0x40800000    # -1.0f

    .line 752
    .line 753
    const/high16 v26, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const v21, -0x40f33333    # -0.55f

    .line 756
    .line 757
    .line 758
    const/16 v22, 0x0

    .line 759
    .line 760
    const/high16 v23, -0x40800000    # -1.0f

    .line 761
    .line 762
    const v24, 0x3ee66666    # 0.45f

    .line 763
    .line 764
    .line 765
    move-object/from16 v20, v2

    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v25, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/16 v21, 0x0

    .line 773
    .line 774
    const v22, 0x3f0ccccd    # 0.55f

    .line 775
    .line 776
    .line 777
    const v23, 0x3ee66666    # 0.45f

    .line 778
    .line 779
    .line 780
    const/high16 v24, 0x3f800000    # 1.0f

    .line 781
    .line 782
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v4, 0x40c00000    # 6.0f

    .line 786
    .line 787
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v26, -0x40800000    # -1.0f

    .line 791
    .line 792
    const v21, 0x3f0ccccd    # 0.55f

    .line 793
    .line 794
    .line 795
    const/16 v22, 0x0

    .line 796
    .line 797
    const/high16 v23, 0x3f800000    # 1.0f

    .line 798
    .line 799
    const v24, -0x4119999a    # -0.45f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v25, 0x41600000    # 14.0f

    .line 806
    .line 807
    const/high16 v26, 0x41400000    # 12.0f

    .line 808
    .line 809
    const/high16 v21, 0x41700000    # 15.0f

    .line 810
    .line 811
    const v22, 0x41473333    # 12.45f

    .line 812
    .line 813
    .line 814
    const v23, 0x4168cccd    # 14.55f

    .line 815
    .line 816
    .line 817
    const/high16 v24, 0x41400000    # 12.0f

    .line 818
    .line 819
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    const/high16 v6, 0x3f800000    # 1.0f

    .line 830
    .line 831
    const/4 v7, 0x0

    .line 832
    const-string v4, ""

    .line 833
    .line 834
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 835
    .line 836
    .line 837
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 838
    .line 839
    .line 840
    move-result v3

    .line 841
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 842
    .line 843
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 844
    .line 845
    .line 846
    move-result-wide v6

    .line 847
    const/4 v0, 0x0

    .line 848
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 852
    .line 853
    .line 854
    move-result v10

    .line 855
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 856
    .line 857
    .line 858
    move-result v11

    .line 859
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 862
    .line 863
    .line 864
    const/high16 v0, 0x41700000    # 15.0f

    .line 865
    .line 866
    const/high16 v2, 0x41600000    # 14.0f

    .line 867
    .line 868
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v0, 0x41000000    # 8.0f

    .line 872
    .line 873
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v17, -0x40800000    # -1.0f

    .line 877
    .line 878
    const/high16 v18, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const v13, -0x40f33333    # -0.55f

    .line 881
    .line 882
    .line 883
    const/high16 v15, -0x40800000    # -1.0f

    .line 884
    .line 885
    const v16, 0x3ee66666    # 0.45f

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const/high16 v17, 0x3f800000    # 1.0f

    .line 892
    .line 893
    const/4 v13, 0x0

    .line 894
    const v14, 0x3f0ccccd    # 0.55f

    .line 895
    .line 896
    .line 897
    const v15, 0x3ee66666    # 0.45f

    .line 898
    .line 899
    .line 900
    const/high16 v16, 0x3f800000    # 1.0f

    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v0, 0x40c00000    # 6.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/high16 v18, -0x40800000    # -1.0f

    .line 911
    .line 912
    const v13, 0x3f0ccccd    # 0.55f

    .line 913
    .line 914
    .line 915
    const/4 v14, 0x0

    .line 916
    const/high16 v15, 0x3f800000    # 1.0f

    .line 917
    .line 918
    const v16, -0x4119999a    # -0.45f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v17, 0x41600000    # 14.0f

    .line 925
    .line 926
    const/high16 v18, 0x41700000    # 15.0f

    .line 927
    .line 928
    const/high16 v13, 0x41700000    # 15.0f

    .line 929
    .line 930
    const v14, 0x41773333    # 15.45f

    .line 931
    .line 932
    .line 933
    const v15, 0x4168cccd    # 14.55f

    .line 934
    .line 935
    .line 936
    const/high16 v16, 0x41700000    # 15.0f

    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object v2

    .line 948
    const/16 v16, 0x3800

    .line 949
    .line 950
    const/16 v17, 0x0

    .line 951
    .line 952
    const/high16 v6, 0x3f800000    # 1.0f

    .line 953
    .line 954
    const/4 v7, 0x0

    .line 955
    const/high16 v12, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const/4 v13, 0x0

    .line 958
    const/4 v14, 0x0

    .line 959
    const/4 v15, 0x0

    .line 960
    const-string v4, ""

    .line 961
    .line 962
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    sput-object v0, Landroidx/compose/material/icons/rounded/PostAddKt;->_postAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 971
    .line 972
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    return-object v0
.end method
