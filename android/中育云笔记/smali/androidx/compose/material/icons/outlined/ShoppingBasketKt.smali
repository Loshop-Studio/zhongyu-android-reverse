.class public final Landroidx/compose/material/icons/outlined/ShoppingBasketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShoppingBasket(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ShoppingBasketKt;->_shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ShoppingBasket"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f66b852    # -4.79f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x3f73d70a    # -4.38f

    .line 84
    .line 85
    .line 86
    const v2, -0x3f2e147b    # -6.56f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, -0x40ab851f    # -0.83f

    .line 93
    .line 94
    .line 95
    const v18, -0x4128f5c3    # -0.42f

    .line 96
    .line 97
    .line 98
    const v13, -0x41bd70a4    # -0.19f

    .line 99
    .line 100
    .line 101
    const v14, -0x4170a3d7    # -0.28f

    .line 102
    .line 103
    .line 104
    const v15, -0x40fd70a4    # -0.51f

    .line 105
    .line 106
    .line 107
    const v16, -0x4128f5c3    # -0.42f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, -0x40ab851f    # -0.83f

    .line 114
    .line 115
    .line 116
    const v2, 0x3edc28f6    # 0.43f

    .line 117
    .line 118
    .line 119
    const v4, -0x40dc28f6    # -0.64f

    .line 120
    .line 121
    .line 122
    const v6, 0x3e0f5c29    # 0.14f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x40d947ae    # 6.79f

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40800000    # -1.0f

    .line 142
    .line 143
    const/high16 v18, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const v13, -0x40f33333    # -0.55f

    .line 146
    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/high16 v15, -0x40800000    # -1.0f

    .line 150
    .line 151
    const v16, 0x3ee66666    # 0.45f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x3d23d70a    # 0.04f

    .line 158
    .line 159
    .line 160
    const v18, 0x3e8a3d71    # 0.27f

    .line 161
    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, 0x3db851ec    # 0.09f

    .line 165
    .line 166
    .line 167
    const v15, 0x3c23d70a    # 0.01f

    .line 168
    .line 169
    .line 170
    const v16, 0x3e3851ec    # 0.18f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x411451ec    # 9.27f

    .line 177
    .line 178
    .line 179
    const v2, 0x40228f5c    # 2.54f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, 0x3ff5c28f    # 1.92f

    .line 186
    .line 187
    .line 188
    const v18, 0x3fbae148    # 1.46f

    .line 189
    .line 190
    .line 191
    const v13, 0x3e6b851f    # 0.23f

    .line 192
    .line 193
    .line 194
    const v14, 0x3f570a3d    # 0.84f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const v16, 0x3fbae148    # 1.46f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41500000    # 13.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x3ff70a3d    # 1.93f

    .line 211
    .line 212
    .line 213
    const v18, -0x40451eb8    # -1.46f

    .line 214
    .line 215
    .line 216
    const v13, 0x3f6b851f    # 0.92f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const v15, 0x3fd851ec    # 1.69f

    .line 221
    .line 222
    .line 223
    const v16, -0x40e147ae    # -0.62f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x3eebae14    # -9.27f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x41b80000    # 23.0f

    .line 236
    .line 237
    const/high16 v2, 0x41200000    # 10.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, -0x40800000    # -1.0f

    .line 243
    .line 244
    const/high16 v18, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const v14, -0x40f33333    # -0.55f

    .line 248
    .line 249
    .line 250
    const v15, -0x4119999a    # -0.45f

    .line 251
    .line 252
    .line 253
    const/high16 v16, -0x40800000    # -1.0f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x4099999a    # 4.8f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x41400000    # 12.0f

    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x416ccccd    # 14.8f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x41100000    # 9.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, 0x41133333    # 9.2f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x4099999a    # 4.8f

    .line 284
    .line 285
    .line 286
    const/high16 v2, 0x41400000    # 12.0f

    .line 287
    .line 288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41940000    # 18.5f

    .line 295
    .line 296
    const/high16 v2, 0x41980000    # 19.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, -0x3eb028f6    # -12.99f

    .line 302
    .line 303
    .line 304
    const v2, 0x3c23d70a    # 0.01f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x4053d70a    # 3.31f

    .line 311
    .line 312
    .line 313
    const/high16 v2, 0x41300000    # 11.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x41a5999a    # 20.7f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x3ff33333    # -2.2f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x41000000    # 8.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41500000    # 13.0f

    .line 336
    .line 337
    const/high16 v2, 0x41400000    # 12.0f

    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, -0x40000000    # -2.0f

    .line 343
    .line 344
    const/high16 v18, 0x40000000    # 2.0f

    .line 345
    .line 346
    const v13, -0x40733333    # -1.1f

    .line 347
    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const/high16 v15, -0x40000000    # -2.0f

    .line 351
    .line 352
    const v16, 0x3f666666    # 0.9f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x3f666666    # 0.9f

    .line 359
    .line 360
    .line 361
    const/high16 v2, 0x40000000    # 2.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, -0x4099999a    # -0.9f

    .line 367
    .line 368
    .line 369
    const/high16 v2, -0x40000000    # -2.0f

    .line 370
    .line 371
    const/high16 v4, 0x40000000    # 2.0f

    .line 372
    .line 373
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    const/16 v16, 0x3800

    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const/high16 v6, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v8, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    const/high16 v9, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/high16 v12, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/4 v13, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const-string v4, ""

    .line 402
    .line 403
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    sput-object v0, Landroidx/compose/material/icons/outlined/ShoppingBasketKt;->_shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 412
    .line 413
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-object v0
.end method
