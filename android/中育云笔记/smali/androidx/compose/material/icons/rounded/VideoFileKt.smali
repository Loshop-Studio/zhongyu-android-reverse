.class public final Landroidx/compose/material/icons/rounded/VideoFileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _videoFile:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoFile(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VideoFileKt;->_videoFile:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VideoFile"

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
    const v0, 0x4152b852    # 13.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40c051ec    # 6.01f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v18, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v13, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    const/high16 v15, -0x40000000    # -2.0f

    .line 93
    .line 94
    const v16, 0x3f63d70a    # 0.89f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41a00000    # 20.0f

    .line 101
    .line 102
    const/high16 v2, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x40000000    # 2.0f

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const v14, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v15, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v16, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41400000    # 12.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v18, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v13, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/high16 v15, 0x40000000    # 2.0f

    .line 133
    .line 134
    const v16, -0x4099999a    # -0.9f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x410d47ae    # 8.83f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, -0x40e8f5c3    # -0.59f

    .line 147
    .line 148
    .line 149
    const v18, -0x404b851f    # -1.41f

    .line 150
    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const v14, -0x40f851ec    # -0.53f

    .line 154
    .line 155
    .line 156
    const v15, -0x41a8f5c3    # -0.21f

    .line 157
    .line 158
    .line 159
    const v16, -0x407ae148    # -1.04f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x3f6570a4    # -4.83f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v17, 0x4152b852    # 13.17f

    .line 172
    .line 173
    .line 174
    const/high16 v18, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v13, 0x41635c29    # 14.21f

    .line 177
    .line 178
    .line 179
    const v14, 0x400d70a4    # 2.21f

    .line 180
    .line 181
    .line 182
    const v15, 0x415b3333    # 13.7f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x40000000    # 2.0f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x41500000    # 13.0f

    .line 194
    .line 195
    const/high16 v2, 0x41000000    # 8.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x40600000    # 3.5f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41940000    # 18.5f

    .line 206
    .line 207
    const/high16 v2, 0x41100000    # 9.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x41600000    # 14.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41500000    # 13.0f

    .line 218
    .line 219
    const/high16 v18, 0x41000000    # 8.0f

    .line 220
    .line 221
    const v13, 0x41573333    # 13.45f

    .line 222
    .line 223
    .line 224
    const/high16 v14, 0x41100000    # 9.0f

    .line 225
    .line 226
    const/high16 v15, 0x41500000    # 13.0f

    .line 227
    .line 228
    const v16, 0x4108cccd    # 8.55f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x3fa28f5c    # 1.27f

    .line 241
    .line 242
    .line 243
    const v2, -0x40d47ae1    # -0.67f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x41800000    # 16.0f

    .line 250
    .line 251
    const v18, 0x415c51ec    # 13.77f

    .line 252
    .line 253
    .line 254
    const v13, 0x4179999a    # 15.6f

    .line 255
    .line 256
    .line 257
    const v14, 0x41526666    # 13.15f

    .line 258
    .line 259
    .line 260
    const/high16 v15, 0x41800000    # 16.0f

    .line 261
    .line 262
    const v16, 0x41563d71    # 13.39f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x401d70a4    # 2.46f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x40c51eb8    # -0.73f

    .line 275
    .line 276
    .line 277
    const v18, 0x3ee147ae    # 0.44f

    .line 278
    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, 0x3ec28f5c    # 0.38f

    .line 282
    .line 283
    .line 284
    const v15, -0x41333333    # -0.4f

    .line 285
    .line 286
    .line 287
    const v16, 0x3f1eb852    # 0.62f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41800000    # 16.0f

    .line 294
    .line 295
    const/high16 v2, 0x41600000    # 14.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x3f800000    # 1.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, -0x40800000    # -1.0f

    .line 306
    .line 307
    const/high16 v18, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const v14, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const v15, -0x4119999a    # -0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v16, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41100000    # 9.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v18, -0x40800000    # -1.0f

    .line 326
    .line 327
    const v13, -0x40f33333    # -0.55f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/high16 v15, -0x40800000    # -1.0f

    .line 332
    .line 333
    const v16, -0x4119999a    # -0.45f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, -0x3f800000    # -4.0f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v15, 0x3ee66666    # 0.45f

    .line 351
    .line 352
    .line 353
    const/high16 v16, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40800000    # 4.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v18, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v13, 0x3f0ccccd    # 0.55f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const/high16 v15, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const v16, 0x3ee66666    # 0.45f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41600000    # 14.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const/16 v16, 0x3800

    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v8, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const/high16 v9, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v12, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    const-string v4, ""

    .line 405
    .line 406
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    sput-object v0, Landroidx/compose/material/icons/rounded/VideoFileKt;->_videoFile:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 415
    .line 416
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    return-object v0
.end method
