.class public final Landroidx/compose/material/icons/rounded/KeyboardDoubleArrowLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _keyboardDoubleArrowLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyboardDoubleArrowLeft(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KeyboardDoubleArrowLeftKt;->_keyboardDoubleArrowLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.KeyboardDoubleArrowLeft"

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
    const v4, 0x419251ec    # 18.29f

    .line 71
    .line 72
    .line 73
    const v6, 0x418a51ec    # 17.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v25, 0x0

    .line 83
    .line 84
    const v26, -0x404b851f    # -1.41f

    .line 85
    .line 86
    .line 87
    const v21, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v22, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v23, 0x3ec7ae14    # 0.39f

    .line 94
    .line 95
    .line 96
    const v24, -0x407d70a4    # -1.02f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x4166b852    # 14.42f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x41400000    # 12.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, -0x3f87ae14    # -3.88f

    .line 113
    .line 114
    .line 115
    const v6, 0x407851ec    # 3.88f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, -0x404b851f    # -1.41f

    .line 129
    .line 130
    .line 131
    const/16 v26, 0x0

    .line 132
    .line 133
    const v21, -0x413851ec    # -0.39f

    .line 134
    .line 135
    .line 136
    const v23, -0x407d70a4    # -1.02f

    .line 137
    .line 138
    .line 139
    const v24, -0x413851ec    # -0.39f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, -0x3f6d1eb8    # -4.59f

    .line 146
    .line 147
    .line 148
    const v6, 0x4092e148    # 4.59f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/16 v25, 0x0

    .line 155
    .line 156
    const v26, 0x3fb47ae1    # 1.41f

    .line 157
    .line 158
    .line 159
    const v22, 0x3ec7ae14    # 0.39f

    .line 160
    .line 161
    .line 162
    const v23, -0x413851ec    # -0.39f

    .line 163
    .line 164
    .line 165
    const v24, 0x3f828f5c    # 1.02f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x4092e148    # 4.59f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x419251ec    # 18.29f

    .line 178
    .line 179
    .line 180
    const v26, 0x418a51ec    # 17.29f

    .line 181
    .line 182
    .line 183
    const v21, 0x418a28f6    # 17.27f

    .line 184
    .line 185
    .line 186
    const v22, 0x418d70a4    # 17.68f

    .line 187
    .line 188
    .line 189
    const v23, 0x418f3333    # 17.9f

    .line 190
    .line 191
    .line 192
    const v24, 0x418d70a4    # 17.68f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const/16 v16, 0x3800

    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const/high16 v6, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v8, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    const/high16 v9, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v12, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const-string v4, ""

    .line 222
    .line 223
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const v0, 0x413b3333    # 11.7f

    .line 254
    .line 255
    .line 256
    const v2, 0x418a51ec    # 17.29f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const v18, -0x404b851f    # -1.41f

    .line 268
    .line 269
    .line 270
    const v13, 0x3ec7ae14    # 0.39f

    .line 271
    .line 272
    .line 273
    const v14, -0x413851ec    # -0.39f

    .line 274
    .line 275
    .line 276
    const v15, 0x3ec7ae14    # 0.39f

    .line 277
    .line 278
    .line 279
    const v16, -0x407d70a4    # -1.02f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x40fa8f5c    # 7.83f

    .line 286
    .line 287
    .line 288
    const/high16 v2, 0x41400000    # 12.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x3f87ae14    # -3.88f

    .line 294
    .line 295
    .line 296
    const v2, 0x407851ec    # 3.88f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/4 v0, 0x0

    .line 306
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x404b851f    # -1.41f

    .line 310
    .line 311
    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    const v13, -0x413851ec    # -0.39f

    .line 315
    .line 316
    .line 317
    const v15, -0x407d70a4    # -1.02f

    .line 318
    .line 319
    .line 320
    const v16, -0x413851ec    # -0.39f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x3f6d1eb8    # -4.59f

    .line 327
    .line 328
    .line 329
    const v2, 0x4092e148    # 4.59f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const v18, 0x3fb47ae1    # 1.41f

    .line 338
    .line 339
    .line 340
    const v14, 0x3ec7ae14    # 0.39f

    .line 341
    .line 342
    .line 343
    const v15, -0x413851ec    # -0.39f

    .line 344
    .line 345
    .line 346
    const v16, 0x3f828f5c    # 1.02f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x4092e148    # 4.59f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x413b3333    # 11.7f

    .line 359
    .line 360
    .line 361
    const v18, 0x418a51ec    # 17.29f

    .line 362
    .line 363
    .line 364
    const v13, 0x412ae148    # 10.68f

    .line 365
    .line 366
    .line 367
    const v14, 0x418d70a4    # 17.68f

    .line 368
    .line 369
    .line 370
    const v15, 0x4134f5c3    # 11.31f

    .line 371
    .line 372
    .line 373
    const v16, 0x418d70a4    # 17.68f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    const/16 v16, 0x3800

    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const/high16 v6, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v12, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const/4 v14, 0x0

    .line 397
    const/4 v15, 0x0

    .line 398
    const-string v4, ""

    .line 399
    .line 400
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    sput-object v0, Landroidx/compose/material/icons/rounded/KeyboardDoubleArrowLeftKt;->_keyboardDoubleArrowLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 409
    .line 410
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    return-object v0
.end method
