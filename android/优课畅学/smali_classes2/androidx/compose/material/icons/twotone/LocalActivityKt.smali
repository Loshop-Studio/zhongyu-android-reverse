.class public final Landroidx/compose/material/icons/twotone/LocalActivityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalActivity(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalActivityKt;->_localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalActivity"

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
    const v4, 0x408051ec    # 4.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x4108a3d7    # 8.54f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/high16 v26, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v21, 0x40a66666    # 5.2f

    .line 84
    .line 85
    .line 86
    const v22, 0x4113ae14    # 9.23f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x40c00000    # 6.0f

    .line 90
    .line 91
    const v24, 0x412851ec    # 10.52f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, -0x40b0a3d7    # -0.81f

    .line 100
    .line 101
    .line 102
    const v6, 0x405d70a4    # 3.46f

    .line 103
    .line 104
    .line 105
    const v7, 0x403147ae    # 2.77f

    .line 106
    .line 107
    .line 108
    const/high16 v8, -0x40000000    # -2.0f

    .line 109
    .line 110
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41900000    # 18.0f

    .line 114
    .line 115
    const/high16 v6, 0x40800000    # 4.0f

    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41800000    # 16.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, -0x3fdd70a4    # -2.54f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, -0x40000000    # -2.0f

    .line 132
    .line 133
    const v26, -0x3fa28f5c    # -3.46f

    .line 134
    .line 135
    .line 136
    const v21, -0x4067ae14    # -1.19f

    .line 137
    .line 138
    .line 139
    const v22, -0x40cf5c29    # -0.69f

    .line 140
    .line 141
    .line 142
    const/high16 v23, -0x40000000    # -2.0f

    .line 143
    .line 144
    const v24, -0x400147ae    # -1.99f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, -0x3fceb852    # -2.77f

    .line 151
    .line 152
    .line 153
    const v6, -0x3fa28f5c    # -3.46f

    .line 154
    .line 155
    .line 156
    const v7, 0x3f4f5c29    # 0.81f

    .line 157
    .line 158
    .line 159
    const/high16 v8, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual {v2, v7, v4, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x40c00000    # 6.0f

    .line 165
    .line 166
    const/high16 v6, 0x41a00000    # 20.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v6, 0x40800000    # 4.0f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x3c23d70a    # 0.01f

    .line 177
    .line 178
    .line 179
    const v6, 0x40228f5c    # 2.54f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x412bae14    # 10.73f

    .line 189
    .line 190
    .line 191
    const v6, 0x4123851f    # 10.22f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x40e00000    # 7.0f

    .line 198
    .line 199
    const/high16 v6, 0x41400000    # 12.0f

    .line 200
    .line 201
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x3fa147ae    # 1.26f

    .line 205
    .line 206
    .line 207
    const v6, 0x404eb852    # 3.23f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x3e4ccccd    # 0.2f

    .line 214
    .line 215
    .line 216
    const v6, 0x405e147b    # 3.47f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x400ccccd    # 2.2f

    .line 223
    .line 224
    .line 225
    const v6, -0x3fd3d70a    # -2.69f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, 0x3f63d70a    # 0.89f

    .line 232
    .line 233
    .line 234
    const v6, 0x4057ae14    # 3.37f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x4161eb85    # 14.12f

    .line 241
    .line 242
    .line 243
    const/high16 v6, 0x41400000    # 12.0f

    .line 244
    .line 245
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x41111eb8    # 9.07f

    .line 249
    .line 250
    .line 251
    const/high16 v6, 0x41800000    # 16.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x3f6147ae    # 0.88f

    .line 257
    .line 258
    .line 259
    const v6, -0x3fa851ec    # -3.37f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, -0x3ff33333    # -2.2f

    .line 266
    .line 267
    .line 268
    const v6, -0x3fd3d70a    # -2.69f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, -0x41a8f5c3    # -0.21f

    .line 275
    .line 276
    .line 277
    const v6, 0x405e147b    # 3.47f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const/16 v16, 0x3800

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const v6, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const v8, 0x3e99999a    # 0.3f

    .line 298
    .line 299
    .line 300
    const/4 v7, 0x0

    .line 301
    const/high16 v9, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/high16 v12, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const/4 v14, 0x0

    .line 307
    const/4 v15, 0x0

    .line 308
    const-string v4, ""

    .line 309
    .line 310
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 320
    .line 321
    .line 322
    move-result-wide v6

    .line 323
    const/4 v0, 0x0

    .line 324
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41a00000    # 20.0f

    .line 341
    .line 342
    const/high16 v2, 0x40800000    # 4.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40800000    # 4.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, -0x400147ae    # -1.99f

    .line 353
    .line 354
    .line 355
    const/high16 v18, 0x40000000    # 2.0f

    .line 356
    .line 357
    const v13, -0x40733333    # -1.1f

    .line 358
    .line 359
    .line 360
    const v15, -0x400147ae    # -1.99f

    .line 361
    .line 362
    .line 363
    const v16, 0x3f666666    # 0.9f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3ffeb852    # 1.99f

    .line 373
    .line 374
    .line 375
    const v13, 0x3f8ccccd    # 1.1f

    .line 376
    .line 377
    .line 378
    const v15, 0x3ffeb852    # 1.99f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x409c28f6    # -0.89f

    .line 385
    .line 386
    .line 387
    const/high16 v2, -0x40000000    # -2.0f

    .line 388
    .line 389
    const/high16 v4, 0x40000000    # 2.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x40800000    # 4.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40000000    # 2.0f

    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, 0x3f8ccccd    # 1.1f

    .line 403
    .line 404
    .line 405
    const v15, 0x3f666666    # 0.9f

    .line 406
    .line 407
    .line 408
    const/high16 v16, 0x40000000    # 2.0f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41800000    # 16.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v18, -0x40000000    # -2.0f

    .line 419
    .line 420
    const v13, 0x3f8ccccd    # 1.1f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/high16 v15, 0x40000000    # 2.0f

    .line 425
    .line 426
    const v16, -0x4099999a    # -0.9f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, -0x3f800000    # -4.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, -0x40000000    # -2.0f

    .line 438
    .line 439
    const v13, -0x40733333    # -1.1f

    .line 440
    .line 441
    .line 442
    const/high16 v15, -0x40000000    # -2.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x3f666666    # 0.9f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41b00000    # 22.0f

    .line 454
    .line 455
    const/high16 v2, 0x40c00000    # 6.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const v14, -0x40733333    # -1.1f

    .line 462
    .line 463
    .line 464
    const v15, -0x4099999a    # -0.9f

    .line 465
    .line 466
    .line 467
    const/high16 v16, -0x40000000    # -2.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x4108a3d7    # 8.54f

    .line 476
    .line 477
    .line 478
    const/high16 v2, 0x41a00000    # 20.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v18, 0x405d70a4    # 3.46f

    .line 484
    .line 485
    .line 486
    const v13, -0x4067ae14    # -1.19f

    .line 487
    .line 488
    .line 489
    const v14, 0x3f30a3d7    # 0.69f

    .line 490
    .line 491
    .line 492
    const/high16 v15, -0x40000000    # -2.0f

    .line 493
    .line 494
    const v16, 0x3ffeb852    # 1.99f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x3f4f5c29    # 0.81f

    .line 501
    .line 502
    .line 503
    const v2, 0x405d70a4    # 3.46f

    .line 504
    .line 505
    .line 506
    const v4, 0x403147ae    # 2.77f

    .line 507
    .line 508
    .line 509
    const/high16 v6, 0x40000000    # 2.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41900000    # 18.0f

    .line 515
    .line 516
    const/high16 v2, 0x41a00000    # 20.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v2, 0x40800000    # 4.0f

    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x3fdd70a4    # -2.54f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x40000000    # 2.0f

    .line 533
    .line 534
    const v18, -0x3fa28f5c    # -3.46f

    .line 535
    .line 536
    .line 537
    const v13, 0x3f9851ec    # 1.19f

    .line 538
    .line 539
    .line 540
    const v14, -0x40cf5c29    # -0.69f

    .line 541
    .line 542
    .line 543
    const/high16 v15, 0x40000000    # 2.0f

    .line 544
    .line 545
    const v16, -0x400147ae    # -1.99f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x400147ae    # -1.99f

    .line 552
    .line 553
    .line 554
    const/4 v13, 0x0

    .line 555
    const v14, -0x40428f5c    # -1.48f

    .line 556
    .line 557
    .line 558
    const v15, -0x40b33333    # -0.8f

    .line 559
    .line 560
    .line 561
    const v16, -0x3fceb852    # -2.77f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40c00000    # 6.0f

    .line 568
    .line 569
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x41800000    # 16.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x40228f5c    # 2.54f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x41111eb8    # 9.07f

    .line 587
    .line 588
    .line 589
    const/high16 v2, 0x41800000    # 16.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x4161eb85    # 14.12f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x41400000    # 12.0f

    .line 598
    .line 599
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x416ee148    # 14.93f

    .line 603
    .line 604
    .line 605
    const/high16 v2, 0x41800000    # 16.0f

    .line 606
    .line 607
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, -0x409c28f6    # -0.89f

    .line 611
    .line 612
    .line 613
    const v2, -0x3fa8f5c3    # -3.36f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x402c28f6    # 2.69f

    .line 620
    .line 621
    .line 622
    const v2, -0x3ff33333    # -2.2f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, -0x3fa1eb85    # -3.47f

    .line 629
    .line 630
    .line 631
    const v2, -0x41a8f5c3    # -0.21f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x40e00000    # 7.0f

    .line 638
    .line 639
    const/high16 v2, 0x41400000    # 12.0f

    .line 640
    .line 641
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, -0x405d70a4    # -1.27f

    .line 645
    .line 646
    .line 647
    const v2, 0x404e147b    # 3.22f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x3fa1eb85    # -3.47f

    .line 654
    .line 655
    .line 656
    const v2, 0x3e570a3d    # 0.21f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x402c28f6    # 2.69f

    .line 663
    .line 664
    .line 665
    const v2, 0x400ccccd    # 2.2f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    const/16 v16, 0x3800

    .line 679
    .line 680
    const/16 v17, 0x0

    .line 681
    .line 682
    const/high16 v6, 0x3f800000    # 1.0f

    .line 683
    .line 684
    const/high16 v8, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const/high16 v12, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    const/4 v15, 0x0

    .line 691
    const-string v4, ""

    .line 692
    .line 693
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalActivityKt;->_localActivity:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 702
    .line 703
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    return-object v0
.end method
