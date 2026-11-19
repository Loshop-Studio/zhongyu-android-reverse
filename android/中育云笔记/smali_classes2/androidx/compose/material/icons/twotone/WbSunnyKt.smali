.class public final Landroidx/compose/material/icons/twotone/WbSunnyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbSunny(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WbSunnyKt;->_wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WbSunny"

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
    const/high16 v4, 0x40f00000    # 7.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x3fe51eb8    # 1.79f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x3fe51eb8    # 1.79f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40800000    # 4.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x401ae148    # -1.79f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f800000    # -4.0f

    .line 108
    .line 109
    const/high16 v7, 0x40800000    # 4.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/16 v16, 0x3800

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const v6, 0x3e99999a    # 0.3f

    .line 129
    .line 130
    .line 131
    const v8, 0x3e99999a    # 0.3f

    .line 132
    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    const/high16 v9, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v12, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    const-string v4, ""

    .line 143
    .line 144
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 145
    .line 146
    .line 147
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 152
    .line 153
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    const/4 v0, 0x0

    .line 158
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const v0, 0x40aae148    # 5.34f

    .line 175
    .line 176
    .line 177
    const/high16 v2, 0x40c80000    # 6.25f

    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x3fb5c28f    # 1.42f

    .line 183
    .line 184
    .line 185
    const v2, -0x404b851f    # -1.41f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, -0x4019999a    # -1.8f

    .line 192
    .line 193
    .line 194
    const v2, -0x401ae148    # -1.79f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x3fb47ae1    # 1.41f

    .line 201
    .line 202
    .line 203
    const v2, -0x404b851f    # -1.41f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x41280000    # 10.5f

    .line 213
    .line 214
    const/high16 v2, 0x3f800000    # 1.0f

    .line 215
    .line 216
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x40400000    # 3.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x40000000    # 2.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x41480000    # 12.5f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x3f0ccccd    # 0.55f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x41300000    # 11.0f

    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41500000    # 13.0f

    .line 251
    .line 252
    const/high16 v2, 0x40600000    # 3.5f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, -0x40000000    # -2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x419547ae    # 18.66f

    .line 266
    .line 267
    .line 268
    const v2, 0x40c828f6    # 6.255f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x404be76d    # -1.407f

    .line 275
    .line 276
    .line 277
    const v2, -0x404b851f    # -1.41f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, -0x401ae148    # -1.79f

    .line 284
    .line 285
    .line 286
    const v2, 0x3fe51eb8    # 1.79f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3fb3f7cf    # 1.406f

    .line 293
    .line 294
    .line 295
    const v2, 0x3fb47ae1    # 1.41f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x4189eb85    # 17.24f

    .line 305
    .line 306
    .line 307
    const v2, 0x419147ae    # 18.16f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x3fe66666    # 1.8f

    .line 314
    .line 315
    .line 316
    const v2, 0x3fe51eb8    # 1.79f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3fb47ae1    # 1.41f

    .line 323
    .line 324
    .line 325
    const v2, -0x404b851f    # -1.41f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x4019999a    # -1.8f

    .line 332
    .line 333
    .line 334
    const v2, -0x401ae148    # -1.79f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x41a00000    # 20.0f

    .line 344
    .line 345
    const/high16 v2, 0x41280000    # 10.5f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x40400000    # 3.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40000000    # 2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40b00000    # 5.5f

    .line 369
    .line 370
    const/high16 v2, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x3f400000    # -6.0f

    .line 376
    .line 377
    const/high16 v18, 0x40c00000    # 6.0f

    .line 378
    .line 379
    const v13, -0x3fac28f6    # -3.31f

    .line 380
    .line 381
    .line 382
    const/high16 v15, -0x3f400000    # -6.0f

    .line 383
    .line 384
    const v16, 0x402c28f6    # 2.69f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x402c28f6    # 2.69f

    .line 391
    .line 392
    .line 393
    const/high16 v2, 0x40c00000    # 6.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x3fd3d70a    # -2.69f

    .line 399
    .line 400
    .line 401
    const/high16 v2, -0x3f400000    # -6.0f

    .line 402
    .line 403
    const/high16 v4, 0x40c00000    # 6.0f

    .line 404
    .line 405
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41780000    # 15.5f

    .line 415
    .line 416
    const/high16 v2, 0x41400000    # 12.0f

    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x3f800000    # -4.0f

    .line 422
    .line 423
    const/high16 v18, -0x3f800000    # -4.0f

    .line 424
    .line 425
    const v13, -0x3ff28f5c    # -2.21f

    .line 426
    .line 427
    .line 428
    const/high16 v15, -0x3f800000    # -4.0f

    .line 429
    .line 430
    const v16, -0x401ae148    # -1.79f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3fe51eb8    # 1.79f

    .line 437
    .line 438
    .line 439
    const/high16 v2, -0x3f800000    # -4.0f

    .line 440
    .line 441
    const/high16 v4, 0x40800000    # 4.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x40800000    # 4.0f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x401ae148    # -1.79f

    .line 452
    .line 453
    .line 454
    const/high16 v2, -0x3f800000    # -4.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x419c0000    # 19.5f

    .line 463
    .line 464
    const/high16 v2, 0x41300000    # 11.0f

    .line 465
    .line 466
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x40000000    # 2.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x403ccccd    # 2.95f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, -0x40000000    # -2.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x40633333    # 3.55f

    .line 489
    .line 490
    .line 491
    const v2, 0x419451ec    # 18.54f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3fb47ae1    # 1.41f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x4019999a    # -1.8f

    .line 504
    .line 505
    .line 506
    const v2, 0x3fe51eb8    # 1.79f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, -0x404b851f    # -1.41f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const/16 v16, 0x3800

    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v8, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const/high16 v12, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v13, 0x0

    .line 537
    const/4 v15, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    sput-object v0, Landroidx/compose/material/icons/twotone/WbSunnyKt;->_wbSunny:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    return-object v0
.end method
