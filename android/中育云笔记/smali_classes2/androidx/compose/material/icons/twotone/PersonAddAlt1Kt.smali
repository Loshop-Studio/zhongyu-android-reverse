.class public final Landroidx/compose/material/icons/twotone/PersonAddAlt1Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personAddAlt1:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonAddAlt1(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonAddAlt1Kt;->_personAddAlt1:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonAddAlt1"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x41800000    # 16.0f

    .line 162
    .line 163
    const/high16 v6, 0x41100000    # 9.0f

    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, -0x3f400000    # -6.0f

    .line 169
    .line 170
    const/high16 v26, 0x40000000    # 2.0f

    .line 171
    .line 172
    const v21, -0x3fd33333    # -2.7f

    .line 173
    .line 174
    .line 175
    const/16 v22, 0x0

    .line 176
    .line 177
    const v23, -0x3f466666    # -5.8f

    .line 178
    .line 179
    .line 180
    const v24, 0x3fa51eb8    # 1.29f

    .line 181
    .line 182
    .line 183
    move-object/from16 v20, v2

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41400000    # 12.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x41100000    # 9.0f

    .line 194
    .line 195
    const/high16 v26, 0x41800000    # 16.0f

    .line 196
    .line 197
    const v21, 0x416c7ae1    # 14.78f

    .line 198
    .line 199
    .line 200
    const v22, 0x418a3d71    # 17.28f

    .line 201
    .line 202
    .line 203
    const v23, 0x413b0a3d    # 11.69f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x41800000    # 16.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    const v6, 0x3e99999a    # 0.3f

    .line 219
    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const-string v4, ""

    .line 223
    .line 224
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 234
    .line 235
    .line 236
    move-result-wide v6

    .line 237
    const/4 v2, 0x0

    .line 238
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41600000    # 14.0f

    .line 255
    .line 256
    const/high16 v6, 0x41100000    # 9.0f

    .line 257
    .line 258
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v25, -0x3f000000    # -8.0f

    .line 262
    .line 263
    const/high16 v26, 0x40800000    # 4.0f

    .line 264
    .line 265
    const v21, -0x3fd51eb8    # -2.67f

    .line 266
    .line 267
    .line 268
    const/16 v22, 0x0

    .line 269
    .line 270
    const/high16 v23, -0x3f000000    # -8.0f

    .line 271
    .line 272
    const v24, 0x3fab851f    # 1.34f

    .line 273
    .line 274
    .line 275
    move-object/from16 v20, v2

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40000000    # 2.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41800000    # 16.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, -0x40000000    # -2.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x41100000    # 9.0f

    .line 296
    .line 297
    const/high16 v26, 0x41600000    # 14.0f

    .line 298
    .line 299
    const/high16 v21, 0x41880000    # 17.0f

    .line 300
    .line 301
    const v22, 0x417570a4    # 15.34f

    .line 302
    .line 303
    .line 304
    const v23, 0x413ab852    # 11.67f

    .line 305
    .line 306
    .line 307
    const/high16 v24, 0x41600000    # 14.0f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x41900000    # 18.0f

    .line 316
    .line 317
    const/high16 v6, 0x40400000    # 3.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v25, 0x40c00000    # 6.0f

    .line 323
    .line 324
    const/high16 v26, -0x40000000    # -2.0f

    .line 325
    .line 326
    const v21, 0x3e4ccccd    # 0.2f

    .line 327
    .line 328
    .line 329
    const v22, -0x40ca3d71    # -0.71f

    .line 330
    .line 331
    .line 332
    const v23, 0x40533333    # 3.3f

    .line 333
    .line 334
    .line 335
    const/high16 v24, -0x40000000    # -2.0f

    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v26, 0x40000000    # 2.0f

    .line 341
    .line 342
    const v21, 0x402c28f6    # 2.69f

    .line 343
    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const v23, 0x40b8f5c3    # 5.78f

    .line 348
    .line 349
    .line 350
    const v24, 0x3fa3d70a    # 1.28f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x40400000    # 3.0f

    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    const/high16 v6, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v8, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v7, 0x0

    .line 373
    const-string v4, ""

    .line 374
    .line 375
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 376
    .line 377
    .line 378
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 383
    .line 384
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 385
    .line 386
    .line 387
    move-result-wide v6

    .line 388
    const/4 v2, 0x0

    .line 389
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 393
    .line 394
    .line 395
    move-result v10

    .line 396
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 397
    .line 398
    .line 399
    move-result v11

    .line 400
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41a00000    # 20.0f

    .line 406
    .line 407
    const/high16 v6, 0x41200000    # 10.0f

    .line 408
    .line 409
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 413
    .line 414
    const/4 v6, 0x0

    .line 415
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, -0x40000000    # -2.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x40400000    # 3.0f

    .line 424
    .line 425
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x40000000    # 2.0f

    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x40400000    # 3.0f

    .line 439
    .line 440
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 452
    .line 453
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x40400000    # 3.0f

    .line 457
    .line 458
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v4, -0x40000000    # -2.0f

    .line 462
    .line 463
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 486
    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 488
    .line 489
    .line 490
    move-result-wide v6

    .line 491
    const/4 v0, 0x0

    .line 492
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 500
    .line 501
    .line 502
    move-result v11

    .line 503
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41400000    # 12.0f

    .line 509
    .line 510
    const/high16 v2, 0x41100000    # 9.0f

    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x40800000    # 4.0f

    .line 516
    .line 517
    const/high16 v18, -0x3f800000    # -4.0f

    .line 518
    .line 519
    const v13, 0x400d70a4    # 2.21f

    .line 520
    .line 521
    .line 522
    const/high16 v15, 0x40800000    # 4.0f

    .line 523
    .line 524
    const v16, -0x401ae148    # -1.79f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, -0x3f800000    # -4.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const v14, -0x3ff28f5c    # -2.21f

    .line 534
    .line 535
    .line 536
    const v15, -0x401ae148    # -1.79f

    .line 537
    .line 538
    .line 539
    const/high16 v16, -0x3f800000    # -4.0f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x40b947ae    # 5.79f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x40a00000    # 5.0f

    .line 548
    .line 549
    const/high16 v4, 0x41000000    # 8.0f

    .line 550
    .line 551
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x41100000    # 9.0f

    .line 555
    .line 556
    const/high16 v18, 0x41400000    # 12.0f

    .line 557
    .line 558
    const/high16 v13, 0x40a00000    # 5.0f

    .line 559
    .line 560
    const v14, 0x41235c29    # 10.21f

    .line 561
    .line 562
    .line 563
    const v15, 0x40d947ae    # 6.79f

    .line 564
    .line 565
    .line 566
    const/high16 v16, 0x41400000    # 12.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x40c00000    # 6.0f

    .line 575
    .line 576
    const/high16 v2, 0x41100000    # 9.0f

    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x40000000    # 2.0f

    .line 582
    .line 583
    const/high16 v18, 0x40000000    # 2.0f

    .line 584
    .line 585
    const v13, 0x3f8ccccd    # 1.1f

    .line 586
    .line 587
    .line 588
    const/4 v14, 0x0

    .line 589
    const/high16 v15, 0x40000000    # 2.0f

    .line 590
    .line 591
    const v16, 0x3f666666    # 0.9f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, -0x40000000    # -2.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const v14, 0x3f8ccccd    # 1.1f

    .line 601
    .line 602
    .line 603
    const v15, -0x4099999a    # -0.9f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x40000000    # 2.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x4111999a    # 9.1f

    .line 612
    .line 613
    .line 614
    const/high16 v2, 0x40e00000    # 7.0f

    .line 615
    .line 616
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x41100000    # 9.0f

    .line 620
    .line 621
    const/high16 v18, 0x40c00000    # 6.0f

    .line 622
    .line 623
    const/high16 v13, 0x40e00000    # 7.0f

    .line 624
    .line 625
    const v14, 0x40dccccd    # 6.9f

    .line 626
    .line 627
    .line 628
    const v15, 0x40fccccd    # 7.9f

    .line 629
    .line 630
    .line 631
    const/high16 v16, 0x40c00000    # 6.0f

    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    const/16 v16, 0x3800

    .line 644
    .line 645
    const/16 v17, 0x0

    .line 646
    .line 647
    const/high16 v6, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    const/high16 v12, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/4 v13, 0x0

    .line 653
    const/4 v14, 0x0

    .line 654
    const/4 v15, 0x0

    .line 655
    const-string v4, ""

    .line 656
    .line 657
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonAddAlt1Kt;->_personAddAlt1:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 666
    .line 667
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    return-object v0
.end method
