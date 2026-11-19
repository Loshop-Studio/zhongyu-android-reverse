.class public final Landroidx/compose/material/icons/twotone/SnowmobileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _snowmobile:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSnowmobile(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SnowmobileKt;->_snowmobile:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Snowmobile"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3f29999a    # -6.7f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x3ff147ae    # -2.23f

    .line 84
    .line 85
    .line 86
    const v6, -0x3f11999a    # -7.45f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v4, -0x40e147ae    # -0.62f

    .line 93
    .line 94
    .line 95
    const v6, 0x3e9eb852    # 0.31f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41400000    # 12.0f

    .line 102
    .line 103
    const v6, 0x4139999a    # 11.6f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, -0x3fc3d70a    # -2.94f

    .line 110
    .line 111
    .line 112
    const v6, 0x407b851f    # 3.93f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v25, 0x4088a3d7    # 4.27f

    .line 119
    .line 120
    .line 121
    const v26, 0x40847ae1    # 4.14f

    .line 122
    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const v23, 0x407147ae    # 3.77f

    .line 129
    .line 130
    .line 131
    const v24, 0x405c28f6    # 3.44f

    .line 132
    .line 133
    .line 134
    move-object/from16 v20, v2

    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x41880000    # 17.0f

    .line 140
    .line 141
    const/high16 v26, 0x41600000    # 14.0f

    .line 142
    .line 143
    const v21, 0x419e6666    # 19.8f

    .line 144
    .line 145
    .line 146
    const v22, 0x41533333    # 13.2f

    .line 147
    .line 148
    .line 149
    const v23, 0x4195999a    # 18.7f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x41600000    # 14.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const/16 v16, 0x3800

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const v6, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const v8, 0x3e99999a    # 0.3f

    .line 172
    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const/high16 v9, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/high16 v12, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v15, 0x0

    .line 182
    const-string v4, ""

    .line 183
    .line 184
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x41b00000    # 22.0f

    .line 215
    .line 216
    const/high16 v2, 0x41880000    # 17.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, -0x40800000    # -1.0f

    .line 222
    .line 223
    const/high16 v18, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const v14, 0x3f0ccccd    # 0.55f

    .line 226
    .line 227
    .line 228
    const v15, -0x4119999a    # -0.45f

    .line 229
    .line 230
    .line 231
    const/high16 v16, 0x3f800000    # 1.0f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x41d1eb85    # -0.17f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, -0x3ff33333    # -2.2f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x41b00000    # 22.0f

    .line 249
    .line 250
    const/high16 v18, 0x41500000    # 13.0f

    .line 251
    .line 252
    const v13, 0x41a4a3d7    # 20.58f

    .line 253
    .line 254
    .line 255
    const v14, 0x4175eb85    # 15.37f

    .line 256
    .line 257
    .line 258
    const/high16 v15, 0x41b00000    # 22.0f

    .line 259
    .line 260
    const v16, 0x41666666    # 14.4f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, -0x3f000000    # -8.0f

    .line 267
    .line 268
    const/high16 v18, -0x3f000000    # -8.0f

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const/high16 v14, -0x40800000    # -1.0f

    .line 272
    .line 273
    const/high16 v15, -0x3f000000    # -8.0f

    .line 274
    .line 275
    const/high16 v16, -0x3f000000    # -8.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40100000    # 2.25f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x3f4ccccd    # 0.8f

    .line 296
    .line 297
    .line 298
    const v2, 0x3f3851ec    # 0.72f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41300000    # 11.0f

    .line 305
    .line 306
    const/high16 v2, 0x41200000    # 10.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x41100000    # 9.0f

    .line 312
    .line 313
    const/high16 v2, 0x40000000    # 2.0f

    .line 314
    .line 315
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, -0x40000000    # -2.0f

    .line 319
    .line 320
    const/high16 v2, 0x40800000    # 4.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x409147ae    # 4.54f

    .line 326
    .line 327
    .line 328
    const v2, 0x3fae147b    # 1.36f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x3fa0a3d7    # -3.49f

    .line 335
    .line 336
    .line 337
    const v2, 0x3ff0a3d7    # 1.88f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x40000000    # 2.0f

    .line 344
    .line 345
    const/high16 v18, 0x41a00000    # 20.0f

    .line 346
    .line 347
    const v13, -0x40bae148    # -0.77f

    .line 348
    .line 349
    .line 350
    const v14, 0x4189c28f    # 17.22f

    .line 351
    .line 352
    .line 353
    const v15, -0x4270a3d7    # -0.07f

    .line 354
    .line 355
    .line 356
    const/high16 v16, 0x41a00000    # 20.0f

    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x40c00000    # 6.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x40800000    # 4.0f

    .line 367
    .line 368
    const/high16 v18, -0x3f800000    # -4.0f

    .line 369
    .line 370
    const v13, 0x400d70a4    # 2.21f

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const/high16 v15, 0x40800000    # 4.0f

    .line 375
    .line 376
    const v16, -0x401ae148    # -1.79f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x40800000    # 4.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40000000    # 2.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40000000    # 2.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x40c00000    # 6.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x40400000    # 3.0f

    .line 408
    .line 409
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 410
    .line 411
    const v13, 0x3fd47ae1    # 1.66f

    .line 412
    .line 413
    .line 414
    const/high16 v15, 0x40400000    # 3.0f

    .line 415
    .line 416
    const v16, -0x40547ae1    # -1.34f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41b00000    # 22.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41000000    # 8.0f

    .line 431
    .line 432
    const/high16 v2, 0x41900000    # 18.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40000000    # 2.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x40a80000    # 5.25f

    .line 443
    .line 444
    const v2, -0x3fcae148    # -2.83f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41800000    # 16.0f

    .line 451
    .line 452
    const/high16 v2, 0x41200000    # 10.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x41000000    # 8.0f

    .line 458
    .line 459
    const/high16 v18, 0x41900000    # 18.0f

    .line 460
    .line 461
    const/high16 v13, 0x41200000    # 10.0f

    .line 462
    .line 463
    const v14, 0x4188cccd    # 17.1f

    .line 464
    .line 465
    .line 466
    const v15, 0x4111c28f    # 9.11f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x41900000    # 18.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41600000    # 14.0f

    .line 478
    .line 479
    const/high16 v2, 0x41880000    # 17.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x3f29999a    # -6.7f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x3ff147ae    # -2.23f

    .line 491
    .line 492
    .line 493
    const v2, -0x3f11999a    # -7.45f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x40e147ae    # -0.62f

    .line 500
    .line 501
    .line 502
    const v2, 0x3e9eb852    # 0.31f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41400000    # 12.0f

    .line 509
    .line 510
    const v2, 0x4139999a    # 11.6f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x3fc3d70a    # -2.94f

    .line 517
    .line 518
    .line 519
    const v2, 0x407b851f    # 3.93f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x4088a3d7    # 4.27f

    .line 526
    .line 527
    .line 528
    const v18, 0x40847ae1    # 4.14f

    .line 529
    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v14, 0x0

    .line 533
    const v15, 0x407147ae    # 3.77f

    .line 534
    .line 535
    .line 536
    const v16, 0x405c28f6    # 3.44f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41880000    # 17.0f

    .line 543
    .line 544
    const/high16 v18, 0x41600000    # 14.0f

    .line 545
    .line 546
    const v13, 0x419e6666    # 19.8f

    .line 547
    .line 548
    .line 549
    const v14, 0x41533333    # 13.2f

    .line 550
    .line 551
    .line 552
    const v15, 0x4195999a    # 18.7f

    .line 553
    .line 554
    .line 555
    const/high16 v16, 0x41600000    # 14.0f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v16, 0x3800

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v8, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v7, 0x0

    .line 576
    const/high16 v12, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const/4 v14, 0x0

    .line 580
    const/4 v15, 0x0

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sput-object v0, Landroidx/compose/material/icons/twotone/SnowmobileKt;->_snowmobile:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-object v0
.end method
