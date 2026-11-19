.class public final Landroidx/compose/material/icons/sharp/HandymanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _handyman:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHandyman(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 24

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/HandymanKt;->_handyman:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Handyman"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x4182f5c3    # 16.37f

    .line 71
    .line 72
    .line 73
    const v7, 0x414deb85    # 12.87f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v8, -0x40828f5c    # -0.99f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v8, -0x3fdd70a4    # -2.54f

    .line 86
    .line 87
    .line 88
    const v9, 0x40228f5c    # 2.54f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v8, 0x3f7d70a4    # 0.99f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v8, 0x40c051ec    # 6.01f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v9, 0x40628f5c    # 3.54f

    .line 107
    .line 108
    .line 109
    const v12, -0x3f9d70a4    # -3.54f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const/16 v16, 0x3800

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    move-object v6, v2

    .line 130
    move-object v2, v4

    .line 131
    const-string v4, ""

    .line 132
    .line 133
    move-object v7, v6

    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    move-object v13, v7

    .line 137
    const/4 v7, 0x0

    .line 138
    move v14, v8

    .line 139
    const/high16 v8, 0x3f800000    # 1.0f

    .line 140
    .line 141
    move v15, v9

    .line 142
    const/high16 v9, 0x3f800000    # 1.0f

    .line 143
    .line 144
    move/from16 v20, v12

    .line 145
    .line 146
    const/high16 v12, 0x3f800000    # 1.0f

    .line 147
    .line 148
    move-object/from16 v21, v13

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    move/from16 v22, v14

    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    move/from16 v23, v15

    .line 155
    .line 156
    const/4 v15, 0x0

    .line 157
    move-object/from16 p0, v0

    .line 158
    .line 159
    move-object/from16 v0, v21

    .line 160
    .line 161
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 162
    .line 163
    .line 164
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const v0, 0x418ab852    # 17.34f

    .line 191
    .line 192
    .line 193
    const v2, 0x41230a3d    # 10.19f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x3fb47ae1    # 1.41f

    .line 200
    .line 201
    .line 202
    const v6, -0x404b851f    # -1.41f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v7, 0x4007ae14    # 2.12f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const v18, -0x3f7851ec    # -4.24f

    .line 217
    .line 218
    .line 219
    const v13, 0x3f95c28f    # 1.17f

    .line 220
    .line 221
    .line 222
    const v14, -0x406a3d71    # -1.17f

    .line 223
    .line 224
    .line 225
    const v15, 0x3f95c28f    # 1.17f

    .line 226
    .line 227
    .line 228
    const v16, -0x3fbb851f    # -3.07f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v7, -0x3f9d70a4    # -3.54f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v8, 0x3fdae148    # 1.71f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v8, 0x4173851f    # 15.22f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v15, 0x40628f5c    # 3.54f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v7, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v7, 0x3f35c28f    # 0.71f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v7, 0x40351eb8    # 2.83f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v6, 0x3f87ae14    # 1.06f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v6, -0x3fc70a3d    # -2.89f

    .line 283
    .line 284
    .line 285
    const v7, 0x4038f5c3    # 2.89f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v6, 0x40fb3333    # 7.85f

    .line 292
    .line 293
    .line 294
    const v7, 0x40cf5c29    # 6.48f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v6, 0x40a1eb85    # 5.06f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v6, 0x409a8f5c    # 4.83f

    .line 307
    .line 308
    .line 309
    const v7, 0x40028f5c    # 2.04f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v6, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v7, 0x409bd70a    # 4.87f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v6, 0x4041eb85    # 3.03f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, 0x408428f6    # 4.13f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, -0x40a66666    # -0.85f

    .line 339
    .line 340
    .line 341
    const v6, 0x3f59999a    # 0.85f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v4, 0x40f33333    # 7.6f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, -0x3f3fae14    # -6.01f

    .line 354
    .line 355
    .line 356
    const v14, 0x40c051ec    # 6.01f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v4, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v15, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v14, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, -0x3ff851ec    # -2.12f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x40a4cccd    # 5.15f

    .line 375
    .line 376
    .line 377
    const v6, -0x3f5b3333    # -5.15f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/16 v16, 0x3800

    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const-string v4, ""

    .line 398
    .line 399
    const/high16 v6, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const/high16 v8, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/high16 v12, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const/4 v14, 0x0

    .line 408
    const/4 v15, 0x0

    .line 409
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    sput-object v0, Landroidx/compose/material/icons/sharp/HandymanKt;->_handyman:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 418
    .line 419
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    return-object v0
.end method
