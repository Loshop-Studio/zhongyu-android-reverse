.class public final Landroidx/compose/material/icons/sharp/BakeryDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBakeryDining(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.BakeryDining"

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
    const v4, 0x4182e148    # 16.36f

    .line 71
    .line 72
    .line 73
    const v6, 0x40f28f5c    # 7.58f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x41168f5c    # 9.41f

    .line 80
    .line 81
    .line 82
    const v6, -0x40a3d70a    # -0.86f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3f03851f    # -7.89f

    .line 95
    .line 96
    .line 97
    const v6, 0x404a3d71    # 3.16f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const/16 v16, 0x3800

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/high16 v6, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const/high16 v8, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    const/high16 v9, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v12, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const-string v4, ""

    .line 127
    .line 128
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const v4, 0x4075c28f    # 3.84f

    .line 159
    .line 160
    .line 161
    const v6, 0x4111999a    # 9.1f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x40fc7ae1    # 7.89f

    .line 168
    .line 169
    .line 170
    const v6, 0x404a3d71    # 3.16f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x3ee970a4    # -9.41f

    .line 183
    .line 184
    .line 185
    const v6, -0x40a3d70a    # -0.86f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const/high16 v6, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    const-string v4, ""

    .line 202
    .line 203
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 213
    .line 214
    .line 215
    move-result-wide v6

    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41200000    # 10.0f

    .line 234
    .line 235
    const v6, 0x4187eb85    # 16.99f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, 0x40800000    # 4.0f

    .line 242
    .line 243
    const/4 v6, 0x0

    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const v6, -0x3ed028f6    # -10.99f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, -0x3f400000    # -6.0f

    .line 256
    .line 257
    const/4 v6, 0x0

    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const-string v4, ""

    .line 272
    .line 273
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    const/4 v2, 0x0

    .line 287
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    const v4, 0x41a28f5c    # 20.32f

    .line 304
    .line 305
    .line 306
    const/high16 v6, 0x414c0000    # 12.75f

    .line 307
    .line 308
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v4, 0x40900000    # 4.5f

    .line 312
    .line 313
    const v6, -0x401851ec    # -1.81f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x3f75c28f    # 0.96f

    .line 320
    .line 321
    .line 322
    const v6, 0x3ff9999a    # 1.95f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, -0x4063d70a    # -1.22f

    .line 329
    .line 330
    .line 331
    const v6, 0x4003d70a    # 2.06f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    const/high16 v6, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    const-string v4, ""

    .line 348
    .line 349
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 350
    .line 351
    .line 352
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 357
    .line 358
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 359
    .line 360
    .line 361
    move-result-wide v6

    .line 362
    const/4 v0, 0x0

    .line 363
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    const v2, 0x3fbd70a4    # 1.48f

    .line 380
    .line 381
    .line 382
    const v4, 0x4187eb85    # 16.99f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v2, 0x3f9c28f6    # 1.22f

    .line 389
    .line 390
    .line 391
    const v4, 0x4003d70a    # 2.06f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v2, -0x408a3d71    # -0.96f

    .line 398
    .line 399
    .line 400
    const v4, 0x3ff9999a    # 1.95f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v2, -0x3f700000    # -4.5f

    .line 407
    .line 408
    const v4, -0x401851ec    # -1.81f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/high16 v6, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/4 v7, 0x0

    .line 424
    const-string v4, ""

    .line 425
    .line 426
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    sput-object v0, Landroidx/compose/material/icons/sharp/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 435
    .line 436
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    return-object v0
.end method
