.class public final Landroidx/compose/material/icons/twotone/Looks3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _looks3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLooks3(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Looks3Kt;->_looks3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Looks3"

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41980000    # 19.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41600000    # 14.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41700000    # 15.0f

    .line 101
    .line 102
    const/high16 v6, 0x41100000    # 9.0f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40800000    # 4.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, -0x40000000    # -2.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40000000    # 2.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41500000    # 13.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41100000    # 9.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x40e00000    # 7.0f

    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40800000    # 4.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x40000000    # 2.0f

    .line 149
    .line 150
    const/high16 v26, 0x40000000    # 2.0f

    .line 151
    .line 152
    const v21, 0x3f8ccccd    # 1.1f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const/high16 v23, 0x40000000    # 2.0f

    .line 158
    .line 159
    const v24, 0x3f63d70a    # 0.89f

    .line 160
    .line 161
    .line 162
    move-object/from16 v20, v2

    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, -0x40400000    # -1.5f

    .line 173
    .line 174
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 175
    .line 176
    const/16 v21, 0x0

    .line 177
    .line 178
    const v22, 0x3f547ae1    # 0.83f

    .line 179
    .line 180
    .line 181
    const v23, -0x40d47ae1    # -0.67f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 190
    .line 191
    const v21, 0x3f547ae1    # 0.83f

    .line 192
    .line 193
    .line 194
    const/16 v22, 0x0

    .line 195
    .line 196
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 197
    .line 198
    const v24, 0x3f2b851f    # 0.67f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41700000    # 15.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, -0x40000000    # -2.0f

    .line 210
    .line 211
    const/high16 v26, 0x40000000    # 2.0f

    .line 212
    .line 213
    const/16 v21, 0x0

    .line 214
    .line 215
    const v22, 0x3f8e147b    # 1.11f

    .line 216
    .line 217
    .line 218
    const v23, -0x4099999a    # -0.9f

    .line 219
    .line 220
    .line 221
    const/high16 v24, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41880000    # 17.0f

    .line 227
    .line 228
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, -0x40000000    # -2.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const/16 v16, 0x3800

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    const v6, 0x3e99999a    # 0.3f

    .line 248
    .line 249
    .line 250
    const v8, 0x3e99999a    # 0.3f

    .line 251
    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    const/high16 v9, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/high16 v12, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    const/4 v14, 0x0

    .line 260
    const/4 v15, 0x0

    .line 261
    const-string v4, ""

    .line 262
    .line 263
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40400000    # 3.0f

    .line 294
    .line 295
    const/high16 v2, 0x41980000    # 19.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x40a00000    # 5.0f

    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, -0x40000000    # -2.0f

    .line 306
    .line 307
    const/high16 v18, 0x40000000    # 2.0f

    .line 308
    .line 309
    const v13, -0x40733333    # -1.1f

    .line 310
    .line 311
    .line 312
    const/high16 v15, -0x40000000    # -2.0f

    .line 313
    .line 314
    const v16, 0x3f666666    # 0.9f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41600000    # 14.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40000000    # 2.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, 0x3f8ccccd    # 1.1f

    .line 329
    .line 330
    .line 331
    const v15, 0x3f666666    # 0.9f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x40000000    # 2.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v18, -0x40000000    # -2.0f

    .line 343
    .line 344
    const v13, 0x3f8ccccd    # 1.1f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const/high16 v15, 0x40000000    # 2.0f

    .line 349
    .line 350
    const v16, -0x4099999a    # -0.9f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41a80000    # 21.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40000000    # -2.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, -0x40733333    # -1.1f

    .line 365
    .line 366
    .line 367
    const v15, -0x4099999a    # -0.9f

    .line 368
    .line 369
    .line 370
    const/high16 v16, -0x40000000    # -2.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41980000    # 19.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x40a00000    # 5.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41600000    # 14.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41700000    # 15.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, -0x40400000    # -1.5f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, -0x40400000    # -1.5f

    .line 413
    .line 414
    const/high16 v18, -0x40400000    # -1.5f

    .line 415
    .line 416
    const v14, -0x40ab851f    # -0.83f

    .line 417
    .line 418
    .line 419
    const v15, -0x40d47ae1    # -0.67f

    .line 420
    .line 421
    .line 422
    const/high16 v16, -0x40400000    # -1.5f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 428
    .line 429
    const v13, 0x3f547ae1    # 0.83f

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 434
    .line 435
    const v16, -0x40d47ae1    # -0.67f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41700000    # 15.0f

    .line 442
    .line 443
    const/high16 v2, 0x41100000    # 9.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, -0x40000000    # -2.0f

    .line 449
    .line 450
    const/high16 v18, -0x40000000    # -2.0f

    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const v14, -0x4071eb85    # -1.11f

    .line 454
    .line 455
    .line 456
    const v15, -0x4099999a    # -0.9f

    .line 457
    .line 458
    .line 459
    const/high16 v16, -0x40000000    # -2.0f

    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x40e00000    # 7.0f

    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x40800000    # 4.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40000000    # 2.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40000000    # 2.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41700000    # 15.0f

    .line 501
    .line 502
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40800000    # 4.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x40000000    # 2.0f

    .line 516
    .line 517
    const v13, 0x3f8ccccd    # 1.1f

    .line 518
    .line 519
    .line 520
    const/4 v14, 0x0

    .line 521
    const/high16 v15, 0x40000000    # 2.0f

    .line 522
    .line 523
    const v16, -0x409c28f6    # -0.89f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    const/16 v16, 0x3800

    .line 537
    .line 538
    const/16 v17, 0x0

    .line 539
    .line 540
    const/high16 v6, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v8, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const/high16 v12, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    const-string v4, ""

    .line 550
    .line 551
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, Landroidx/compose/material/icons/twotone/Looks3Kt;->_looks3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-object v0
.end method
