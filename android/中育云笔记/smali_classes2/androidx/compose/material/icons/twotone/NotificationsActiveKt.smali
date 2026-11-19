.class public final Landroidx/compose/material/icons/twotone/NotificationsActiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotificationsActive(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NotificationsActive"

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
    const/high16 v4, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40900000    # 4.5f

    .line 80
    .line 81
    const v21, -0x3fe0a3d7    # -2.49f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x400147ae    # 2.02f

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, -0x3f400000    # -6.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, -0x3f700000    # -4.5f

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const v22, -0x3fe147ae    # -2.48f

    .line 116
    .line 117
    .line 118
    const v23, -0x403eb852    # -1.51f

    .line 119
    .line 120
    .line 121
    const/high16 v24, -0x3f700000    # -4.5f

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const/16 v16, 0x3800

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    const v6, 0x3e99999a    # 0.3f

    .line 138
    .line 139
    .line 140
    const v8, 0x3e99999a    # 0.3f

    .line 141
    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/high16 v9, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/high16 v12, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    const/4 v15, 0x0

    .line 151
    const-string v4, ""

    .line 152
    .line 153
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 163
    .line 164
    .line 165
    move-result-wide v6

    .line 166
    const/4 v0, 0x0

    .line 167
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x41b00000    # 22.0f

    .line 184
    .line 185
    const/high16 v2, 0x41400000    # 12.0f

    .line 186
    .line 187
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40000000    # 2.0f

    .line 191
    .line 192
    const/high16 v18, -0x40000000    # -2.0f

    .line 193
    .line 194
    const v13, 0x3f8ccccd    # 1.1f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x40000000    # 2.0f

    .line 198
    .line 199
    const v16, -0x4099999a    # -0.9f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, -0x3f800000    # -4.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v18, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, 0x3f8ccccd    # 1.1f

    .line 214
    .line 215
    .line 216
    const v15, 0x3f666666    # 0.9f

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41900000    # 18.0f

    .line 228
    .line 229
    const/high16 v2, 0x41300000    # 11.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x3f700000    # -4.5f

    .line 235
    .line 236
    const v18, -0x3f35c28f    # -6.32f

    .line 237
    .line 238
    .line 239
    const v14, -0x3fbb851f    # -3.07f

    .line 240
    .line 241
    .line 242
    const v15, -0x402f5c29    # -1.63f

    .line 243
    .line 244
    .line 245
    const v16, -0x3f4b851f    # -5.64f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41580000    # 13.5f

    .line 252
    .line 253
    const/high16 v2, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, -0x40400000    # -1.5f

    .line 259
    .line 260
    const/high16 v18, -0x40400000    # -1.5f

    .line 261
    .line 262
    const v14, -0x40ab851f    # -0.83f

    .line 263
    .line 264
    .line 265
    const v15, -0x40d47ae1    # -0.67f

    .line 266
    .line 267
    .line 268
    const/high16 v16, -0x40400000    # -1.5f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x3f2b851f    # 0.67f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 277
    .line 278
    const/high16 v4, -0x40400000    # -1.5f

    .line 279
    .line 280
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3f2e147b    # 0.68f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x40c00000    # 6.0f

    .line 290
    .line 291
    const/high16 v18, 0x41300000    # 11.0f

    .line 292
    .line 293
    const v13, 0x40f47ae1    # 7.64f

    .line 294
    .line 295
    .line 296
    const v14, 0x40ab851f    # 5.36f

    .line 297
    .line 298
    .line 299
    const/high16 v15, 0x40c00000    # 6.0f

    .line 300
    .line 301
    const v16, 0x40fd70a4    # 7.92f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40a00000    # 5.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40000000    # 2.0f

    .line 313
    .line 314
    const/high16 v2, -0x40000000    # -2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x3f800000    # 1.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x41800000    # 16.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, -0x40800000    # -1.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, -0x40000000    # -2.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, -0x3f600000    # -5.0f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41880000    # 17.0f

    .line 348
    .line 349
    const/high16 v2, 0x41800000    # 16.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x41000000    # 8.0f

    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, -0x3f400000    # -6.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x40800000    # 4.0f

    .line 365
    .line 366
    const/high16 v18, -0x3f700000    # -4.5f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, -0x3fe147ae    # -2.48f

    .line 370
    .line 371
    .line 372
    const v15, 0x3fc147ae    # 1.51f

    .line 373
    .line 374
    .line 375
    const/high16 v16, -0x3f700000    # -4.5f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x400147ae    # 2.02f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x40900000    # 4.5f

    .line 384
    .line 385
    const/high16 v4, 0x40800000    # 4.0f

    .line 386
    .line 387
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40c00000    # 6.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x40f28f5c    # 7.58f

    .line 399
    .line 400
    .line 401
    const v2, 0x40828f5c    # 4.08f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x40c4cccd    # 6.15f

    .line 408
    .line 409
    .line 410
    const v2, 0x4029999a    # 2.65f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x4001eb85    # 2.03f

    .line 417
    .line 418
    .line 419
    const/high16 v18, 0x41280000    # 10.5f

    .line 420
    .line 421
    const/high16 v13, 0x40700000    # 3.75f

    .line 422
    .line 423
    const v14, 0x408f5c29    # 4.48f

    .line 424
    .line 425
    .line 426
    const v15, 0x400ae148    # 2.17f

    .line 427
    .line 428
    .line 429
    const v16, 0x40e9999a    # 7.3f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40000000    # 2.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x40633333    # 3.55f

    .line 441
    .line 442
    .line 443
    const v18, -0x3f328f5c    # -6.42f

    .line 444
    .line 445
    .line 446
    const v13, 0x3e19999a    # 0.15f

    .line 447
    .line 448
    .line 449
    const v14, -0x3fd66666    # -2.65f

    .line 450
    .line 451
    .line 452
    const v15, 0x3fc147ae    # 1.51f

    .line 453
    .line 454
    .line 455
    const v16, -0x3f60f5c3    # -4.97f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x419fc28f    # 19.97f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x41280000    # 10.5f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40000000    # 2.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, -0x3f7c28f6    # -4.12f

    .line 478
    .line 479
    .line 480
    const v18, -0x3f04cccd    # -7.85f

    .line 481
    .line 482
    .line 483
    const v13, -0x41e66666    # -0.15f

    .line 484
    .line 485
    .line 486
    const v14, -0x3fb33333    # -3.2f

    .line 487
    .line 488
    .line 489
    const v15, -0x40228f5c    # -1.73f

    .line 490
    .line 491
    .line 492
    const v16, -0x3f3f5c29    # -6.02f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x404a3d71    # -1.42f

    .line 499
    .line 500
    .line 501
    const v2, 0x3fb70a3d    # 1.43f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x40628f5c    # 3.54f

    .line 508
    .line 509
    .line 510
    const v18, 0x40cd70a4    # 6.42f

    .line 511
    .line 512
    .line 513
    const v13, 0x400147ae    # 2.02f

    .line 514
    .line 515
    .line 516
    const v14, 0x3fb9999a    # 1.45f

    .line 517
    .line 518
    .line 519
    const v15, 0x4058f5c3    # 3.39f

    .line 520
    .line 521
    .line 522
    const v16, 0x407147ae    # 3.77f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/16 v16, 0x3800

    .line 536
    .line 537
    const/16 v17, 0x0

    .line 538
    .line 539
    const/high16 v6, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/high16 v8, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/4 v7, 0x0

    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v14, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    const-string v4, ""

    .line 550
    .line 551
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, Landroidx/compose/material/icons/twotone/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-object v0
.end method
