.class public final Landroidx/compose/material/icons/filled/ScreenRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenRotation(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ScreenRotationKt;->_screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ScreenRotation"

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
    const v0, 0x4183d70a    # 16.48f

    .line 71
    .line 72
    .line 73
    const v2, 0x402147ae    # 2.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x40bf0a3d    # 5.97f

    .line 80
    .line 81
    .line 82
    const v18, 0x4107ae14    # 8.48f

    .line 83
    .line 84
    .line 85
    const v13, 0x405147ae    # 3.27f

    .line 86
    .line 87
    .line 88
    const v14, 0x3fc66666    # 1.55f

    .line 89
    .line 90
    .line 91
    const v15, 0x40b3851f    # 5.61f

    .line 92
    .line 93
    .line 94
    const v16, 0x40970a3d    # 4.72f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41400000    # 12.0f

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const v13, 0x41bb851f    # 23.44f

    .line 110
    .line 111
    .line 112
    const v14, 0x409ae148    # 4.84f

    .line 113
    .line 114
    .line 115
    const v15, 0x419251ec    # 18.29f

    .line 116
    .line 117
    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x40d70a3d    # -0.66f

    .line 124
    .line 125
    .line 126
    const v2, 0x3cf5c28f    # 0.03f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x4073d70a    # 3.81f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3faa3d71    # 1.33f

    .line 139
    .line 140
    .line 141
    const v2, -0x40570a3d    # -1.32f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x4123ae14    # 10.23f

    .line 151
    .line 152
    .line 153
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, -0x3ff851ec    # -2.12f

    .line 159
    .line 160
    .line 161
    const v13, -0x40e8f5c3    # -0.59f

    .line 162
    .line 163
    .line 164
    const v14, -0x40e8f5c3    # -0.59f

    .line 165
    .line 166
    .line 167
    const v15, -0x403ae148    # -1.54f

    .line 168
    .line 169
    .line 170
    const v16, -0x40e8f5c3    # -0.59f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x4101c28f    # 8.11f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const v18, 0x4007ae14    # 2.12f

    .line 185
    .line 186
    .line 187
    const v14, 0x3f170a3d    # 0.59f

    .line 188
    .line 189
    .line 190
    const v15, -0x40e8f5c3    # -0.59f

    .line 191
    .line 192
    .line 193
    const v16, 0x3fc51eb8    # 1.54f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x414051ec    # 12.02f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x4007ae14    # 2.12f

    .line 206
    .line 207
    .line 208
    const/16 v18, 0x0

    .line 209
    .line 210
    const v13, 0x3f170a3d    # 0.59f

    .line 211
    .line 212
    .line 213
    const v15, 0x3fc51eb8    # 1.54f

    .line 214
    .line 215
    .line 216
    const v16, 0x3f170a3d    # 0.59f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x3f347ae1    # -6.36f

    .line 223
    .line 224
    .line 225
    const v2, 0x40cb851f    # 6.36f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/16 v17, 0x0

    .line 232
    .line 233
    const v18, -0x3ff851ec    # -2.12f

    .line 234
    .line 235
    .line 236
    const v14, -0x40e8f5c3    # -0.59f

    .line 237
    .line 238
    .line 239
    const v15, 0x3f170a3d    # 0.59f

    .line 240
    .line 241
    .line 242
    const v16, -0x403ae148    # -1.54f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x4123ae14    # 10.23f

    .line 249
    .line 250
    .line 251
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x416d47ae    # 14.83f

    .line 260
    .line 261
    .line 262
    const v2, 0x41a9851f    # 21.19f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x4033d70a    # 2.81f

    .line 269
    .line 270
    .line 271
    const v2, 0x4112b852    # 9.17f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x3f347ae1    # -6.36f

    .line 278
    .line 279
    .line 280
    const v2, 0x40cb851f    # 6.36f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x414051ec    # 12.02f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, -0x3f347ae1    # -6.36f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x40f0a3d7    # 7.52f

    .line 302
    .line 303
    .line 304
    const v2, 0x41abd70a    # 21.48f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3fc66666    # 1.55f

    .line 311
    .line 312
    .line 313
    const/high16 v18, 0x41500000    # 13.0f

    .line 314
    .line 315
    const/high16 v13, 0x40880000    # 4.25f

    .line 316
    .line 317
    const v14, 0x419f851f    # 19.94f

    .line 318
    .line 319
    .line 320
    const v15, 0x3ff47ae1    # 1.91f

    .line 321
    .line 322
    .line 323
    const v16, 0x4186147b    # 16.76f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3d4ccccd    # 0.05f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x41500000    # 13.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/high16 v18, 0x41c00000    # 24.0f

    .line 340
    .line 341
    const v13, 0x3f0f5c29    # 0.56f

    .line 342
    .line 343
    .line 344
    const v14, 0x419947ae    # 19.16f

    .line 345
    .line 346
    .line 347
    const v15, 0x40b6b852    # 5.71f

    .line 348
    .line 349
    .line 350
    const/high16 v16, 0x41c00000    # 24.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3f28f5c3    # 0.66f

    .line 356
    .line 357
    .line 358
    const v2, -0x430a3d71    # -0.03f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, -0x3f8c28f6    # -3.81f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x4055c28f    # -1.33f

    .line 371
    .line 372
    .line 373
    const v2, 0x3fa8f5c3    # 1.32f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

    .line 401
    const/4 v15, 0x0

    .line 402
    const-string v4, ""

    .line 403
    .line 404
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    sput-object v0, Landroidx/compose/material/icons/filled/ScreenRotationKt;->_screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    return-object v0
.end method
