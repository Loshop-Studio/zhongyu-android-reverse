.class public final Landroidx/compose/material/icons/twotone/BedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBed(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BedKt;->_bed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Bed"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40f33333    # -0.55f

    .line 84
    .line 85
    .line 86
    const v23, -0x4119999a    # -0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40800000    # -1.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, -0x3f800000    # -4.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v26, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const v21, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, -0x40800000    # -1.0f

    .line 109
    .line 110
    const v24, 0x3ee66666    # 0.45f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41000000    # 8.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const/16 v16, 0x3800

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const v6, 0x3e99999a    # 0.3f

    .line 143
    .line 144
    .line 145
    const v8, 0x3e99999a    # 0.3f

    .line 146
    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    const/high16 v9, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/high16 v12, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const-string v4, ""

    .line 157
    .line 158
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41300000    # 11.0f

    .line 189
    .line 190
    const/high16 v6, 0x41000000    # 8.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v26, -0x40800000    # -1.0f

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const v22, -0x40f33333    # -0.55f

    .line 200
    .line 201
    .line 202
    const v23, -0x4119999a    # -0.45f

    .line 203
    .line 204
    .line 205
    const/high16 v24, -0x40800000    # -1.0f

    .line 206
    .line 207
    move-object/from16 v20, v2

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40c00000    # 6.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x40a00000    # 5.0f

    .line 218
    .line 219
    const/high16 v26, 0x41000000    # 8.0f

    .line 220
    .line 221
    const v21, 0x40ae6666    # 5.45f

    .line 222
    .line 223
    .line 224
    const/high16 v22, 0x40e00000    # 7.0f

    .line 225
    .line 226
    const/high16 v23, 0x40a00000    # 5.0f

    .line 227
    .line 228
    const v24, 0x40ee6666    # 7.45f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x40000000    # 2.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x40c00000    # 6.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41000000    # 8.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const v6, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41400000    # 12.0f

    .line 293
    .line 294
    const/high16 v6, 0x41980000    # 19.0f

    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x40a00000    # 5.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v25, -0x40800000    # -1.0f

    .line 305
    .line 306
    const/high16 v26, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const v21, -0x40f33333    # -0.55f

    .line 309
    .line 310
    .line 311
    const/16 v22, 0x0

    .line 312
    .line 313
    const/high16 v23, -0x40800000    # -1.0f

    .line 314
    .line 315
    const v24, 0x3ee66666    # 0.45f

    .line 316
    .line 317
    .line 318
    move-object/from16 v20, v2

    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x40000000    # 2.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41800000    # 16.0f

    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, -0x40000000    # -2.0f

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x41980000    # 19.0f

    .line 339
    .line 340
    const/high16 v26, 0x41400000    # 12.0f

    .line 341
    .line 342
    const/high16 v21, 0x41a00000    # 20.0f

    .line 343
    .line 344
    const v22, 0x41473333    # 12.45f

    .line 345
    .line 346
    .line 347
    const v23, 0x419c6666    # 19.55f

    .line 348
    .line 349
    .line 350
    const/high16 v24, 0x41400000    # 12.0f

    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const v6, 0x3e99999a    # 0.3f

    .line 363
    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const-string v4, ""

    .line 367
    .line 368
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    const/4 v0, 0x0

    .line 382
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41a80000    # 21.0f

    .line 399
    .line 400
    const v2, 0x412c7ae1    # 10.78f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41000000    # 8.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 412
    .line 413
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 414
    .line 415
    const v14, -0x402ccccd    # -1.65f

    .line 416
    .line 417
    .line 418
    const v15, -0x40533333    # -1.35f

    .line 419
    .line 420
    .line 421
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x3f800000    # -4.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x40000000    # -2.0f

    .line 432
    .line 433
    const v18, 0x3f47ae14    # 0.78f

    .line 434
    .line 435
    .line 436
    const v13, -0x40bae148    # -0.77f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const v15, -0x4043d70a    # -1.47f

    .line 441
    .line 442
    .line 443
    const v16, 0x3e99999a    # 0.3f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x41200000    # 10.0f

    .line 450
    .line 451
    const/high16 v18, 0x40a00000    # 5.0f

    .line 452
    .line 453
    const v13, 0x4137851f    # 11.47f

    .line 454
    .line 455
    .line 456
    const v14, 0x40a9999a    # 5.3f

    .line 457
    .line 458
    .line 459
    const v15, 0x412c51ec    # 10.77f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x40a00000    # 5.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40c00000    # 6.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x40400000    # 3.0f

    .line 473
    .line 474
    const/high16 v18, 0x41000000    # 8.0f

    .line 475
    .line 476
    const v13, 0x408b3333    # 4.35f

    .line 477
    .line 478
    .line 479
    const/high16 v14, 0x40a00000    # 5.0f

    .line 480
    .line 481
    const/high16 v15, 0x40400000    # 3.0f

    .line 482
    .line 483
    const v16, 0x40cb3333    # 6.35f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x4031eb85    # 2.78f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, 0x40000000    # 2.0f

    .line 496
    .line 497
    const/high16 v18, 0x41500000    # 13.0f

    .line 498
    .line 499
    const v13, 0x4018f5c3    # 2.39f

    .line 500
    .line 501
    .line 502
    const v14, 0x413547ae    # 11.33f

    .line 503
    .line 504
    .line 505
    const/high16 v15, 0x40000000    # 2.0f

    .line 506
    .line 507
    const v16, 0x4141eb85    # 12.12f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x40c00000    # 6.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x40000000    # 2.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, -0x40000000    # -2.0f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41800000    # 16.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40000000    # 2.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, -0x3f400000    # -6.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x41a80000    # 21.0f

    .line 547
    .line 548
    const v18, 0x412c7ae1    # 10.78f

    .line 549
    .line 550
    .line 551
    const/high16 v13, 0x41b00000    # 22.0f

    .line 552
    .line 553
    const v14, 0x4141eb85    # 12.12f

    .line 554
    .line 555
    .line 556
    const v15, 0x41ace148    # 21.61f

    .line 557
    .line 558
    .line 559
    const v16, 0x413547ae    # 11.33f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41500000    # 13.0f

    .line 569
    .line 570
    const/high16 v2, 0x41000000    # 8.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v18, -0x40800000    # -1.0f

    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const v14, -0x40f33333    # -0.55f

    .line 581
    .line 582
    .line 583
    const v15, 0x3ee66666    # 0.45f

    .line 584
    .line 585
    .line 586
    const/high16 v16, -0x40800000    # -1.0f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40800000    # 4.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v18, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const v13, 0x3f0ccccd    # 0.55f

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const/high16 v15, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const v16, 0x3ee66666    # 0.45f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x40000000    # 2.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, -0x3f400000    # -6.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x41000000    # 8.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x40a00000    # 5.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v18, -0x40800000    # -1.0f

    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const v14, -0x40f33333    # -0.55f

    .line 637
    .line 638
    .line 639
    const v15, 0x3ee66666    # 0.45f

    .line 640
    .line 641
    .line 642
    const/high16 v16, -0x40800000    # -1.0f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, 0x40800000    # 4.0f

    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v18, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const v13, 0x3f0ccccd    # 0.55f

    .line 655
    .line 656
    .line 657
    const/4 v14, 0x0

    .line 658
    const/high16 v15, 0x3f800000    # 1.0f

    .line 659
    .line 660
    const v16, 0x3ee66666    # 0.45f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, 0x40000000    # 2.0f

    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v0, 0x40a00000    # 5.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41000000    # 8.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x41a00000    # 20.0f

    .line 685
    .line 686
    const/high16 v2, 0x41700000    # 15.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, 0x40800000    # 4.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, -0x40000000    # -2.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v18, -0x40800000    # -1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const v14, -0x40f33333    # -0.55f

    .line 705
    .line 706
    .line 707
    const v15, 0x3ee66666    # 0.45f

    .line 708
    .line 709
    .line 710
    const/high16 v16, -0x40800000    # -1.0f

    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x41600000    # 14.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v18, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const v13, 0x3f0ccccd    # 0.55f

    .line 723
    .line 724
    .line 725
    const/4 v14, 0x0

    .line 726
    const/high16 v15, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const v16, 0x3ee66666    # 0.45f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x41700000    # 15.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/16 v16, 0x3800

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const/high16 v6, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/high16 v8, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/4 v7, 0x0

    .line 755
    const/high16 v12, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const/4 v13, 0x0

    .line 758
    const/4 v15, 0x0

    .line 759
    const-string v4, ""

    .line 760
    .line 761
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sput-object v0, Landroidx/compose/material/icons/twotone/BedKt;->_bed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 770
    .line 771
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    return-object v0
.end method
