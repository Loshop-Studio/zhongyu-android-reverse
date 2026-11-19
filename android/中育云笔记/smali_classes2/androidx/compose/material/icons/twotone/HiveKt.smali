.class public final Landroidx/compose/material/icons/twotone/HiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHive(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HiveKt;->_hive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Hive"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const v6, 0x40bd70a4    # 5.92f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x406f5c29    # -1.13f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x40000000    # 2.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x3f90a3d7    # 1.13f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    const v6, 0x4008f5c3    # 2.14f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x3f90a3d7    # 1.13f

    .line 100
    .line 101
    .line 102
    const/high16 v6, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, -0x406f5c29    # -1.13f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const/16 v16, 0x3800

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    const v6, 0x3e99999a    # 0.3f

    .line 125
    .line 126
    .line 127
    const v8, 0x3e99999a    # 0.3f

    .line 128
    .line 129
    .line 130
    const/4 v7, 0x0

    .line 131
    const/high16 v9, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/high16 v12, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/4 v15, 0x0

    .line 138
    const-string v4, ""

    .line 139
    .line 140
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 150
    .line 151
    .line 152
    move-result-wide v6

    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const v4, 0x412f0a3d    # 10.94f

    .line 171
    .line 172
    .line 173
    const/high16 v6, 0x41800000    # 16.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, -0x406e147b    # -1.14f

    .line 179
    .line 180
    .line 181
    const v6, 0x400147ae    # 2.02f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, 0x3ffd70a4    # 1.98f

    .line 188
    .line 189
    .line 190
    const v6, 0x3f8f5c29    # 1.12f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x400a3d71    # 2.16f

    .line 197
    .line 198
    .line 199
    const/4 v6, 0x0

    .line 200
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, -0x40028f5c    # -1.98f

    .line 204
    .line 205
    .line 206
    const v6, 0x3f8f5c29    # 1.12f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, -0x406e147b    # -1.14f

    .line 213
    .line 214
    .line 215
    const v6, -0x3ffeb852    # -2.02f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const v6, 0x3e99999a    # 0.3f

    .line 229
    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41600000    # 14.0f

    .line 265
    .line 266
    const v6, 0x4150f5c3    # 13.06f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x3f90a3d7    # 1.13f

    .line 273
    .line 274
    .line 275
    const/high16 v6, -0x40000000    # -2.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v4, -0x406f5c29    # -1.13f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, -0x3ff851ec    # -2.12f

    .line 287
    .line 288
    .line 289
    const/4 v6, 0x0

    .line 290
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, -0x406f5c29    # -1.13f

    .line 294
    .line 295
    .line 296
    const/high16 v6, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x3f90a3d7    # 1.13f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const v6, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const-string v4, ""

    .line 319
    .line 320
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v6

    .line 333
    const/4 v2, 0x0

    .line 334
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41500000    # 13.0f

    .line 351
    .line 352
    const v6, 0x40bd70a4    # 5.92f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v4, -0x406f5c29    # -1.13f

    .line 359
    .line 360
    .line 361
    const/high16 v6, 0x40000000    # 2.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x3f90a3d7    # 1.13f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/4 v4, 0x0

    .line 373
    const v6, 0x4008f5c3    # 2.14f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, 0x3f90a3d7    # 1.13f

    .line 380
    .line 381
    .line 382
    const/high16 v6, -0x40000000    # -2.0f

    .line 383
    .line 384
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, -0x406f5c29    # -1.13f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const v6, 0x3e99999a    # 0.3f

    .line 401
    .line 402
    .line 403
    const/4 v7, 0x0

    .line 404
    const-string v4, ""

    .line 405
    .line 406
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 407
    .line 408
    .line 409
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 414
    .line 415
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 416
    .line 417
    .line 418
    move-result-wide v6

    .line 419
    const/4 v2, 0x0

    .line 420
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 434
    .line 435
    .line 436
    const v4, 0x417f0a3d    # 15.94f

    .line 437
    .line 438
    .line 439
    const/high16 v6, 0x40e00000    # 7.0f

    .line 440
    .line 441
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, -0x406f5c29    # -1.13f

    .line 445
    .line 446
    .line 447
    const/high16 v6, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, 0x3f90a3d7    # 1.13f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/4 v4, 0x0

    .line 459
    const v6, 0x4008f5c3    # 2.14f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v4, 0x3f90a3d7    # 1.13f

    .line 466
    .line 467
    .line 468
    const/high16 v6, -0x40000000    # -2.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v4, -0x406f5c29    # -1.13f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const v6, 0x3e99999a    # 0.3f

    .line 487
    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const-string v4, ""

    .line 491
    .line 492
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 493
    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 500
    .line 501
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 502
    .line 503
    .line 504
    move-result-wide v6

    .line 505
    const/4 v2, 0x0

    .line 506
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 520
    .line 521
    .line 522
    const v4, 0x412eb852    # 10.92f

    .line 523
    .line 524
    .line 525
    const/high16 v6, 0x40800000    # 4.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, 0x3ffd70a4    # 1.98f

    .line 531
    .line 532
    .line 533
    const v6, -0x4070a3d7    # -1.12f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v4, 0x3f91eb85    # 1.14f

    .line 540
    .line 541
    .line 542
    const v6, 0x400147ae    # 2.02f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v4, 0x4007ae14    # 2.12f

    .line 549
    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x3f91eb85    # 1.14f

    .line 556
    .line 557
    .line 558
    const v6, -0x3ffeb852    # -2.02f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v4, -0x40028f5c    # -1.98f

    .line 565
    .line 566
    .line 567
    const v6, -0x4070a3d7    # -1.12f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    const v6, 0x3e99999a    # 0.3f

    .line 581
    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 594
    .line 595
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 596
    .line 597
    .line 598
    move-result-wide v6

    .line 599
    const/4 v2, 0x0

    .line 600
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 604
    .line 605
    .line 606
    move-result v10

    .line 607
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    const v4, 0x417f0a3d    # 15.94f

    .line 617
    .line 618
    .line 619
    const/high16 v6, 0x41500000    # 13.0f

    .line 620
    .line 621
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v4, -0x406f5c29    # -1.13f

    .line 625
    .line 626
    .line 627
    const/high16 v6, 0x40000000    # 2.0f

    .line 628
    .line 629
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v4, 0x3f90a3d7    # 1.13f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/4 v4, 0x0

    .line 639
    const v6, 0x4008f5c3    # 2.14f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v4, 0x3f90a3d7    # 1.13f

    .line 646
    .line 647
    .line 648
    const/high16 v6, -0x40000000    # -2.0f

    .line 649
    .line 650
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v4, -0x406f5c29    # -1.13f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    const v6, 0x3e99999a    # 0.3f

    .line 667
    .line 668
    .line 669
    const/4 v7, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 680
    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 682
    .line 683
    .line 684
    move-result-wide v6

    .line 685
    const/4 v0, 0x0

    .line 686
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 690
    .line 691
    .line 692
    move-result v10

    .line 693
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 700
    .line 701
    .line 702
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 703
    .line 704
    const/high16 v4, 0x41100000    # 9.0f

    .line 705
    .line 706
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v2, -0x3ff00000    # -2.25f

    .line 710
    .line 711
    const/high16 v4, -0x3f800000    # -4.0f

    .line 712
    .line 713
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v2, -0x3fac28f6    # -3.31f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v2, -0x4027ae14    # -1.69f

    .line 723
    .line 724
    .line 725
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 726
    .line 727
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v2, -0x3f700000    # -4.5f

    .line 731
    .line 732
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v2, 0x40a00000    # 5.0f

    .line 736
    .line 737
    const v4, 0x4100f5c3    # 8.06f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v2, 0x40980000    # 4.75f

    .line 744
    .line 745
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v2, 0x40200000    # 2.5f

    .line 749
    .line 750
    const/high16 v4, 0x41100000    # 9.0f

    .line 751
    .line 752
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v2, 0x3fd851ec    # 1.69f

    .line 756
    .line 757
    .line 758
    const/high16 v4, 0x40400000    # 3.0f

    .line 759
    .line 760
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v2, 0x40200000    # 2.5f

    .line 764
    .line 765
    const/high16 v4, 0x41700000    # 15.0f

    .line 766
    .line 767
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v2, 0x40100000    # 2.25f

    .line 771
    .line 772
    const/high16 v4, 0x40800000    # 4.0f

    .line 773
    .line 774
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const v2, 0x4053d70a    # 3.31f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v2, 0x3fd851ec    # 1.69f

    .line 784
    .line 785
    .line 786
    const/high16 v4, 0x40400000    # 3.0f

    .line 787
    .line 788
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v2, 0x40900000    # 4.5f

    .line 792
    .line 793
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v2, 0x3fd851ec    # 1.69f

    .line 797
    .line 798
    .line 799
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 800
    .line 801
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v2, 0x4053d70a    # 3.31f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v2, 0x40100000    # 2.25f

    .line 811
    .line 812
    const/high16 v4, -0x3f800000    # -4.0f

    .line 813
    .line 814
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v2, -0x4027ae14    # -1.69f

    .line 818
    .line 819
    .line 820
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 821
    .line 822
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 826
    .line 827
    const/high16 v4, 0x41100000    # 9.0f

    .line 828
    .line 829
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v2, 0x41880000    # 17.0f

    .line 836
    .line 837
    const v4, 0x4100f5c3    # 8.06f

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v2, 0x40bd70a4    # 5.92f

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v2, -0x4070a3d7    # -1.12f

    .line 850
    .line 851
    .line 852
    const/high16 v4, -0x40000000    # -2.0f

    .line 853
    .line 854
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v2, 0x3f8f5c29    # 1.12f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v2, 0x4008f5c3    # 2.14f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v2, 0x3f8f5c29    # 1.12f

    .line 870
    .line 871
    .line 872
    const/high16 v4, 0x40000000    # 2.0f

    .line 873
    .line 874
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v2, 0x41880000    # 17.0f

    .line 878
    .line 879
    const v4, 0x4100f5c3    # 8.06f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/high16 v2, 0x41300000    # 11.0f

    .line 889
    .line 890
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v2, 0x40bd70a4    # 5.92f

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v2, 0x409947ae    # 4.79f

    .line 900
    .line 901
    .line 902
    const/high16 v4, 0x41100000    # 9.0f

    .line 903
    .line 904
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v2, 0x3f8f5c29    # 1.12f

    .line 908
    .line 909
    .line 910
    const/high16 v4, -0x40000000    # -2.0f

    .line 911
    .line 912
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v2, 0x4008f5c3    # 2.14f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v2, 0x3f8f5c29    # 1.12f

    .line 922
    .line 923
    .line 924
    const/high16 v4, 0x40000000    # 2.0f

    .line 925
    .line 926
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v2, 0x41300000    # 11.0f

    .line 930
    .line 931
    const v4, 0x4100f5c3    # 8.06f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    const v2, 0x415147ae    # 13.08f

    .line 941
    .line 942
    .line 943
    const/high16 v4, 0x41a00000    # 20.0f

    .line 944
    .line 945
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const v2, -0x3ff5c28f    # -2.16f

    .line 949
    .line 950
    .line 951
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v2, 0x411ccccd    # 9.8f

    .line 955
    .line 956
    .line 957
    const v4, 0x419028f6    # 18.02f

    .line 958
    .line 959
    .line 960
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v2, 0x412f0a3d    # 10.94f

    .line 964
    .line 965
    .line 966
    const/high16 v4, 0x41800000    # 16.0f

    .line 967
    .line 968
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v2, 0x4007ae14    # 2.12f

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v2, 0x400147ae    # 2.02f

    .line 978
    .line 979
    .line 980
    const v4, 0x3f90a3d7    # 1.13f

    .line 981
    .line 982
    .line 983
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v2, 0x415147ae    # 13.08f

    .line 987
    .line 988
    .line 989
    const/high16 v4, 0x41a00000    # 20.0f

    .line 990
    .line 991
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v2, 0x411cf5c3    # 9.81f

    .line 998
    .line 999
    .line 1000
    const/high16 v4, 0x41400000    # 12.0f

    .line 1001
    .line 1002
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const v2, 0x3f8f5c29    # 1.12f

    .line 1006
    .line 1007
    .line 1008
    const/high16 v4, -0x40000000    # -2.0f

    .line 1009
    .line 1010
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v2, 0x4007ae14    # 2.12f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const v2, 0x3f8f5c29    # 1.12f

    .line 1020
    .line 1021
    .line 1022
    const/high16 v4, 0x40000000    # 2.0f

    .line 1023
    .line 1024
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v2, -0x4070a3d7    # -1.12f

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    const v2, -0x3ff851ec    # -2.12f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v2, 0x411cf5c3    # 9.81f

    .line 1040
    .line 1041
    .line 1042
    const/high16 v4, 0x41400000    # 12.0f

    .line 1043
    .line 1044
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const/high16 v2, 0x41000000    # 8.0f

    .line 1051
    .line 1052
    const v4, 0x4150f5c3    # 13.06f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v2, -0x3ff851ec    # -2.12f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v2, 0x411ccccd    # 9.8f

    .line 1065
    .line 1066
    .line 1067
    const v4, 0x40bf5c29    # 5.98f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v2, 0x412eb852    # 10.92f

    .line 1074
    .line 1075
    .line 1076
    const/high16 v4, 0x40800000    # 4.0f

    .line 1077
    .line 1078
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v2, 0x400a3d71    # 2.16f

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const v2, 0x3ffd70a4    # 1.98f

    .line 1088
    .line 1089
    .line 1090
    const v4, 0x3f8f5c29    # 1.12f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const/high16 v2, 0x41000000    # 8.0f

    .line 1097
    .line 1098
    const v4, 0x4150f5c3    # 13.06f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v2, 0x4190a3d7    # 18.08f

    .line 1108
    .line 1109
    .line 1110
    const/high16 v4, 0x41880000    # 17.0f

    .line 1111
    .line 1112
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const v2, -0x3ff70a3d    # -2.14f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v2, -0x4070a3d7    # -1.12f

    .line 1122
    .line 1123
    .line 1124
    const/high16 v4, -0x40000000    # -2.0f

    .line 1125
    .line 1126
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const v2, 0x3f8f5c29    # 1.12f

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1133
    .line 1134
    .line 1135
    const v2, 0x4008f5c3    # 2.14f

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v2, 0x3f8f5c29    # 1.12f

    .line 1142
    .line 1143
    .line 1144
    const/high16 v4, 0x40000000    # 2.0f

    .line 1145
    .line 1146
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1147
    .line 1148
    .line 1149
    const v2, 0x4190a3d7    # 18.08f

    .line 1150
    .line 1151
    .line 1152
    const/high16 v4, 0x41880000    # 17.0f

    .line 1153
    .line 1154
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const/high16 v4, 0x41300000    # 11.0f

    .line 1161
    .line 1162
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v2, -0x3ff70a3d    # -2.14f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const v2, -0x4070a3d7    # -1.12f

    .line 1172
    .line 1173
    .line 1174
    const/high16 v4, -0x40000000    # -2.0f

    .line 1175
    .line 1176
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    const v2, 0x3f8f5c29    # 1.12f

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const v2, 0x4008f5c3    # 2.14f

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const v2, 0x3f8f5c29    # 1.12f

    .line 1192
    .line 1193
    .line 1194
    const/high16 v4, 0x40000000    # 2.0f

    .line 1195
    .line 1196
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v2, 0x4190a3d7    # 18.08f

    .line 1200
    .line 1201
    .line 1202
    const/high16 v4, 0x41300000    # 11.0f

    .line 1203
    .line 1204
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1215
    .line 1216
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1217
    .line 1218
    const/4 v7, 0x0

    .line 1219
    const-string v4, ""

    .line 1220
    .line 1221
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    sput-object v0, Landroidx/compose/material/icons/twotone/HiveKt;->_hive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1230
    .line 1231
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1232
    .line 1233
    .line 1234
    return-object v0
.end method
