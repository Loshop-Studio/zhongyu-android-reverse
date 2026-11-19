.class public final Landroidx/compose/material/icons/rounded/AudioFileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _audioFile:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAudioFile(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AudioFileKt;->_audioFile:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AudioFile"

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
    const v0, 0x419b47ae    # 19.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ed1eb8    # 7.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f6570a4    # -4.83f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x4152b852    # 13.17f

    .line 86
    .line 87
    .line 88
    const/high16 v18, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v13, 0x41635c29    # 14.21f

    .line 91
    .line 92
    .line 93
    const v14, 0x400d70a4    # 2.21f

    .line 94
    .line 95
    .line 96
    const v15, 0x415b3333    # 13.7f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x40000000    # 2.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40c00000    # 6.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x408051ec    # 4.01f

    .line 110
    .line 111
    .line 112
    const/high16 v18, 0x40800000    # 4.0f

    .line 113
    .line 114
    const v13, 0x409ccccd    # 4.9f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v15, 0x408051ec    # 4.01f

    .line 120
    .line 121
    .line 122
    const v16, 0x4039999a    # 2.9f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40800000    # 4.0f

    .line 129
    .line 130
    const/high16 v2, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3ffeb852    # 1.99f

    .line 136
    .line 137
    .line 138
    const/high16 v18, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, 0x3f8ccccd    # 1.1f

    .line 142
    .line 143
    .line 144
    const v15, 0x3f63d70a    # 0.89f

    .line 145
    .line 146
    .line 147
    const/high16 v16, 0x40000000    # 2.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41900000    # 18.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/high16 v18, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v13, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/high16 v15, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v16, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x410d47ae    # 8.83f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x419b47ae    # 19.41f

    .line 180
    .line 181
    .line 182
    const v18, 0x40ed1eb8    # 7.41f

    .line 183
    .line 184
    .line 185
    const/high16 v13, 0x41a00000    # 20.0f

    .line 186
    .line 187
    const v14, 0x4104cccd    # 8.3f

    .line 188
    .line 189
    .line 190
    const v15, 0x419e51ec    # 19.79f

    .line 191
    .line 192
    .line 193
    const v16, 0x40f947ae    # 7.79f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41700000    # 15.0f

    .line 203
    .line 204
    const/high16 v2, 0x41500000    # 13.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, -0x40000000    # -2.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x40670a3d    # 3.61f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x3fee147b    # -2.28f

    .line 221
    .line 222
    .line 223
    const v18, 0x4018f5c3    # 2.39f

    .line 224
    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, 0x3fa3d70a    # 1.28f

    .line 228
    .line 229
    .line 230
    const/high16 v15, -0x40800000    # -1.0f

    .line 231
    .line 232
    const v16, 0x401a3d71    # 2.41f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x3ff7ae14    # -2.13f

    .line 239
    .line 240
    .line 241
    const v18, -0x3fc5c28f    # -2.91f

    .line 242
    .line 243
    .line 244
    const v13, -0x4047ae14    # -1.44f

    .line 245
    .line 246
    .line 247
    const v14, -0x435c28f6    # -0.02f

    .line 248
    .line 249
    .line 250
    const v15, -0x3fdc28f6    # -2.56f

    .line 251
    .line 252
    .line 253
    const v16, -0x404e147b    # -1.39f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x3fc3d70a    # 1.53f

    .line 260
    .line 261
    .line 262
    const v18, -0x403eb852    # -1.51f

    .line 263
    .line 264
    .line 265
    const v13, 0x3e570a3d    # 0.21f

    .line 266
    .line 267
    .line 268
    const v14, -0x40c7ae14    # -0.72f

    .line 269
    .line 270
    .line 271
    const v15, 0x3f4ccccd    # 0.8f

    .line 272
    .line 273
    .line 274
    const v16, -0x405851ec    # -1.31f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x3ff0a3d7    # 1.88f

    .line 281
    .line 282
    .line 283
    const v18, 0x3e947ae1    # 0.29f

    .line 284
    .line 285
    .line 286
    const v13, 0x3f333333    # 0.7f

    .line 287
    .line 288
    .line 289
    const v14, -0x41bd70a4    # -0.19f

    .line 290
    .line 291
    .line 292
    const v15, 0x3fae147b    # 1.36f

    .line 293
    .line 294
    .line 295
    const v16, -0x42b33333    # -0.05f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41400000    # 12.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/high16 v18, -0x40800000    # -1.0f

    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const v14, -0x40f33333    # -0.55f

    .line 312
    .line 313
    .line 314
    const v15, 0x3ee66666    # 0.45f

    .line 315
    .line 316
    .line 317
    const/high16 v16, -0x40800000    # -1.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x40000000    # 2.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v18, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const v13, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const/high16 v15, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const v16, 0x3ee66666    # 0.45f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x41700000    # 15.0f

    .line 342
    .line 343
    const/high16 v18, 0x41500000    # 13.0f

    .line 344
    .line 345
    const/high16 v13, 0x41800000    # 16.0f

    .line 346
    .line 347
    const v14, 0x4148cccd    # 12.55f

    .line 348
    .line 349
    .line 350
    const v15, 0x4178cccd    # 15.55f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x41500000    # 13.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41100000    # 9.0f

    .line 362
    .line 363
    const/high16 v2, 0x41600000    # 14.0f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, -0x40800000    # -1.0f

    .line 369
    .line 370
    const/high16 v18, -0x40800000    # -1.0f

    .line 371
    .line 372
    const v13, -0x40f33333    # -0.55f

    .line 373
    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const/high16 v15, -0x40800000    # -1.0f

    .line 377
    .line 378
    const v16, -0x4119999a    # -0.45f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x40600000    # 3.5f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41940000    # 18.5f

    .line 390
    .line 391
    const/high16 v2, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x41600000    # 14.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    const/16 v16, 0x3800

    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const/high16 v6, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/high16 v8, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v7, 0x0

    .line 417
    const/high16 v9, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/high16 v12, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const-string v4, ""

    .line 424
    .line 425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    sput-object v0, Landroidx/compose/material/icons/rounded/AudioFileKt;->_audioFile:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 434
    .line 435
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    return-object v0
.end method
