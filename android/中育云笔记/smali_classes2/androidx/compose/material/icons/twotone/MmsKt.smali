.class public final Landroidx/compose/material/icons/twotone/MmsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mms:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMms(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MmsKt;->_mms:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Mms"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 71
    .line 72
    const v7, 0x41895c29    # 17.17f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v8, 0x40a570a4    # 5.17f

    .line 79
    .line 80
    .line 81
    const/high16 v9, 0x41800000    # 16.0f

    .line 82
    .line 83
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v12, 0x41a00000    # 20.0f

    .line 87
    .line 88
    invoke-virtual {v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v13, 0x4152b852    # 13.17f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v13, 0x41080000    # 8.5f

    .line 107
    .line 108
    const/high16 v14, 0x41180000    # 9.5f

    .line 109
    .line 110
    invoke-virtual {v4, v13, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v15, 0x40200000    # 2.5f

    .line 114
    .line 115
    const v2, 0x4040a3d7    # 3.01f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v15, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v2, 0x41680000    # 14.5f

    .line 122
    .line 123
    const/high16 v15, 0x41000000    # 8.0f

    .line 124
    .line 125
    invoke-virtual {v4, v2, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v2, 0x40900000    # 4.5f

    .line 129
    .line 130
    const/high16 v6, 0x40c00000    # 6.0f

    .line 131
    .line 132
    invoke-virtual {v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v2, 0x40a00000    # 5.0f

    .line 136
    .line 137
    invoke-virtual {v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v6, 0x40600000    # 3.5f

    .line 141
    .line 142
    const/high16 v2, -0x3f700000    # -4.5f

    .line 143
    .line 144
    invoke-virtual {v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/high16 v4, 0x41680000    # 14.5f

    .line 155
    .line 156
    const/16 v16, 0x3800

    .line 157
    .line 158
    const/high16 v6, 0x40800000    # 4.0f

    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    move/from16 v20, v4

    .line 163
    .line 164
    const-string v4, ""

    .line 165
    .line 166
    move/from16 v21, v6

    .line 167
    .line 168
    const v6, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    move/from16 v22, v7

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    move/from16 v23, v8

    .line 175
    .line 176
    const v8, 0x3e99999a    # 0.3f

    .line 177
    .line 178
    .line 179
    move/from16 v24, v9

    .line 180
    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    move/from16 v25, v12

    .line 184
    .line 185
    const/high16 v12, 0x3f800000    # 1.0f

    .line 186
    .line 187
    move/from16 v26, v13

    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    move/from16 v27, v14

    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    move/from16 v28, v15

    .line 194
    .line 195
    const/4 v15, 0x0

    .line 196
    move-object/from16 v29, v0

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40000000    # 2.0f

    .line 229
    .line 230
    const/high16 v2, 0x41a00000    # 20.0f

    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v6, 0x40800000    # 4.0f

    .line 236
    .line 237
    invoke-virtual {v12, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x40000000    # -2.0f

    .line 241
    .line 242
    const/high16 v18, 0x40000000    # 2.0f

    .line 243
    .line 244
    const v13, -0x40733333    # -1.1f

    .line 245
    .line 246
    .line 247
    const/high16 v15, -0x40000000    # -2.0f

    .line 248
    .line 249
    const v16, 0x3f666666    # 0.9f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x41900000    # 18.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, -0x3f800000    # -4.0f

    .line 261
    .line 262
    invoke-virtual {v12, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41600000    # 14.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x40000000    # 2.0f

    .line 271
    .line 272
    const/high16 v18, -0x40000000    # -2.0f

    .line 273
    .line 274
    const v13, 0x3f8ccccd    # 1.1f

    .line 275
    .line 276
    .line 277
    const/high16 v15, 0x40000000    # 2.0f

    .line 278
    .line 279
    const v16, -0x4099999a    # -0.9f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41b00000    # 22.0f

    .line 286
    .line 287
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, -0x40000000    # -2.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x40733333    # -1.1f

    .line 294
    .line 295
    .line 296
    const v15, -0x4099999a    # -0.9f

    .line 297
    .line 298
    .line 299
    const/high16 v16, -0x40000000    # -2.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x41800000    # 16.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v2, 0x40a570a4    # 5.17f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v2, 0x41895c29    # 17.17f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v2, 0x41000000    # 8.0f

    .line 339
    .line 340
    const/high16 v4, 0x41680000    # 14.5f

    .line 341
    .line 342
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x41300000    # 11.0f

    .line 346
    .line 347
    const v4, 0x414828f6    # 12.51f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x41180000    # 9.5f

    .line 354
    .line 355
    const/high16 v4, 0x41080000    # 8.5f

    .line 356
    .line 357
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x40a00000    # 5.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/16 v16, 0x3800

    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    const-string v4, ""

    .line 380
    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    const/high16 v8, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/high16 v12, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v14, 0x0

    .line 389
    const/4 v15, 0x0

    .line 390
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sput-object v0, Landroidx/compose/material/icons/twotone/MmsKt;->_mms:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v0
.end method
