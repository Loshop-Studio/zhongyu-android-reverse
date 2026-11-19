.class public final Landroidx/compose/material/icons/filled/HdrAutoSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hdrAutoSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrAutoSelect(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/HdrAutoSelectKt;->_hdrAutoSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.HdrAutoSelect"

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
    const/high16 v4, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40d00000    # 6.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41200000    # 10.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 93
    .line 94
    const/high16 v26, -0x40400000    # -1.5f

    .line 95
    .line 96
    const v21, 0x3f4ccccd    # 0.8f

    .line 97
    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 102
    .line 103
    const v24, -0x40cccccd    # -0.7f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41200000    # 10.0f

    .line 117
    .line 118
    const/high16 v26, 0x41800000    # 16.0f

    .line 119
    .line 120
    const/high16 v21, 0x41380000    # 11.5f

    .line 121
    .line 122
    const v22, 0x4185999a    # 16.7f

    .line 123
    .line 124
    .line 125
    const v23, 0x412ccccd    # 10.8f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41a40000    # 20.5f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41000000    # 8.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x40000000    # 2.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x41a40000    # 20.5f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const/16 v16, 0x3800

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v8, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v12, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const-string v4, ""

    .line 185
    .line 186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 194
    .line 195
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const/4 v2, 0x0

    .line 200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41840000    # 16.5f

    .line 217
    .line 218
    const/high16 v6, 0x41800000    # 16.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x41500000    # 13.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x40c00000    # 6.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, -0x40000000    # -2.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x3f8ccccd    # 1.1f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x3f666666    # 0.9f

    .line 250
    .line 251
    .line 252
    const/high16 v6, 0x40000000    # 2.0f

    .line 253
    .line 254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x41900000    # 18.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x4099999a    # -0.9f

    .line 263
    .line 264
    .line 265
    const v6, -0x3ff9999a    # -2.1f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, 0x3f666666    # 0.9f

    .line 272
    .line 273
    .line 274
    const v26, -0x404ccccd    # -1.4f

    .line 275
    .line 276
    .line 277
    const/high16 v21, 0x3f000000    # 0.5f

    .line 278
    .line 279
    const v22, -0x41666666    # -0.3f

    .line 280
    .line 281
    .line 282
    const v23, 0x3f666666    # 0.9f

    .line 283
    .line 284
    .line 285
    const v24, -0x40b33333    # -0.8f

    .line 286
    .line 287
    .line 288
    move-object/from16 v20, v2

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, -0x40800000    # -1.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x41840000    # 16.5f

    .line 299
    .line 300
    const/high16 v26, 0x41800000    # 16.0f

    .line 301
    .line 302
    const/high16 v21, 0x41900000    # 18.0f

    .line 303
    .line 304
    const v22, 0x4185999a    # 16.7f

    .line 305
    .line 306
    .line 307
    const v23, 0x418a6666    # 17.3f

    .line 308
    .line 309
    .line 310
    const/high16 v24, 0x41800000    # 16.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x41840000    # 16.5f

    .line 319
    .line 320
    const/high16 v6, 0x41940000    # 18.5f

    .line 321
    .line 322
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, -0x40000000    # -2.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, -0x40800000    # -1.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41940000    # 18.5f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/high16 v6, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 367
    .line 368
    .line 369
    move-result-wide v6

    .line 370
    const/4 v2, 0x0

    .line 371
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x40600000    # 3.5f

    .line 388
    .line 389
    const/high16 v6, 0x41900000    # 18.0f

    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, -0x40000000    # -2.0f

    .line 395
    .line 396
    const/4 v6, 0x0

    .line 397
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v4, -0x40400000    # -1.5f

    .line 404
    .line 405
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x40c00000    # 6.0f

    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 414
    .line 415
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 419
    .line 420
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x40000000    # 2.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x40200000    # 2.5f

    .line 429
    .line 430
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, -0x3f400000    # -6.0f

    .line 439
    .line 440
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, -0x40400000    # -1.5f

    .line 444
    .line 445
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/high16 v6, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const-string v4, ""

    .line 459
    .line 460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 461
    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 468
    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    const/4 v2, 0x0

    .line 474
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 482
    .line 483
    .line 484
    move-result v11

    .line 485
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x41b00000    # 22.0f

    .line 491
    .line 492
    const/high16 v6, 0x41940000    # 18.5f

    .line 493
    .line 494
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, -0x40000000    # -2.0f

    .line 498
    .line 499
    const/4 v6, 0x0

    .line 500
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, -0x40400000    # -1.5f

    .line 504
    .line 505
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x40000000    # 2.0f

    .line 509
    .line 510
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, -0x40000000    # -2.0f

    .line 514
    .line 515
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 519
    .line 520
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 532
    .line 533
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, -0x40000000    # -2.0f

    .line 537
    .line 538
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x40000000    # 2.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v4, -0x40400000    # -1.5f

    .line 547
    .line 548
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    const/high16 v6, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    const-string v4, ""

    .line 562
    .line 563
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 564
    .line 565
    .line 566
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 571
    .line 572
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 573
    .line 574
    .line 575
    move-result-wide v6

    .line 576
    const/4 v2, 0x0

    .line 577
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 585
    .line 586
    .line 587
    move-result v11

    .line 588
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 591
    .line 592
    .line 593
    const v4, 0x413f851f    # 11.97f

    .line 594
    .line 595
    .line 596
    const v6, 0x40a9999a    # 5.3f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v4, 0x4038f5c3    # 2.89f

    .line 603
    .line 604
    .line 605
    const v6, -0x407d70a4    # -1.02f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v4, 0x40066666    # 2.1f

    .line 612
    .line 613
    .line 614
    const/4 v6, 0x0

    .line 615
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v4, -0x3fc70a3d    # -2.89f

    .line 619
    .line 620
    .line 621
    const v6, -0x407d70a4    # -1.02f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const/high16 v6, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v7, 0x0

    .line 637
    const-string v4, ""

    .line 638
    .line 639
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 640
    .line 641
    .line 642
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 647
    .line 648
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 649
    .line 650
    .line 651
    move-result-wide v6

    .line 652
    const/4 v0, 0x0

    .line 653
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 657
    .line 658
    .line 659
    move-result v10

    .line 660
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 661
    .line 662
    .line 663
    move-result v11

    .line 664
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41400000    # 12.0f

    .line 670
    .line 671
    const/high16 v2, 0x40000000    # 2.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x40c00000    # 6.0f

    .line 677
    .line 678
    const/high16 v18, 0x41000000    # 8.0f

    .line 679
    .line 680
    const v13, 0x410b0a3d    # 8.69f

    .line 681
    .line 682
    .line 683
    const/high16 v14, 0x40000000    # 2.0f

    .line 684
    .line 685
    const/high16 v15, 0x40c00000    # 6.0f

    .line 686
    .line 687
    const v16, 0x4096147b    # 4.69f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, 0x402c28f6    # 2.69f

    .line 694
    .line 695
    .line 696
    const/high16 v2, 0x40c00000    # 6.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x3fd3d70a    # -2.69f

    .line 702
    .line 703
    .line 704
    const/high16 v2, -0x3f400000    # -6.0f

    .line 705
    .line 706
    const/high16 v4, 0x40c00000    # 6.0f

    .line 707
    .line 708
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x4174f5c3    # 15.31f

    .line 712
    .line 713
    .line 714
    const/high16 v2, 0x41400000    # 12.0f

    .line 715
    .line 716
    const/high16 v4, 0x40000000    # 2.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v0, 0x41300000    # 11.0f

    .line 725
    .line 726
    const v2, 0x4160a3d7    # 14.04f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v0, -0x40deb852    # -0.63f

    .line 733
    .line 734
    .line 735
    const v2, -0x401ae148    # -1.79f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v0, -0x3fcae148    # -2.83f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x411f5c29    # 9.96f

    .line 748
    .line 749
    .line 750
    const/high16 v2, 0x41300000    # 11.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x410bd70a    # 8.74f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, -0x3f200000    # -7.0f

    .line 762
    .line 763
    const v2, 0x402851ec    # 2.63f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 770
    .line 771
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v0, 0x40e00000    # 7.0f

    .line 775
    .line 776
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x4160a3d7    # 14.04f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const/16 v16, 0x3800

    .line 793
    .line 794
    const/16 v17, 0x0

    .line 795
    .line 796
    const/high16 v6, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/4 v7, 0x0

    .line 799
    const/high16 v12, 0x3f800000    # 1.0f

    .line 800
    .line 801
    const/4 v13, 0x0

    .line 802
    const/4 v14, 0x0

    .line 803
    const/4 v15, 0x0

    .line 804
    const-string v4, ""

    .line 805
    .line 806
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    sput-object v0, Landroidx/compose/material/icons/filled/HdrAutoSelectKt;->_hdrAutoSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 815
    .line 816
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    return-object v0
.end method
