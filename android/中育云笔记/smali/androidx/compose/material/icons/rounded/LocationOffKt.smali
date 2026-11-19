.class public final Landroidx/compose/material/icons/rounded/LocationOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocationOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocationOff"

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
    const v0, 0x402d70a4    # 2.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x4063d70a    # 3.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x3fb47ae1    # 1.41f

    .line 82
    .line 83
    .line 84
    const v13, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f828f5c    # 1.02f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x401e147b    # 2.47f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40a00000    # 5.0f

    .line 106
    .line 107
    const/high16 v18, 0x41100000    # 9.0f

    .line 108
    .line 109
    const v13, 0x40a23d71    # 5.07f

    .line 110
    .line 111
    .line 112
    const v14, 0x40fe6666    # 7.95f

    .line 113
    .line 114
    .line 115
    const/high16 v15, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const v16, 0x4107851f    # 8.47f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, 0x40c75c29    # 6.23f

    .line 124
    .line 125
    .line 126
    const v18, 0x4141c28f    # 12.11f

    .line 127
    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const v14, 0x408570a4    # 4.17f

    .line 131
    .line 132
    .line 133
    const v15, 0x408d70a4    # 4.42f

    .line 134
    .line 135
    .line 136
    const v16, 0x411eb852    # 9.92f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x3fc3d70a    # 1.53f

    .line 143
    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    const v13, 0x3ecccccd    # 0.4f

    .line 148
    .line 149
    .line 150
    const v14, 0x3ef5c28f    # 0.48f

    .line 151
    .line 152
    .line 153
    const v15, 0x3f90a3d7    # 1.13f

    .line 154
    .line 155
    .line 156
    const v16, 0x3ef5c28f    # 0.48f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x40270a3d    # 2.61f

    .line 163
    .line 164
    .line 165
    const v18, -0x3fa28f5c    # -3.46f

    .line 166
    .line 167
    .line 168
    const v13, 0x3f266666    # 0.65f

    .line 169
    .line 170
    .line 171
    const v14, -0x40b851ec    # -0.78f

    .line 172
    .line 173
    .line 174
    const v15, 0x3fcf5c29    # 1.62f

    .line 175
    .line 176
    .line 177
    const v16, -0x3fff5c29    # -2.01f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x4029999a    # 2.65f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3fb47ae1    # 1.41f

    .line 190
    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const v13, 0x3ec7ae14    # 0.39f

    .line 195
    .line 196
    .line 197
    const v14, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    const v15, 0x3f828f5c    # 1.02f

    .line 201
    .line 202
    .line 203
    const v16, 0x3ec7ae14    # 0.39f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v18, -0x404b851f    # -1.41f

    .line 212
    .line 213
    .line 214
    const v14, -0x413851ec    # -0.39f

    .line 215
    .line 216
    .line 217
    const v15, 0x3ec7ae14    # 0.39f

    .line 218
    .line 219
    .line 220
    const v16, -0x407d70a4    # -1.02f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x4083d70a    # 4.12f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x404b851f    # -1.41f

    .line 233
    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    const v13, -0x413851ec    # -0.39f

    .line 238
    .line 239
    .line 240
    const v15, -0x407d70a4    # -1.02f

    .line 241
    .line 242
    .line 243
    const v16, -0x413851ec    # -0.39f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41400000    # 12.0f

    .line 253
    .line 254
    const/high16 v2, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x3f680000    # -4.75f

    .line 260
    .line 261
    const v18, 0x3fee147b    # 1.86f

    .line 262
    .line 263
    .line 264
    const v13, -0x40147ae1    # -1.84f

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 269
    .line 270
    const v16, 0x3f35c28f    # 0.71f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x404c28f6    # 3.19f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3fc7ae14    # 1.56f

    .line 283
    .line 284
    .line 285
    const v18, -0x40f33333    # -0.55f

    .line 286
    .line 287
    .line 288
    const v13, 0x3edc28f6    # 0.43f

    .line 289
    .line 290
    .line 291
    const v14, -0x4151eb85    # -0.34f

    .line 292
    .line 293
    .line 294
    const v15, 0x3f7851ec    # 0.97f

    .line 295
    .line 296
    .line 297
    const v16, -0x40f33333    # -0.55f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40200000    # 2.5f

    .line 304
    .line 305
    const/high16 v18, 0x40200000    # 2.5f

    .line 306
    .line 307
    const v13, 0x3fb0a3d7    # 1.38f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const/high16 v15, 0x40200000    # 2.5f

    .line 312
    .line 313
    const v16, 0x3f8f5c29    # 1.12f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x40f0a3d7    # -0.56f

    .line 320
    .line 321
    .line 322
    const v18, 0x3fc7ae14    # 1.56f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, 0x3f170a3d    # 0.59f

    .line 327
    .line 328
    .line 329
    const v15, -0x41a8f5c3    # -0.21f

    .line 330
    .line 331
    .line 332
    const v16, 0x3f90a3d7    # 1.13f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x40633333    # 3.55f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x41980000    # 19.0f

    .line 345
    .line 346
    const/high16 v18, 0x41100000    # 9.0f

    .line 347
    .line 348
    const v13, 0x4192f5c3    # 18.37f

    .line 349
    .line 350
    .line 351
    const v14, 0x4145c28f    # 12.36f

    .line 352
    .line 353
    .line 354
    const/high16 v15, 0x41980000    # 19.0f

    .line 355
    .line 356
    const v16, 0x41291eb8    # 10.57f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, -0x3f200000    # -7.0f

    .line 363
    .line 364
    const/high16 v18, -0x3f200000    # -7.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, -0x3f8851ec    # -3.87f

    .line 368
    .line 369
    .line 370
    const v15, -0x3fb7ae14    # -3.13f

    .line 371
    .line 372
    .line 373
    const/high16 v16, -0x3f200000    # -7.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const/16 v16, 0x3800

    .line 386
    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const/high16 v6, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v8, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const/high16 v9, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v12, 0x3f800000    # 1.0f

    .line 397
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
    sput-object v0, Landroidx/compose/material/icons/rounded/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method
