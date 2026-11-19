.class public final Landroidx/compose/material/icons/twotone/OutboundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _outbound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOutbound(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/OutboundKt;->_outbound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Outbound"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

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
    const/high16 v25, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x408d1eb8    # 4.41f

    .line 101
    .line 102
    .line 103
    const v23, 0x4065c28f    # 3.59f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x3f9a3d71    # -3.59f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x3f000000    # -8.0f

    .line 115
    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41400000    # 12.0f

    .line 122
    .line 123
    const/high16 v26, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v21, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const v22, 0x40f2e148    # 7.59f

    .line 128
    .line 129
    .line 130
    const v23, 0x418347ae    # 16.41f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x4138a3d7    # 11.54f

    .line 142
    .line 143
    .line 144
    const v6, 0x415e147b    # 13.88f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x409eb852    # 4.96f

    .line 151
    .line 152
    .line 153
    const v6, -0x3f6147ae    # -4.96f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x404b851f    # -1.41f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, 0x409eb852    # 4.96f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x412570a4    # 10.34f

    .line 172
    .line 173
    .line 174
    const/high16 v6, 0x41000000    # 8.0f

    .line 175
    .line 176
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v4, 0x3c23d70a    # 0.01f

    .line 180
    .line 181
    .line 182
    const v6, 0x40b4cccd    # 5.65f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x415a8f5c    # 13.66f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x41800000    # 16.0f

    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x4138a3d7    # 11.54f

    .line 197
    .line 198
    .line 199
    const v6, 0x415e147b    # 13.88f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const v6, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const v8, 0x3e99999a    # 0.3f

    .line 220
    .line 221
    .line 222
    const/4 v7, 0x0

    .line 223
    const/high16 v9, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v12, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const-string v4, ""

    .line 231
    .line 232
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 233
    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 240
    .line 241
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 242
    .line 243
    .line 244
    move-result-wide v6

    .line 245
    const/4 v0, 0x0

    .line 246
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x40800000    # 4.0f

    .line 263
    .line 264
    const/high16 v2, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x41000000    # 8.0f

    .line 270
    .line 271
    const/high16 v18, 0x41000000    # 8.0f

    .line 272
    .line 273
    const v13, 0x408d1eb8    # 4.41f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x41000000    # 8.0f

    .line 277
    .line 278
    const v16, 0x4065c28f    # 3.59f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x3f9a3d71    # -3.59f

    .line 285
    .line 286
    .line 287
    const/high16 v2, -0x3f000000    # -8.0f

    .line 288
    .line 289
    const/high16 v4, 0x41000000    # 8.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x40f2e148    # 7.59f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x40800000    # 4.0f

    .line 301
    .line 302
    const/high16 v4, 0x41400000    # 12.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40000000    # 2.0f

    .line 308
    .line 309
    const/high16 v2, 0x41400000    # 12.0f

    .line 310
    .line 311
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x40000000    # 2.0f

    .line 315
    .line 316
    const/high16 v18, 0x41400000    # 12.0f

    .line 317
    .line 318
    const v13, 0x40cf5c29    # 6.48f

    .line 319
    .line 320
    .line 321
    const/high16 v14, 0x40000000    # 2.0f

    .line 322
    .line 323
    const/high16 v15, 0x40000000    # 2.0f

    .line 324
    .line 325
    const v16, 0x40cf5c29    # 6.48f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x41200000    # 10.0f

    .line 332
    .line 333
    const/high16 v18, 0x41200000    # 10.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, 0x40b0a3d7    # 5.52f

    .line 337
    .line 338
    .line 339
    const v15, 0x408f5c29    # 4.48f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x41200000    # 10.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x3f70a3d7    # -4.48f

    .line 348
    .line 349
    .line 350
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 351
    .line 352
    const/high16 v4, 0x41200000    # 10.0f

    .line 353
    .line 354
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41400000    # 12.0f

    .line 358
    .line 359
    const/high16 v18, 0x40000000    # 2.0f

    .line 360
    .line 361
    const/high16 v13, 0x41b00000    # 22.0f

    .line 362
    .line 363
    const v14, 0x40cf5c29    # 6.48f

    .line 364
    .line 365
    .line 366
    const v15, 0x418c28f6    # 17.52f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40000000    # 2.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40000000    # 2.0f

    .line 375
    .line 376
    const/high16 v2, 0x41400000    # 12.0f

    .line 377
    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x4138a3d7    # 11.54f

    .line 385
    .line 386
    .line 387
    const v2, 0x415e147b    # 13.88f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x409eb852    # 4.96f

    .line 394
    .line 395
    .line 396
    const v2, -0x3f6147ae    # -4.96f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, -0x404b851f    # -1.41f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x409eb852    # 4.96f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x412570a4    # 10.34f

    .line 415
    .line 416
    .line 417
    const/high16 v2, 0x41000000    # 8.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3c23d70a    # 0.01f

    .line 423
    .line 424
    .line 425
    const v2, 0x40b4cccd    # 5.65f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x415a8f5c    # 13.66f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x41800000    # 16.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x4138a3d7    # 11.54f

    .line 440
    .line 441
    .line 442
    const v2, 0x415e147b    # 13.88f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/16 v16, 0x3800

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v8, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const/high16 v12, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const/4 v14, 0x0

    .line 468
    const/4 v15, 0x0

    .line 469
    const-string v4, ""

    .line 470
    .line 471
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sput-object v0, Landroidx/compose/material/icons/twotone/OutboundKt;->_outbound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 480
    .line 481
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    return-object v0
.end method

.method public static synthetic getOutbound$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
