.class public final Landroidx/compose/material/icons/twotone/MoreKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _more:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMore(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MoreKt;->_more:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.More"

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
    const v4, 0x40e1eb85    # 7.06f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x4019999a    # 2.4f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x409570a4    # 4.67f

    .line 87
    .line 88
    .line 89
    const/high16 v6, 0x40e00000    # 7.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41980000    # 19.0f

    .line 95
    .line 96
    const/high16 v6, 0x41b00000    # 22.0f

    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40a00000    # 5.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x40e1eb85    # 7.06f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x40a00000    # 5.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v25, 0x0

    .line 115
    .line 116
    const/16 v26, 0x0

    .line 117
    .line 118
    const v21, 0x3c23d70a    # 0.01f

    .line 119
    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const v23, 0x3c23d70a    # 0.01f

    .line 124
    .line 125
    .line 126
    const/16 v24, 0x0

    .line 127
    .line 128
    move-object/from16 v20, v2

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41280000    # 10.5f

    .line 137
    .line 138
    const/high16 v6, 0x41980000    # 19.0f

    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 144
    .line 145
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    const v21, 0x3f547ae1    # 0.83f

    .line 148
    .line 149
    .line 150
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 151
    .line 152
    const v24, 0x3f2b851f    # 0.67f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x40d47ae1    # -0.67f

    .line 159
    .line 160
    .line 161
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 162
    .line 163
    const/high16 v7, -0x40400000    # -1.5f

    .line 164
    .line 165
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v6, -0x40400000    # -1.5f

    .line 169
    .line 170
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x3f2b851f    # 0.67f

    .line 174
    .line 175
    .line 176
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 177
    .line 178
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x41600000    # 14.0f

    .line 185
    .line 186
    const/high16 v6, 0x41280000    # 10.5f

    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, -0x40d47ae1    # -0.67f

    .line 195
    .line 196
    .line 197
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v6, -0x40400000    # -1.5f

    .line 203
    .line 204
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, 0x3f2b851f    # 0.67f

    .line 208
    .line 209
    .line 210
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x41100000    # 9.0f

    .line 219
    .line 220
    const/high16 v6, 0x41280000    # 10.5f

    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, -0x40d47ae1    # -0.67f

    .line 229
    .line 230
    .line 231
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 232
    .line 233
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v6, -0x40400000    # -1.5f

    .line 237
    .line 238
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x3f2b851f    # 0.67f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/16 v16, 0x3800

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    const v6, 0x3e99999a    # 0.3f

    .line 261
    .line 262
    .line 263
    const v8, 0x3e99999a    # 0.3f

    .line 264
    .line 265
    .line 266
    const/4 v7, 0x0

    .line 267
    const/high16 v9, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/high16 v12, 0x3f800000    # 1.0f

    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    const-string v4, ""

    .line 275
    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/4 v2, 0x0

    .line 290
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x40400000    # 3.0f

    .line 307
    .line 308
    const/high16 v6, 0x41b00000    # 22.0f

    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v6, 0x40e00000    # 7.0f

    .line 314
    .line 315
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v25, -0x40347ae1    # -1.59f

    .line 319
    .line 320
    .line 321
    const v26, 0x3f6147ae    # 0.88f

    .line 322
    .line 323
    .line 324
    const v21, -0x40cf5c29    # -0.69f

    .line 325
    .line 326
    .line 327
    const v23, -0x40628f5c    # -1.23f

    .line 328
    .line 329
    .line 330
    const v24, 0x3eb33333    # 0.35f

    .line 331
    .line 332
    .line 333
    move-object/from16 v20, v2

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/4 v4, 0x0

    .line 339
    const/high16 v6, 0x41400000    # 12.0f

    .line 340
    .line 341
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x40ad1eb8    # 5.41f

    .line 345
    .line 346
    .line 347
    const v6, 0x4101c28f    # 8.11f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v25, 0x3fd47ae1    # 1.66f

    .line 354
    .line 355
    .line 356
    const v26, 0x3f63d70a    # 0.89f

    .line 357
    .line 358
    .line 359
    const v21, 0x3eb851ec    # 0.36f

    .line 360
    .line 361
    .line 362
    const v22, 0x3f07ae14    # 0.53f

    .line 363
    .line 364
    .line 365
    const v23, 0x3f7851ec    # 0.97f

    .line 366
    .line 367
    .line 368
    const v24, 0x3f63d70a    # 0.89f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x41a80000    # 21.0f

    .line 375
    .line 376
    const/high16 v6, 0x41b00000    # 22.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/high16 v26, -0x40000000    # -2.0f

    .line 384
    .line 385
    const v21, 0x3f8ccccd    # 1.1f

    .line 386
    .line 387
    .line 388
    const/16 v22, 0x0

    .line 389
    .line 390
    const/high16 v23, 0x40000000    # 2.0f

    .line 391
    .line 392
    const v24, -0x4099999a    # -0.9f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x41c00000    # 24.0f

    .line 399
    .line 400
    const/high16 v6, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v25, -0x40000000    # -2.0f

    .line 406
    .line 407
    const/16 v21, 0x0

    .line 408
    .line 409
    const v22, -0x40733333    # -1.1f

    .line 410
    .line 411
    .line 412
    const v23, -0x4099999a    # -0.9f

    .line 413
    .line 414
    .line 415
    const/high16 v24, -0x40000000    # -2.0f

    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x41980000    # 19.0f

    .line 424
    .line 425
    const/high16 v6, 0x41b00000    # 22.0f

    .line 426
    .line 427
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x40e23d71    # 7.07f

    .line 431
    .line 432
    .line 433
    const/high16 v6, 0x41980000    # 19.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x4019999a    # 2.4f

    .line 439
    .line 440
    .line 441
    const/high16 v6, 0x41400000    # 12.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v4, 0x40951eb8    # 4.66f

    .line 447
    .line 448
    .line 449
    const/high16 v6, -0x3f200000    # -7.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x40a00000    # 5.0f

    .line 455
    .line 456
    const/high16 v6, 0x41b00000    # 22.0f

    .line 457
    .line 458
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v4, 0x41600000    # 14.0f

    .line 462
    .line 463
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 488
    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    const/4 v2, 0x0

    .line 494
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x41100000    # 9.0f

    .line 511
    .line 512
    const/high16 v6, 0x41400000    # 12.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/4 v4, 0x0

    .line 518
    const/high16 v6, -0x40400000    # -1.5f

    .line 519
    .line 520
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v26, 0x40400000    # 3.0f

    .line 524
    .line 525
    const/16 v27, 0x0

    .line 526
    .line 527
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 528
    .line 529
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 530
    .line 531
    const/16 v23, 0x0

    .line 532
    .line 533
    const/16 v24, 0x1

    .line 534
    .line 535
    const/16 v25, 0x1

    .line 536
    .line 537
    move-object/from16 v20, v2

    .line 538
    .line 539
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 543
    .line 544
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const/high16 v6, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v7, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 564
    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 566
    .line 567
    .line 568
    move-result-wide v6

    .line 569
    const/4 v2, 0x0

    .line 570
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 574
    .line 575
    .line 576
    move-result v10

    .line 577
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 578
    .line 579
    .line 580
    move-result v11

    .line 581
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 584
    .line 585
    .line 586
    const/high16 v4, 0x41600000    # 14.0f

    .line 587
    .line 588
    const/high16 v6, 0x41400000    # 12.0f

    .line 589
    .line 590
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/4 v4, 0x0

    .line 594
    const/high16 v6, -0x40400000    # -1.5f

    .line 595
    .line 596
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v26, 0x40400000    # 3.0f

    .line 600
    .line 601
    move-object/from16 v20, v2

    .line 602
    .line 603
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 607
    .line 608
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const/high16 v6, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 628
    .line 629
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 630
    .line 631
    .line 632
    move-result-wide v6

    .line 633
    const/4 v0, 0x0

    .line 634
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 638
    .line 639
    .line 640
    move-result v10

    .line 641
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 642
    .line 643
    .line 644
    move-result v11

    .line 645
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41980000    # 19.0f

    .line 651
    .line 652
    const/high16 v2, 0x41400000    # 12.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/4 v0, 0x0

    .line 658
    const/high16 v2, -0x40400000    # -1.5f

    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v18, 0x40400000    # 3.0f

    .line 664
    .line 665
    const/16 v19, 0x0

    .line 666
    .line 667
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 668
    .line 669
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 670
    .line 671
    const/16 v16, 0x1

    .line 672
    .line 673
    const/16 v17, 0x1

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 679
    .line 680
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    const/16 v16, 0x3800

    .line 688
    .line 689
    const/16 v17, 0x0

    .line 690
    .line 691
    const/high16 v6, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/4 v7, 0x0

    .line 694
    const/high16 v12, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const/4 v14, 0x0

    .line 698
    const-string v4, ""

    .line 699
    .line 700
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    sput-object v0, Landroidx/compose/material/icons/twotone/MoreKt;->_more:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-object v0
.end method

.method public static synthetic getMore$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
