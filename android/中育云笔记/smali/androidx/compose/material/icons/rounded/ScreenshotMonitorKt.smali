.class public final Landroidx/compose/material/icons/rounded/ScreenshotMonitorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _screenshotMonitor:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenshotMonitor(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScreenshotMonitorKt;->_screenshotMonitor:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScreenshotMonitor"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v26, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, 0x3f63d70a    # 0.89f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x3f800000    # 1.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/high16 v26, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v22, 0x3f0ccccd    # 0.55f

    .line 136
    .line 137
    .line 138
    const v23, 0x3ee66666    # 0.45f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40c00000    # 6.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v26, -0x40800000    # -1.0f

    .line 152
    .line 153
    const v21, 0x3f0ccccd    # 0.55f

    .line 154
    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const/high16 v23, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const v24, -0x4119999a    # -0.45f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, -0x40800000    # -1.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x40800000    # 4.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v25, 0x40000000    # 2.0f

    .line 177
    .line 178
    const/high16 v26, -0x40000000    # -2.0f

    .line 179
    .line 180
    const v21, 0x3f8ccccd    # 1.1f

    .line 181
    .line 182
    .line 183
    const/high16 v23, 0x40000000    # 2.0f

    .line 184
    .line 185
    const v24, -0x4099999a    # -0.9f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x40a00000    # 5.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const/high16 v26, 0x40400000    # 3.0f

    .line 199
    .line 200
    const/high16 v21, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const v22, 0x4078f5c3    # 3.89f

    .line 203
    .line 204
    .line 205
    const v23, 0x41a8cccd    # 21.1f

    .line 206
    .line 207
    .line 208
    const/high16 v24, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41880000    # 17.0f

    .line 217
    .line 218
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40800000    # 4.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x40a00000    # 5.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x41800000    # 16.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41880000    # 17.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const/16 v16, 0x3800

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v8, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    const/high16 v9, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v12, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x40d00000    # 6.5f

    .line 297
    .line 298
    const/high16 v6, 0x40f00000    # 7.5f

    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x41100000    # 9.0f

    .line 309
    .line 310
    const/high16 v26, 0x40d80000    # 6.75f

    .line 311
    .line 312
    const v21, 0x410a8f5c    # 8.66f

    .line 313
    .line 314
    .line 315
    const/high16 v22, 0x40f00000    # 7.5f

    .line 316
    .line 317
    const/high16 v23, 0x41100000    # 9.0f

    .line 318
    .line 319
    const v24, 0x40e51eb8    # 7.16f

    .line 320
    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/4 v4, 0x0

    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v25, 0x41040000    # 8.25f

    .line 332
    .line 333
    const/high16 v26, 0x40c00000    # 6.0f

    .line 334
    .line 335
    const/high16 v21, 0x41100000    # 9.0f

    .line 336
    .line 337
    const v22, 0x40cae148    # 6.34f

    .line 338
    .line 339
    .line 340
    const v23, 0x410a8f5c    # 8.66f

    .line 341
    .line 342
    .line 343
    const/high16 v24, 0x40c00000    # 6.0f

    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x40c00000    # 6.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v25, 0x40a00000    # 5.0f

    .line 354
    .line 355
    const/high16 v26, 0x40e00000    # 7.0f

    .line 356
    .line 357
    const v21, 0x40ae6666    # 5.45f

    .line 358
    .line 359
    .line 360
    const/high16 v22, 0x40c00000    # 6.0f

    .line 361
    .line 362
    const/high16 v23, 0x40a00000    # 5.0f

    .line 363
    .line 364
    const v24, 0x40ce6666    # 6.45f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x40100000    # 2.25f

    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v25, 0x40b80000    # 5.75f

    .line 376
    .line 377
    const/high16 v26, 0x41200000    # 10.0f

    .line 378
    .line 379
    const/high16 v21, 0x40a00000    # 5.0f

    .line 380
    .line 381
    const v22, 0x411a8f5c    # 9.66f

    .line 382
    .line 383
    .line 384
    const v23, 0x40aae148    # 5.34f

    .line 385
    .line 386
    .line 387
    const/high16 v24, 0x41200000    # 10.0f

    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/4 v4, 0x0

    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v25, 0x40d00000    # 6.5f

    .line 397
    .line 398
    const/high16 v26, 0x41140000    # 9.25f

    .line 399
    .line 400
    const v21, 0x40c51eb8    # 6.16f

    .line 401
    .line 402
    .line 403
    const/high16 v22, 0x41200000    # 10.0f

    .line 404
    .line 405
    const/high16 v23, 0x40d00000    # 6.5f

    .line 406
    .line 407
    const v24, 0x411a8f5c    # 9.66f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x40f00000    # 7.5f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    const/high16 v6, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/4 v7, 0x0

    .line 428
    const-string v4, ""

    .line 429
    .line 430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 431
    .line 432
    .line 433
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 438
    .line 439
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    const/4 v0, 0x0

    .line 444
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 452
    .line 453
    .line 454
    move-result v11

    .line 455
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41920000    # 18.25f

    .line 461
    .line 462
    const/high16 v2, 0x41400000    # 12.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, -0x40c00000    # -0.75f

    .line 471
    .line 472
    const/high16 v18, 0x3f400000    # 0.75f

    .line 473
    .line 474
    const v13, -0x412e147b    # -0.41f

    .line 475
    .line 476
    .line 477
    const/high16 v15, -0x40c00000    # -0.75f

    .line 478
    .line 479
    const v16, 0x3eae147b    # 0.34f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, -0x40200000    # -1.75f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/4 v0, 0x0

    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x3f400000    # 0.75f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, 0x3ed1eb85    # 0.41f

    .line 506
    .line 507
    .line 508
    const v15, 0x3eae147b    # 0.34f

    .line 509
    .line 510
    .line 511
    const/high16 v16, 0x3f400000    # 0.75f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41900000    # 18.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v18, -0x40800000    # -1.0f

    .line 524
    .line 525
    const v13, 0x3f0ccccd    # 0.55f

    .line 526
    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/high16 v15, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const v16, -0x4119999a    # -0.45f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41920000    # 18.25f

    .line 543
    .line 544
    const/high16 v18, 0x41400000    # 12.0f

    .line 545
    .line 546
    const/high16 v13, 0x41980000    # 19.0f

    .line 547
    .line 548
    const v14, 0x414570a4    # 12.34f

    .line 549
    .line 550
    .line 551
    const v15, 0x419547ae    # 18.66f

    .line 552
    .line 553
    .line 554
    const/high16 v16, 0x41400000    # 12.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v16, 0x3800

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const/high16 v12, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v13, 0x0

    .line 576
    const/4 v14, 0x0

    .line 577
    const/4 v15, 0x0

    .line 578
    const-string v4, ""

    .line 579
    .line 580
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    sput-object v0, Landroidx/compose/material/icons/rounded/ScreenshotMonitorKt;->_screenshotMonitor:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    return-object v0
.end method
