.class public final Landroidx/compose/material/icons/rounded/_16mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __16mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_16mp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_16mpKt;->__16mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._16mp"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41580000    # 13.5f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40400000    # -1.5f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v16, 0x3800

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/high16 v6, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v8, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    const/high16 v9, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/high16 v12, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x41700000    # 15.0f

    .line 146
    .line 147
    const/high16 v6, 0x41600000    # 14.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, -0x40400000    # -1.5f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const-string v4, ""

    .line 176
    .line 177
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    const/4 v0, 0x0

    .line 191
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41980000    # 19.0f

    .line 208
    .line 209
    const/high16 v2, 0x40400000    # 3.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x40a00000    # 5.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40400000    # 3.0f

    .line 220
    .line 221
    const/high16 v18, 0x40a00000    # 5.0f

    .line 222
    .line 223
    const v13, 0x4079999a    # 3.9f

    .line 224
    .line 225
    .line 226
    const/high16 v14, 0x40400000    # 3.0f

    .line 227
    .line 228
    const/high16 v15, 0x40400000    # 3.0f

    .line 229
    .line 230
    const v16, 0x4079999a    # 3.9f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41600000    # 14.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/high16 v18, 0x40000000    # 2.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, 0x3f8ccccd    # 1.1f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f666666    # 0.9f

    .line 250
    .line 251
    .line 252
    const/high16 v16, 0x40000000    # 2.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v18, -0x40000000    # -2.0f

    .line 261
    .line 262
    const v13, 0x3f8ccccd    # 1.1f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, 0x40000000    # 2.0f

    .line 267
    .line 268
    const v16, -0x4099999a    # -0.9f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x40a00000    # 5.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41980000    # 19.0f

    .line 280
    .line 281
    const/high16 v18, 0x40400000    # 3.0f

    .line 282
    .line 283
    const/high16 v13, 0x41a80000    # 21.0f

    .line 284
    .line 285
    const v14, 0x4079999a    # 3.9f

    .line 286
    .line 287
    .line 288
    const v15, 0x41a0cccd    # 20.1f

    .line 289
    .line 290
    .line 291
    const/high16 v16, 0x40400000    # 3.0f

    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40b00000    # 5.5f

    .line 300
    .line 301
    const/high16 v2, 0x40f80000    # 7.75f

    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41100000    # 9.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v18, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const v13, 0x3f0ccccd    # 0.55f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const/high16 v15, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const v16, 0x3ee66666    # 0.45f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x40880000    # 4.25f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x40c00000    # -0.75f

    .line 333
    .line 334
    const/high16 v18, 0x3f400000    # 0.75f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, 0x3ed1eb85    # 0.41f

    .line 338
    .line 339
    .line 340
    const v15, -0x4151eb85    # -0.34f

    .line 341
    .line 342
    .line 343
    const/high16 v16, 0x3f400000    # 0.75f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x41328f5c    # 11.16f

    .line 349
    .line 350
    .line 351
    const/high16 v2, 0x412c0000    # 10.75f

    .line 352
    .line 353
    const/high16 v4, 0x41080000    # 8.5f

    .line 354
    .line 355
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40e00000    # 7.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x40f80000    # 7.75f

    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x40e00000    # 7.0f

    .line 369
    .line 370
    const/high16 v18, 0x40c80000    # 6.25f

    .line 371
    .line 372
    const v13, 0x40eae148    # 7.34f

    .line 373
    .line 374
    .line 375
    const/high16 v14, 0x40e00000    # 7.0f

    .line 376
    .line 377
    const/high16 v15, 0x40e00000    # 7.0f

    .line 378
    .line 379
    const v16, 0x40d51eb8    # 6.66f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x40eae148    # 7.34f

    .line 386
    .line 387
    .line 388
    const/high16 v2, 0x40b00000    # 5.5f

    .line 389
    .line 390
    const/high16 v4, 0x40f80000    # 7.75f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41480000    # 12.5f

    .line 399
    .line 400
    const/high16 v2, 0x418e0000    # 17.75f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40c00000    # -0.75f

    .line 406
    .line 407
    const/high16 v18, 0x3f400000    # 0.75f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, 0x3ed1eb85    # 0.41f

    .line 411
    .line 412
    .line 413
    const v15, -0x4151eb85    # -0.34f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x3f400000    # 0.75f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x419147ae    # 18.16f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x41300000    # 11.0f

    .line 425
    .line 426
    const/high16 v4, 0x418e0000    # 17.75f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41600000    # 14.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, -0x40800000    # -1.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x40100000    # 2.25f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, 0x41140000    # 9.25f

    .line 447
    .line 448
    const/high16 v18, 0x41880000    # 17.0f

    .line 449
    .line 450
    const/high16 v13, 0x41200000    # 10.0f

    .line 451
    .line 452
    const v14, 0x418547ae    # 16.66f

    .line 453
    .line 454
    .line 455
    const v15, 0x411a8f5c    # 9.66f

    .line 456
    .line 457
    .line 458
    const/high16 v16, 0x41880000    # 17.0f

    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x418547ae    # 16.66f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x41820000    # 16.25f

    .line 467
    .line 468
    const/high16 v4, 0x41080000    # 8.5f

    .line 469
    .line 470
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41600000    # 14.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, -0x40800000    # -1.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40700000    # 3.75f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, -0x40c00000    # -0.75f

    .line 489
    .line 490
    const/high16 v18, 0x3f400000    # 0.75f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, 0x3ed1eb85    # 0.41f

    .line 494
    .line 495
    .line 496
    const v15, -0x4151eb85    # -0.34f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x3f400000    # 0.75f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x40c00000    # 6.0f

    .line 505
    .line 506
    const v2, 0x419147ae    # 18.16f

    .line 507
    .line 508
    .line 509
    const/high16 v4, 0x418e0000    # 17.75f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41580000    # 13.5f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v18, -0x40800000    # -1.0f

    .line 522
    .line 523
    const v14, -0x40f33333    # -0.55f

    .line 524
    .line 525
    .line 526
    const v15, 0x3ee66666    # 0.45f

    .line 527
    .line 528
    .line 529
    const/high16 v16, -0x40800000    # -1.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40900000    # 4.5f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v18, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const v13, 0x3f0ccccd    # 0.55f

    .line 542
    .line 543
    .line 544
    const/4 v14, 0x0

    .line 545
    const/high16 v15, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const v16, 0x3ee66666    # 0.45f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v0, 0x418e0000    # 17.75f

    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41400000    # 12.0f

    .line 562
    .line 563
    const/high16 v2, 0x41280000    # 10.5f

    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, -0x3f800000    # -4.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v18, -0x40800000    # -1.0f

    .line 574
    .line 575
    const/4 v13, 0x0

    .line 576
    const v14, -0x40f33333    # -0.55f

    .line 577
    .line 578
    .line 579
    const v15, 0x3ee66666    # 0.45f

    .line 580
    .line 581
    .line 582
    const/high16 v16, -0x40800000    # -1.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x40300000    # 2.75f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v17, 0x3f400000    # 0.75f

    .line 593
    .line 594
    const/high16 v18, 0x3f400000    # 0.75f

    .line 595
    .line 596
    const v13, 0x3ed1eb85    # 0.41f

    .line 597
    .line 598
    .line 599
    const/4 v14, 0x0

    .line 600
    const/high16 v15, 0x3f400000    # 0.75f

    .line 601
    .line 602
    const v16, 0x3eae147b    # 0.34f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x418147ae    # 16.16f

    .line 609
    .line 610
    .line 611
    const/high16 v2, 0x417c0000    # 15.75f

    .line 612
    .line 613
    const/high16 v4, 0x40e00000    # 7.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41580000    # 13.5f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x3f800000    # 1.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40000000    # 2.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/high16 v18, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const v13, 0x3f0ccccd    # 0.55f

    .line 638
    .line 639
    .line 640
    const/high16 v15, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const v16, 0x3ee66666    # 0.45f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v17, -0x40800000    # -1.0f

    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    const v14, 0x3f0ccccd    # 0.55f

    .line 657
    .line 658
    .line 659
    const v15, -0x4119999a    # -0.45f

    .line 660
    .line 661
    .line 662
    const/high16 v16, 0x3f800000    # 1.0f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x41500000    # 13.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, 0x41400000    # 12.0f

    .line 673
    .line 674
    const/high16 v18, 0x41280000    # 10.5f

    .line 675
    .line 676
    const v13, 0x41473333    # 12.45f

    .line 677
    .line 678
    .line 679
    const/high16 v14, 0x41380000    # 11.5f

    .line 680
    .line 681
    const/high16 v15, 0x41400000    # 12.0f

    .line 682
    .line 683
    const v16, 0x4130cccd    # 11.05f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, 0x41900000    # 18.0f

    .line 693
    .line 694
    const/high16 v2, 0x41800000    # 16.0f

    .line 695
    .line 696
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v17, -0x40800000    # -1.0f

    .line 700
    .line 701
    const/high16 v18, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const v14, 0x3f0ccccd    # 0.55f

    .line 705
    .line 706
    .line 707
    const v15, -0x4119999a    # -0.45f

    .line 708
    .line 709
    .line 710
    const/high16 v16, 0x3f800000    # 1.0f

    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, -0x40000000    # -2.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v0, 0x3f400000    # 0.75f

    .line 721
    .line 722
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v17, -0x40c00000    # -0.75f

    .line 726
    .line 727
    const/high16 v18, 0x3f400000    # 0.75f

    .line 728
    .line 729
    const v14, 0x3ed1eb85    # 0.41f

    .line 730
    .line 731
    .line 732
    const v15, -0x4151eb85    # -0.34f

    .line 733
    .line 734
    .line 735
    const/high16 v16, 0x3f400000    # 0.75f

    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, -0x4151eb85    # -0.34f

    .line 741
    .line 742
    .line 743
    const/high16 v2, -0x40c00000    # -0.75f

    .line 744
    .line 745
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x41580000    # 13.5f

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v17, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/high16 v18, -0x40800000    # -1.0f

    .line 756
    .line 757
    const v14, -0x40f33333    # -0.55f

    .line 758
    .line 759
    .line 760
    const v15, 0x3ee66666    # 0.45f

    .line 761
    .line 762
    .line 763
    const/high16 v16, -0x40800000    # -1.0f

    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v0, 0x41880000    # 17.0f

    .line 769
    .line 770
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const/high16 v18, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const v13, 0x3f0ccccd    # 0.55f

    .line 776
    .line 777
    .line 778
    const/4 v14, 0x0

    .line 779
    const/high16 v15, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const v16, 0x3ee66666    # 0.45f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v0, 0x41800000    # 16.0f

    .line 788
    .line 789
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    const/16 v16, 0x3800

    .line 800
    .line 801
    const/16 v17, 0x0

    .line 802
    .line 803
    const/high16 v6, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v7, 0x0

    .line 806
    const/high16 v12, 0x3f800000    # 1.0f

    .line 807
    .line 808
    const/4 v13, 0x0

    .line 809
    const/4 v15, 0x0

    .line 810
    const-string v4, ""

    .line 811
    .line 812
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    sput-object v0, Landroidx/compose/material/icons/rounded/_16mpKt;->__16mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 821
    .line 822
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    return-object v0
.end method
