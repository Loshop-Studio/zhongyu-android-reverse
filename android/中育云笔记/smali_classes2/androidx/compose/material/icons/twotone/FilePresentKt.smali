.class public final Landroidx/compose/material/icons/twotone/FilePresentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filePresent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilePresent(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FilePresentKt;->_filePresent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FilePresent"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41800000    # 16.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41400000    # 12.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41000000    # 8.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, -0x3f800000    # -4.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x41300000    # 11.0f

    .line 111
    .line 112
    const/high16 v6, 0x41800000    # 16.0f

    .line 113
    .line 114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40800000    # 4.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, -0x3f800000    # -4.0f

    .line 123
    .line 124
    const/high16 v26, 0x40800000    # 4.0f

    .line 125
    .line 126
    const/16 v21, 0x0

    .line 127
    .line 128
    const v22, 0x400d70a4    # 2.21f

    .line 129
    .line 130
    .line 131
    const v23, -0x401ae148    # -1.79f

    .line 132
    .line 133
    .line 134
    const/high16 v24, 0x40800000    # 4.0f

    .line 135
    .line 136
    move-object/from16 v20, v2

    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, -0x401ae148    # -1.79f

    .line 142
    .line 143
    .line 144
    const/high16 v6, -0x3f800000    # -4.0f

    .line 145
    .line 146
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41180000    # 9.5f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41280000    # 10.5f

    .line 155
    .line 156
    const/high16 v26, 0x40e00000    # 7.0f

    .line 157
    .line 158
    const/high16 v21, 0x41000000    # 8.0f

    .line 159
    .line 160
    const v22, 0x4101eb85    # 8.12f

    .line 161
    .line 162
    .line 163
    const v23, 0x4111eb85    # 9.12f

    .line 164
    .line 165
    .line 166
    const/high16 v24, 0x40e00000    # 7.0f

    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x4101eb85    # 8.12f

    .line 172
    .line 173
    .line 174
    const/high16 v6, 0x41500000    # 13.0f

    .line 175
    .line 176
    const/high16 v7, 0x41180000    # 9.5f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41700000    # 15.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, -0x40000000    # -2.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x41180000    # 9.5f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v26, 0x41100000    # 9.0f

    .line 197
    .line 198
    const/high16 v21, 0x41300000    # 11.0f

    .line 199
    .line 200
    const v22, 0x4113851f    # 9.22f

    .line 201
    .line 202
    .line 203
    const v23, 0x412c7ae1    # 10.78f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x41100000    # 9.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x4113851f    # 9.22f

    .line 212
    .line 213
    .line 214
    const/high16 v6, 0x41200000    # 10.0f

    .line 215
    .line 216
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x41700000    # 15.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, 0x40000000    # 2.0f

    .line 225
    .line 226
    const/high16 v26, 0x40000000    # 2.0f

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x3f8ccccd    # 1.1f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f666666    # 0.9f

    .line 234
    .line 235
    .line 236
    const/high16 v24, 0x40000000    # 2.0f

    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, -0x4099999a    # -0.9f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x40000000    # 2.0f

    .line 245
    .line 246
    const/high16 v7, -0x40000000    # -2.0f

    .line 247
    .line 248
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, -0x3f800000    # -4.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41800000    # 16.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/16 v16, 0x3800

    .line 269
    .line 270
    const/16 v17, 0x0

    .line 271
    .line 272
    const v6, 0x3e99999a    # 0.3f

    .line 273
    .line 274
    .line 275
    const v8, 0x3e99999a    # 0.3f

    .line 276
    .line 277
    .line 278
    const/4 v7, 0x0

    .line 279
    const/high16 v9, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/high16 v12, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    const/4 v15, 0x0

    .line 286
    const-string v4, ""

    .line 287
    .line 288
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 289
    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 296
    .line 297
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 298
    .line 299
    .line 300
    move-result-wide v6

    .line 301
    const/4 v2, 0x0

    .line 302
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x41600000    # 14.0f

    .line 319
    .line 320
    const/high16 v6, 0x41700000    # 15.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v25, -0x40000000    # -2.0f

    .line 326
    .line 327
    const v23, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    move-object/from16 v20, v2

    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, -0x4099999a    # -0.9f

    .line 336
    .line 337
    .line 338
    const/high16 v6, -0x40000000    # -2.0f

    .line 339
    .line 340
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v4, 0x41180000    # 9.5f

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v25, 0x41280000    # 10.5f

    .line 349
    .line 350
    const/high16 v26, 0x41100000    # 9.0f

    .line 351
    .line 352
    const/high16 v21, 0x41200000    # 10.0f

    .line 353
    .line 354
    const v22, 0x4113851f    # 9.22f

    .line 355
    .line 356
    .line 357
    const v23, 0x4123851f    # 10.22f

    .line 358
    .line 359
    .line 360
    const/high16 v24, 0x41100000    # 9.0f

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, 0x4113851f    # 9.22f

    .line 366
    .line 367
    .line 368
    const/high16 v6, 0x41300000    # 11.0f

    .line 369
    .line 370
    const/high16 v7, 0x41180000    # 9.5f

    .line 371
    .line 372
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41700000    # 15.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x40000000    # 2.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x41180000    # 9.5f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v26, 0x40e00000    # 7.0f

    .line 391
    .line 392
    const/high16 v21, 0x41500000    # 13.0f

    .line 393
    .line 394
    const v22, 0x4101eb85    # 8.12f

    .line 395
    .line 396
    .line 397
    const v23, 0x413e147b    # 11.88f

    .line 398
    .line 399
    .line 400
    const/high16 v24, 0x40e00000    # 7.0f

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x4101eb85    # 8.12f

    .line 406
    .line 407
    .line 408
    const/high16 v6, 0x41000000    # 8.0f

    .line 409
    .line 410
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x41700000    # 15.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, 0x40800000    # 4.0f

    .line 419
    .line 420
    const/high16 v26, 0x40800000    # 4.0f

    .line 421
    .line 422
    const/16 v21, 0x0

    .line 423
    .line 424
    const v22, 0x400d70a4    # 2.21f

    .line 425
    .line 426
    .line 427
    const v23, 0x3fe51eb8    # 1.79f

    .line 428
    .line 429
    .line 430
    const/high16 v24, 0x40800000    # 4.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, -0x401ae148    # -1.79f

    .line 436
    .line 437
    .line 438
    const/high16 v6, -0x3f800000    # -4.0f

    .line 439
    .line 440
    const/high16 v7, 0x40800000    # 4.0f

    .line 441
    .line 442
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v4, -0x3f800000    # -4.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, -0x40000000    # -2.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x41700000    # 15.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    const/high16 v6, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/high16 v8, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/4 v7, 0x0

    .line 472
    const-string v4, ""

    .line 473
    .line 474
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 475
    .line 476
    .line 477
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 482
    .line 483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 484
    .line 485
    .line 486
    move-result-wide v6

    .line 487
    const/4 v0, 0x0

    .line 488
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 496
    .line 497
    .line 498
    move-result v11

    .line 499
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41600000    # 14.0f

    .line 505
    .line 506
    const/high16 v2, 0x40000000    # 2.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x40c00000    # 6.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x40800000    # 4.0f

    .line 517
    .line 518
    const/high16 v18, 0x40800000    # 4.0f

    .line 519
    .line 520
    const v13, 0x409ccccd    # 4.9f

    .line 521
    .line 522
    .line 523
    const/high16 v14, 0x40000000    # 2.0f

    .line 524
    .line 525
    const/high16 v15, 0x40800000    # 4.0f

    .line 526
    .line 527
    const v16, 0x4039999a    # 2.9f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x41800000    # 16.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x40000000    # 2.0f

    .line 539
    .line 540
    const/high16 v18, 0x40000000    # 2.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f8ccccd    # 1.1f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f666666    # 0.9f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x40000000    # 2.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x41400000    # 12.0f

    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v18, -0x40000000    # -2.0f

    .line 560
    .line 561
    const v13, 0x3f8ccccd    # 1.1f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const/high16 v15, 0x40000000    # 2.0f

    .line 566
    .line 567
    const v16, -0x4099999a    # -0.9f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, 0x41000000    # 8.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41600000    # 14.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v0, 0x41900000    # 18.0f

    .line 587
    .line 588
    const/high16 v2, 0x41a00000    # 20.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x40c00000    # 6.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x40800000    # 4.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41000000    # 8.0f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, 0x40800000    # 4.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x41a00000    # 20.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const/16 v16, 0x3800

    .line 629
    .line 630
    const/16 v17, 0x0

    .line 631
    .line 632
    const/high16 v6, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const/high16 v12, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    const/4 v15, 0x0

    .line 639
    const-string v4, ""

    .line 640
    .line 641
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    sput-object v0, Landroidx/compose/material/icons/twotone/FilePresentKt;->_filePresent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    .line 651
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    return-object v0
.end method
