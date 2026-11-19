.class public final Landroidx/compose/material/icons/filled/EuroKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _euro:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEuro(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/EuroKt;->_euro:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Euro"

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f47ae14    # -5.76f

    .line 78
    .line 79
    .line 80
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 81
    .line 82
    const v13, -0x3fdf5c29    # -2.51f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3f6a3d71    # -4.68f

    .line 87
    .line 88
    .line 89
    const v16, -0x404a3d71    # -1.42f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x41700000    # 15.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, -0x40000000    # -2.0f

    .line 101
    .line 102
    const/high16 v2, 0x3f800000    # 1.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x410947ae    # 8.58f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x425c28f6    # -0.08f

    .line 114
    .line 115
    .line 116
    const/high16 v18, -0x40800000    # -1.0f

    .line 117
    .line 118
    const v13, -0x42b33333    # -0.05f

    .line 119
    .line 120
    .line 121
    const v14, -0x41570a3d    # -0.33f

    .line 122
    .line 123
    .line 124
    const v15, -0x425c28f6    # -0.08f

    .line 125
    .line 126
    .line 127
    const v16, -0x40d70a3d    # -0.66f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x40d47ae1    # -0.67f

    .line 134
    .line 135
    .line 136
    const v2, 0x3da3d70a    # 0.08f

    .line 137
    .line 138
    .line 139
    const/high16 v4, -0x40800000    # -1.0f

    .line 140
    .line 141
    const v6, 0x3cf5c28f    # 0.03f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41700000    # 15.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, -0x40000000    # -2.0f

    .line 153
    .line 154
    const/high16 v2, 0x3f800000    # 1.0f

    .line 155
    .line 156
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x4113d70a    # 9.24f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x41700000    # 15.0f

    .line 166
    .line 167
    const/high16 v18, 0x40b00000    # 5.5f

    .line 168
    .line 169
    const v13, 0x41251eb8    # 10.32f

    .line 170
    .line 171
    .line 172
    const v14, 0x40dd70a4    # 6.92f

    .line 173
    .line 174
    .line 175
    const/high16 v15, 0x41480000    # 12.5f

    .line 176
    .line 177
    const/high16 v16, 0x40b00000    # 5.5f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x40875c29    # 4.23f

    .line 183
    .line 184
    .line 185
    const v18, 0x3fc8f5c3    # 1.57f

    .line 186
    .line 187
    .line 188
    const v13, 0x3fce147b    # 1.61f

    .line 189
    .line 190
    .line 191
    const/4 v14, 0x0

    .line 192
    const v15, 0x4045c28f    # 3.09f

    .line 193
    .line 194
    .line 195
    const v16, 0x3f170a3d    # 0.59f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41a80000    # 21.0f

    .line 202
    .line 203
    const v2, 0x40a9999a    # 5.3f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x41700000    # 15.0f

    .line 210
    .line 211
    const/high16 v18, 0x40400000    # 3.0f

    .line 212
    .line 213
    const v13, 0x419b47ae    # 19.41f

    .line 214
    .line 215
    .line 216
    const v14, 0x4077ae14    # 3.87f

    .line 217
    .line 218
    .line 219
    const v15, 0x418a6666    # 17.3f

    .line 220
    .line 221
    .line 222
    const/high16 v16, 0x40400000    # 3.0f

    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x3ef851ec    # -8.48f

    .line 228
    .line 229
    .line 230
    const/high16 v18, 0x40c00000    # 6.0f

    .line 231
    .line 232
    const v13, -0x3f851eb8    # -3.92f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const v15, -0x3f1851ec    # -7.24f

    .line 237
    .line 238
    .line 239
    const v16, 0x4020a3d7    # 2.51f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x40400000    # 3.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x40000000    # 2.0f

    .line 251
    .line 252
    const/high16 v2, -0x40800000    # -1.0f

    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x4081eb85    # 4.06f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40c00000    # 6.0f

    .line 264
    .line 265
    const/high16 v18, 0x41400000    # 12.0f

    .line 266
    .line 267
    const v13, 0x40c0a3d7    # 6.02f

    .line 268
    .line 269
    .line 270
    const v14, 0x413547ae    # 11.33f

    .line 271
    .line 272
    .line 273
    const/high16 v15, 0x40c00000    # 6.0f

    .line 274
    .line 275
    const v16, 0x413a8f5c    # 11.66f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3f2b851f    # 0.67f

    .line 282
    .line 283
    .line 284
    const v2, 0x3d75c28f    # 0.06f

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const v6, 0x3ca3d70a    # 0.02f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40400000    # 3.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40000000    # 2.0f

    .line 301
    .line 302
    const/high16 v2, -0x40800000    # -1.0f

    .line 303
    .line 304
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x4090a3d7    # 4.52f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, 0x4107ae14    # 8.48f

    .line 314
    .line 315
    .line 316
    const/high16 v18, 0x40c00000    # 6.0f

    .line 317
    .line 318
    const v13, 0x3f9eb852    # 1.24f

    .line 319
    .line 320
    .line 321
    const v14, 0x405f5c29    # 3.49f

    .line 322
    .line 323
    .line 324
    const v15, 0x4091eb85    # 4.56f

    .line 325
    .line 326
    .line 327
    const/high16 v16, 0x40c00000    # 6.0f

    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x40c00000    # 6.0f

    .line 333
    .line 334
    const v18, -0x3feccccd    # -2.3f

    .line 335
    .line 336
    .line 337
    const v13, 0x4013d70a    # 2.31f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const v15, 0x408d1eb8    # 4.41f

    .line 342
    .line 343
    .line 344
    const v16, -0x40a147ae    # -0.87f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, -0x401c28f6    # -1.78f

    .line 351
    .line 352
    .line 353
    const v2, -0x401d70a4    # -1.77f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x41700000    # 15.0f

    .line 360
    .line 361
    const/high16 v18, 0x41940000    # 18.5f

    .line 362
    .line 363
    const v13, 0x4190b852    # 18.09f

    .line 364
    .line 365
    .line 366
    const v14, 0x418f47ae    # 17.91f

    .line 367
    .line 368
    .line 369
    const v15, 0x4184f5c3    # 16.62f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x41940000    # 18.5f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    const/16 v16, 0x3800

    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const/high16 v6, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/high16 v8, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v9, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v12, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    sput-object v0, Landroidx/compose/material/icons/filled/EuroKt;->_euro:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method
