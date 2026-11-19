.class public final Landroidx/compose/material/icons/rounded/AppRegistrationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _appRegistration:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppRegistration(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AppRegistrationKt;->_appRegistration:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AppRegistration"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40000000    # -2.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41900000    # 18.0f

    .line 160
    .line 161
    const/high16 v6, 0x40c00000    # 6.0f

    .line 162
    .line 163
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/high16 v6, -0x40000000    # -2.0f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40800000    # 4.0f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3f800000    # -4.0f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v2, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x41400000    # 12.0f

    .line 224
    .line 225
    const/high16 v6, 0x40c00000    # 6.0f

    .line 226
    .line 227
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/4 v4, 0x0

    .line 231
    const/high16 v6, -0x40000000    # -2.0f

    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v26, 0x40800000    # 4.0f

    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v26, -0x3f800000    # -4.0f

    .line 244
    .line 245
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const-string v4, ""

    .line 256
    .line 257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x40c00000    # 6.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/4 v4, 0x0

    .line 293
    const/high16 v6, -0x40000000    # -2.0f

    .line 294
    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v26, 0x40800000    # 4.0f

    .line 299
    .line 300
    move-object/from16 v20, v2

    .line 301
    .line 302
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v26, -0x3f800000    # -4.0f

    .line 306
    .line 307
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const/high16 v6, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    const-string v4, ""

    .line 318
    .line 319
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 320
    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 327
    .line 328
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 329
    .line 330
    .line 331
    move-result-wide v6

    .line 332
    const/4 v2, 0x0

    .line 333
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x41900000    # 18.0f

    .line 350
    .line 351
    const/high16 v6, 0x40c00000    # 6.0f

    .line 352
    .line 353
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/4 v4, 0x0

    .line 357
    const/high16 v6, -0x40000000    # -2.0f

    .line 358
    .line 359
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v26, 0x40800000    # 4.0f

    .line 363
    .line 364
    move-object/from16 v20, v2

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v26, -0x3f800000    # -4.0f

    .line 370
    .line 371
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    const/high16 v6, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v7, 0x0

    .line 381
    const-string v4, ""

    .line 382
    .line 383
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 384
    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 391
    .line 392
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 393
    .line 394
    .line 395
    move-result-wide v6

    .line 396
    const/4 v2, 0x0

    .line 397
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 405
    .line 406
    .line 407
    move-result v11

    .line 408
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x41300000    # 11.0f

    .line 414
    .line 415
    const v6, 0x41908f5c    # 18.07f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v4, 0x3fb70a3d    # 1.43f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v25, 0x3f000000    # 0.5f

    .line 428
    .line 429
    const/high16 v26, 0x3f000000    # 0.5f

    .line 430
    .line 431
    const/16 v21, 0x0

    .line 432
    .line 433
    const v22, 0x3e8f5c29    # 0.28f

    .line 434
    .line 435
    .line 436
    const v23, 0x3e6147ae    # 0.22f

    .line 437
    .line 438
    .line 439
    const/high16 v24, 0x3f000000    # 0.5f

    .line 440
    .line 441
    move-object/from16 v20, v2

    .line 442
    .line 443
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v4, 0x3fb33333    # 1.4f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v25, 0x3eb33333    # 0.35f

    .line 453
    .line 454
    .line 455
    const v26, -0x41e66666    # -0.15f

    .line 456
    .line 457
    .line 458
    const v21, 0x3e051eb8    # 0.13f

    .line 459
    .line 460
    .line 461
    const/16 v22, 0x0

    .line 462
    .line 463
    const v23, 0x3e851eb8    # 0.26f

    .line 464
    .line 465
    .line 466
    const v24, -0x42b33333    # -0.05f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, 0x40ba8f5c    # 5.83f

    .line 473
    .line 474
    .line 475
    const v6, -0x3f4570a4    # -5.83f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, -0x3ff851ec    # -2.12f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v4, -0x3f46147b    # -5.81f

    .line 488
    .line 489
    .line 490
    const v6, 0x40b9eb85    # 5.81f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v25, 0x41300000    # 11.0f

    .line 497
    .line 498
    const v26, 0x41908f5c    # 18.07f

    .line 499
    .line 500
    .line 501
    const v21, 0x4130cccd    # 11.05f

    .line 502
    .line 503
    .line 504
    const v22, 0x418e7ae1    # 17.81f

    .line 505
    .line 506
    .line 507
    const/high16 v23, 0x41300000    # 11.0f

    .line 508
    .line 509
    const v24, 0x418f851f    # 17.94f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/high16 v6, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const-string v4, ""

    .line 526
    .line 527
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 528
    .line 529
    .line 530
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 535
    .line 536
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 537
    .line 538
    .line 539
    move-result-wide v6

    .line 540
    const/4 v2, 0x0

    .line 541
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 545
    .line 546
    .line 547
    move-result v10

    .line 548
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 555
    .line 556
    .line 557
    const/high16 v4, 0x41600000    # 14.0f

    .line 558
    .line 559
    const v6, 0x41407ae1    # 12.03f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x41400000    # 12.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v25, -0x40000000    # -2.0f

    .line 574
    .line 575
    const/high16 v26, -0x40000000    # -2.0f

    .line 576
    .line 577
    const/16 v21, 0x0

    .line 578
    .line 579
    const v22, -0x40733333    # -1.1f

    .line 580
    .line 581
    .line 582
    const v23, -0x4099999a    # -0.9f

    .line 583
    .line 584
    .line 585
    const/high16 v24, -0x40000000    # -2.0f

    .line 586
    .line 587
    move-object/from16 v20, v2

    .line 588
    .line 589
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v4, 0x3f666666    # 0.9f

    .line 593
    .line 594
    .line 595
    const/high16 v6, 0x40000000    # 2.0f

    .line 596
    .line 597
    const/high16 v7, -0x40000000    # -2.0f

    .line 598
    .line 599
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v4, 0x41407ae1    # 12.03f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/4 v7, 0x0

    .line 621
    const-string v4, ""

    .line 622
    .line 623
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 624
    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 633
    .line 634
    .line 635
    move-result-wide v6

    .line 636
    const/4 v0, 0x0

    .line 637
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 651
    .line 652
    .line 653
    const v0, 0x41a6cccd    # 20.85f

    .line 654
    .line 655
    .line 656
    const v2, 0x4138f5c3    # 11.56f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x404b851f    # -1.41f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, -0x40ca3d71    # -0.71f

    .line 669
    .line 670
    .line 671
    const/16 v18, 0x0

    .line 672
    .line 673
    const v13, -0x41b33333    # -0.2f

    .line 674
    .line 675
    .line 676
    const v14, -0x41b33333    # -0.2f

    .line 677
    .line 678
    .line 679
    const v15, -0x40fd70a4    # -0.51f

    .line 680
    .line 681
    .line 682
    const v16, -0x41b33333    # -0.2f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x3f87ae14    # 1.06f

    .line 689
    .line 690
    .line 691
    const v2, -0x407851ec    # -1.06f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v0, 0x4007ae14    # 2.12f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x3f87ae14    # 1.06f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x41a6cccd    # 20.85f

    .line 710
    .line 711
    .line 712
    const v18, 0x4138f5c3    # 11.56f

    .line 713
    .line 714
    .line 715
    const v13, 0x41a86666    # 21.05f

    .line 716
    .line 717
    .line 718
    const v14, 0x41411eb8    # 12.07f

    .line 719
    .line 720
    .line 721
    const v15, 0x41a86666    # 21.05f

    .line 722
    .line 723
    .line 724
    const v16, 0x413c28f6    # 11.76f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    const/16 v16, 0x3800

    .line 738
    .line 739
    const/16 v17, 0x0

    .line 740
    .line 741
    const/high16 v6, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v7, 0x0

    .line 744
    const/high16 v12, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    const/4 v14, 0x0

    .line 748
    const/4 v15, 0x0

    .line 749
    const-string v4, ""

    .line 750
    .line 751
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    sput-object v0, Landroidx/compose/material/icons/rounded/AppRegistrationKt;->_appRegistration:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 760
    .line 761
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    return-object v0
.end method
