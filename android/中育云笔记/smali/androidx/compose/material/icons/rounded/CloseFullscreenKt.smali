.class public final Landroidx/compose/material/icons/rounded/CloseFullscreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _closeFullscreen:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloseFullscreen(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CloseFullscreenKt;->_closeFullscreen:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CloseFullscreen"

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
    const v0, 0x4083d70a    # 4.12f

    .line 71
    .line 72
    .line 73
    const v2, 0x41aa51ec    # 21.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4092e148    # 4.59f

    .line 80
    .line 81
    .line 82
    const v2, -0x3f6d1eb8    # -4.59f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, 0x3fcb851f    # 1.59f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, -0x40ca3d71    # -0.71f

    .line 95
    .line 96
    .line 97
    const v18, 0x3fdae148    # 1.71f

    .line 98
    .line 99
    .line 100
    const v13, 0x3f2147ae    # 0.63f

    .line 101
    .line 102
    .line 103
    const v14, 0x3f2147ae    # 0.63f

    .line 104
    .line 105
    .line 106
    const v15, 0x3e3851ec    # 0.18f

    .line 107
    .line 108
    .line 109
    const v16, 0x3fdae148    # 1.71f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x41500000    # 13.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, -0x40800000    # -1.0f

    .line 121
    .line 122
    const/high16 v18, -0x40800000    # -1.0f

    .line 123
    .line 124
    const v13, -0x40f33333    # -0.55f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, -0x40800000    # -1.0f

    .line 129
    .line 130
    const v16, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40cd1eb8    # 6.41f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x3fdae148    # 1.71f

    .line 143
    .line 144
    .line 145
    const v18, -0x40ca3d71    # -0.71f

    .line 146
    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const v14, -0x409c28f6    # -0.89f

    .line 150
    .line 151
    .line 152
    const v15, 0x3f8a3d71    # 1.08f

    .line 153
    .line 154
    .line 155
    const v16, -0x40547ae1    # -1.34f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x3fcb851f    # 1.59f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4092e148    # 4.59f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x3fb47ae1    # 1.41f

    .line 174
    .line 175
    .line 176
    const/16 v18, 0x0

    .line 177
    .line 178
    const v13, 0x3ec7ae14    # 0.39f

    .line 179
    .line 180
    .line 181
    const v14, -0x413851ec    # -0.39f

    .line 182
    .line 183
    .line 184
    const v15, 0x3f828f5c    # 1.02f

    .line 185
    .line 186
    .line 187
    const v16, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x41aa51ec    # 21.29f

    .line 198
    .line 199
    .line 200
    const v18, 0x4083d70a    # 4.12f

    .line 201
    .line 202
    .line 203
    const v13, 0x41ad70a4    # 21.68f

    .line 204
    .line 205
    .line 206
    const v14, 0x40466666    # 3.1f

    .line 207
    .line 208
    .line 209
    const v15, 0x41ad70a4    # 21.68f

    .line 210
    .line 211
    .line 212
    const v16, 0x406eb852    # 3.73f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x4083d70a    # 4.12f

    .line 222
    .line 223
    .line 224
    const v2, 0x41aa51ec    # 21.29f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x4092e148    # 4.59f

    .line 231
    .line 232
    .line 233
    const v2, -0x3f6d1eb8    # -4.59f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x3fcb851f    # 1.59f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, 0x3fdae148    # 1.71f

    .line 246
    .line 247
    .line 248
    const v18, -0x40ca3d71    # -0.71f

    .line 249
    .line 250
    .line 251
    const v13, 0x3f2147ae    # 0.63f

    .line 252
    .line 253
    .line 254
    const v14, 0x3f2147ae    # 0.63f

    .line 255
    .line 256
    .line 257
    const v15, 0x3fdae148    # 1.71f

    .line 258
    .line 259
    .line 260
    const v16, 0x3e3851ec    # 0.18f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41500000    # 13.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, -0x40800000    # -1.0f

    .line 272
    .line 273
    const/high16 v18, -0x40800000    # -1.0f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x40f33333    # -0.55f

    .line 277
    .line 278
    .line 279
    const v15, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    const/high16 v16, -0x40800000    # -1.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x40cd1eb8    # 6.41f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x40ca3d71    # -0.71f

    .line 294
    .line 295
    .line 296
    const v18, 0x3fdae148    # 1.71f

    .line 297
    .line 298
    .line 299
    const v13, -0x409c28f6    # -0.89f

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    const v15, -0x40547ae1    # -1.34f

    .line 304
    .line 305
    .line 306
    const v16, 0x3f8a3d71    # 1.08f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3fcb851f    # 1.59f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x4092e148    # 4.59f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    const v18, 0x3fb47ae1    # 1.41f

    .line 327
    .line 328
    .line 329
    const v13, -0x413851ec    # -0.39f

    .line 330
    .line 331
    .line 332
    const v14, 0x3ec7ae14    # 0.39f

    .line 333
    .line 334
    .line 335
    const v15, -0x413851ec    # -0.39f

    .line 336
    .line 337
    .line 338
    const v16, 0x3f828f5c    # 1.02f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/4 v0, 0x0

    .line 345
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x4083d70a    # 4.12f

    .line 349
    .line 350
    .line 351
    const v18, 0x41aa51ec    # 21.29f

    .line 352
    .line 353
    .line 354
    const v13, 0x40466666    # 3.1f

    .line 355
    .line 356
    .line 357
    const v14, 0x41ad70a4    # 21.68f

    .line 358
    .line 359
    .line 360
    const v15, 0x406eb852    # 3.73f

    .line 361
    .line 362
    .line 363
    const v16, 0x41ad70a4    # 21.68f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    const/16 v16, 0x3800

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const/high16 v6, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/high16 v8, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    const/high16 v9, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v12, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v13, 0x0

    .line 390
    const/4 v14, 0x0

    .line 391
    const/4 v15, 0x0

    .line 392
    const-string v4, ""

    .line 393
    .line 394
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sput-object v0, Landroidx/compose/material/icons/rounded/CloseFullscreenKt;->_closeFullscreen:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 403
    .line 404
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    return-object v0
.end method
