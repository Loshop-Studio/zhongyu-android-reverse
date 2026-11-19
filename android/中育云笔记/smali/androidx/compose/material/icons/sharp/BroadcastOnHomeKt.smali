.class public final Landroidx/compose/material/icons/sharp/BroadcastOnHomeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBroadcastOnHome(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/BroadcastOnHomeKt;->_broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.BroadcastOnHome"

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
    const v4, 0x411c28f6    # 9.76f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41b00000    # 22.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40800000    # 4.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, 0x40000000    # 2.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x41800000    # 16.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4025c28f    # 2.59f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41b00000    # 22.0f

    .line 103
    .line 104
    const v26, 0x411c28f6    # 9.76f

    .line 105
    .line 106
    .line 107
    const v21, 0x41a5d70a    # 20.73f

    .line 108
    .line 109
    .line 110
    const v22, 0x410e147b    # 8.88f

    .line 111
    .line 112
    .line 113
    const v23, 0x41ab3333    # 21.4f

    .line 114
    .line 115
    .line 116
    const v24, 0x41147ae1    # 9.28f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/16 v16, 0x3800

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/high16 v6, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v8, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    const/high16 v9, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/high16 v12, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x0

    .line 147
    const-string v4, ""

    .line 148
    .line 149
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    const/4 v2, 0x0

    .line 163
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x41100000    # 9.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40000000    # 2.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41300000    # 11.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x40e00000    # 7.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x41100000    # 9.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, 0x41900000    # 18.0f

    .line 208
    .line 209
    const/high16 v6, 0x40e00000    # 7.0f

    .line 210
    .line 211
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40800000    # 4.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, -0x3f200000    # -7.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, 0x40400000    # 3.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x41900000    # 18.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    const/high16 v6, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/4 v7, 0x0

    .line 244
    const-string v4, ""

    .line 245
    .line 246
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 247
    .line 248
    .line 249
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 254
    .line 255
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 256
    .line 257
    .line 258
    move-result-wide v6

    .line 259
    const/4 v2, 0x0

    .line 260
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x418e0000    # 17.75f

    .line 277
    .line 278
    const v6, 0x4187c28f    # 16.97f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v25, 0x3f000000    # 0.5f

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
    move-object/from16 v20, v2

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, -0x40600000    # -1.25f

    .line 306
    .line 307
    const/high16 v26, -0x40600000    # -1.25f

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const v22, -0x40cf5c29    # -0.69f

    .line 312
    .line 313
    .line 314
    const v23, -0x40f0a3d7    # -0.56f

    .line 315
    .line 316
    .line 317
    const/high16 v24, -0x40600000    # -1.25f

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v4, 0x3f0f5c29    # 0.56f

    .line 323
    .line 324
    .line 325
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 326
    .line 327
    const/high16 v7, -0x40600000    # -1.25f

    .line 328
    .line 329
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v25, 0x3f000000    # 0.5f

    .line 333
    .line 334
    const v26, 0x3f7851ec    # 0.97f

    .line 335
    .line 336
    .line 337
    const v22, 0x3ecccccd    # 0.4f

    .line 338
    .line 339
    .line 340
    const v23, 0x3e4ccccd    # 0.2f

    .line 341
    .line 342
    .line 343
    const/high16 v24, 0x3f400000    # 0.75f

    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x41b00000    # 22.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, 0x4187c28f    # 16.97f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const/high16 v6, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    const-string v4, ""

    .line 375
    .line 376
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 377
    .line 378
    .line 379
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 384
    .line 385
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    const/4 v2, 0x0

    .line 390
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 398
    .line 399
    .line 400
    move-result v11

    .line 401
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x41580000    # 13.5f

    .line 407
    .line 408
    const/high16 v6, 0x41880000    # 17.0f

    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x40200000    # 2.5f

    .line 414
    .line 415
    const/high16 v26, 0x40200000    # 2.5f

    .line 416
    .line 417
    const v21, 0x3fb0a3d7    # 1.38f

    .line 418
    .line 419
    .line 420
    const/16 v22, 0x0

    .line 421
    .line 422
    const/high16 v23, 0x40200000    # 2.5f

    .line 423
    .line 424
    const v24, 0x3f8f5c29    # 1.12f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v25, -0x40c51eb8    # -0.73f

    .line 433
    .line 434
    .line 435
    const v26, 0x3fe147ae    # 1.76f

    .line 436
    .line 437
    .line 438
    const/16 v21, 0x0

    .line 439
    .line 440
    const v22, 0x3f30a3d7    # 0.69f

    .line 441
    .line 442
    .line 443
    const v23, -0x4170a3d7    # -0.28f

    .line 444
    .line 445
    .line 446
    const v24, 0x3fa7ae14    # 1.31f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, 0x3f87ae14    # 1.06f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v25, 0x41a80000    # 21.0f

    .line 459
    .line 460
    const/high16 v26, 0x41800000    # 16.0f

    .line 461
    .line 462
    const v21, 0x41a46666    # 20.55f

    .line 463
    .line 464
    .line 465
    const v22, 0x4190cccd    # 18.1f

    .line 466
    .line 467
    .line 468
    const/high16 v23, 0x41a80000    # 21.0f

    .line 469
    .line 470
    const v24, 0x4188cccd    # 17.1f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, -0x3f800000    # -4.0f

    .line 477
    .line 478
    const/high16 v26, -0x3f800000    # -4.0f

    .line 479
    .line 480
    const/16 v21, 0x0

    .line 481
    .line 482
    const v22, -0x3ff28f5c    # -2.21f

    .line 483
    .line 484
    .line 485
    const v23, -0x401ae148    # -1.79f

    .line 486
    .line 487
    .line 488
    const/high16 v24, -0x3f800000    # -4.0f

    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v26, 0x40800000    # 4.0f

    .line 494
    .line 495
    const v21, -0x3ff28f5c    # -2.21f

    .line 496
    .line 497
    .line 498
    const/16 v22, 0x0

    .line 499
    .line 500
    const/high16 v23, -0x3f800000    # -4.0f

    .line 501
    .line 502
    const v24, 0x3fe51eb8    # 1.79f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v25, 0x3f95c28f    # 1.17f

    .line 509
    .line 510
    .line 511
    const v26, 0x40351eb8    # 2.83f

    .line 512
    .line 513
    .line 514
    const/16 v21, 0x0

    .line 515
    .line 516
    const v22, 0x3f8ccccd    # 1.1f

    .line 517
    .line 518
    .line 519
    const v23, 0x3ee66666    # 0.45f

    .line 520
    .line 521
    .line 522
    const v24, 0x40066666    # 2.1f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v4, -0x407851ec    # -1.06f

    .line 529
    .line 530
    .line 531
    const v6, 0x3f87ae14    # 1.06f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, -0x40c51eb8    # -0.73f

    .line 538
    .line 539
    .line 540
    const v26, -0x401d70a4    # -1.77f

    .line 541
    .line 542
    .line 543
    const v21, -0x4119999a    # -0.45f

    .line 544
    .line 545
    .line 546
    const v22, -0x4119999a    # -0.45f

    .line 547
    .line 548
    .line 549
    const v23, -0x40c51eb8    # -0.73f

    .line 550
    .line 551
    .line 552
    const v24, -0x4075c28f    # -1.08f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v25, 0x41880000    # 17.0f

    .line 559
    .line 560
    const/high16 v26, 0x41580000    # 13.5f

    .line 561
    .line 562
    const/high16 v21, 0x41680000    # 14.5f

    .line 563
    .line 564
    const v22, 0x4169eb85    # 14.62f

    .line 565
    .line 566
    .line 567
    const v23, 0x4179eb85    # 15.62f

    .line 568
    .line 569
    .line 570
    const/high16 v24, 0x41580000    # 13.5f

    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v7, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 595
    .line 596
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    const/4 v0, 0x0

    .line 601
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41180000    # 9.5f

    .line 618
    .line 619
    const/high16 v2, 0x41880000    # 17.0f

    .line 620
    .line 621
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, -0x3f300000    # -6.5f

    .line 625
    .line 626
    const/high16 v18, 0x40d00000    # 6.5f

    .line 627
    .line 628
    const v13, -0x3f9a3d71    # -3.59f

    .line 629
    .line 630
    .line 631
    const/high16 v15, -0x3f300000    # -6.5f

    .line 632
    .line 633
    const v16, 0x403a3d71    # 2.91f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, 0x3ff33333    # 1.9f

    .line 640
    .line 641
    .line 642
    const v18, 0x40933333    # 4.6f

    .line 643
    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, 0x3fe51eb8    # 1.79f

    .line 647
    .line 648
    .line 649
    const v15, 0x3f3ae148    # 0.73f

    .line 650
    .line 651
    .line 652
    const v16, 0x405ae148    # 3.42f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, -0x407851ec    # -1.06f

    .line 659
    .line 660
    .line 661
    const v2, 0x3f87ae14    # 1.06f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v17, 0x41400000    # 12.0f

    .line 668
    .line 669
    const/high16 v18, 0x41800000    # 16.0f

    .line 670
    .line 671
    const v13, 0x4148f5c3    # 12.56f

    .line 672
    .line 673
    .line 674
    const v14, 0x41950a3d    # 18.63f

    .line 675
    .line 676
    .line 677
    const/high16 v15, 0x41400000    # 12.0f

    .line 678
    .line 679
    const v16, 0x418b0a3d    # 17.38f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, 0x40a00000    # 5.0f

    .line 686
    .line 687
    const/high16 v18, -0x3f600000    # -5.0f

    .line 688
    .line 689
    const/4 v13, 0x0

    .line 690
    const v14, -0x3fcf5c29    # -2.76f

    .line 691
    .line 692
    .line 693
    const v15, 0x400f5c29    # 2.24f

    .line 694
    .line 695
    .line 696
    const/high16 v16, -0x3f600000    # -5.0f

    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x400f5c29    # 2.24f

    .line 702
    .line 703
    .line 704
    const/high16 v2, 0x40a00000    # 5.0f

    .line 705
    .line 706
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, -0x40451eb8    # -1.46f

    .line 710
    .line 711
    .line 712
    const v18, 0x406147ae    # 3.52f

    .line 713
    .line 714
    .line 715
    const v14, 0x3faf5c29    # 1.37f

    .line 716
    .line 717
    .line 718
    const v15, -0x40f0a3d7    # -0.56f

    .line 719
    .line 720
    .line 721
    const v16, 0x4027ae14    # 2.62f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x3f88f5c3    # 1.07f

    .line 728
    .line 729
    .line 730
    const v2, 0x3f87ae14    # 1.06f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v17, 0x3ff1eb85    # 1.89f

    .line 737
    .line 738
    .line 739
    const v18, -0x3f6d70a4    # -4.58f

    .line 740
    .line 741
    .line 742
    const v13, 0x3f95c28f    # 1.17f

    .line 743
    .line 744
    .line 745
    const v14, -0x4068f5c3    # -1.18f

    .line 746
    .line 747
    .line 748
    const v15, 0x3ff1eb85    # 1.89f

    .line 749
    .line 750
    .line 751
    const v16, -0x3fcccccd    # -2.8f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v17, 0x41880000    # 17.0f

    .line 758
    .line 759
    const/high16 v18, 0x41180000    # 9.5f

    .line 760
    .line 761
    const/high16 v13, 0x41bc0000    # 23.5f

    .line 762
    .line 763
    const v14, 0x41468f5c    # 12.41f

    .line 764
    .line 765
    .line 766
    const v15, 0x41a4b852    # 20.59f

    .line 767
    .line 768
    .line 769
    const/high16 v16, 0x41180000    # 9.5f

    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    const/16 v16, 0x3800

    .line 782
    .line 783
    const/16 v17, 0x0

    .line 784
    .line 785
    const/high16 v6, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v7, 0x0

    .line 788
    const/high16 v12, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v13, 0x0

    .line 791
    const/4 v14, 0x0

    .line 792
    const/4 v15, 0x0

    .line 793
    const-string v4, ""

    .line 794
    .line 795
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    sput-object v0, Landroidx/compose/material/icons/sharp/BroadcastOnHomeKt;->_broadcastOnHome:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 804
    .line 805
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    return-object v0
.end method
