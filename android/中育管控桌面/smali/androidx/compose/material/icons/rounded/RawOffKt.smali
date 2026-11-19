.class public final Landroidx/compose/material/icons/rounded/RawOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rawOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RawOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRawOff",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRawOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawOff.kt\nandroidx/compose/material/icons/rounded/RawOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n72#5,4:131\n72#5,4:169\n*S KotlinDebug\n*F\n+ 1 RawOff.kt\nandroidx/compose/material/icons/rounded/RawOffKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n52#1:147,18\n52#1:184\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n52#1:165,2\n52#1:167,2\n52#1:173,11\n30#1:131,4\n52#1:169,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rawOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRawOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RawOffKt;->_rawOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.RawOff"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v4, 0x41a46666    # 20.55f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41100000    # 9.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x40ca3d71    # -0.71f

    .line 79
    .line 80
    .line 81
    const v26, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const v21, -0x41570a3d    # -0.33f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x40deb852    # -0.63f

    .line 90
    .line 91
    .line 92
    const v24, 0x3e6b851f    # 0.23f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x4199eb85    # 19.24f

    .line 101
    .line 102
    .line 103
    const/high16 v6, 0x41400000    # 12.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, -0x40f0a3d7    # -0.56f

    .line 109
    .line 110
    .line 111
    const v6, -0x3fef5c29    # -2.26f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x418deb85    # 17.74f

    .line 118
    .line 119
    .line 120
    const/high16 v26, 0x41100000    # 9.0f

    .line 121
    .line 122
    const v21, 0x4194a3d7    # 18.58f

    .line 123
    .line 124
    .line 125
    const v22, 0x4114cccd    # 9.3f

    .line 126
    .line 127
    .line 128
    const v23, 0x4191851f    # 18.19f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x41866666    # 16.8f

    .line 137
    .line 138
    .line 139
    const v6, 0x411bd70a    # 9.74f

    .line 140
    .line 141
    .line 142
    const v7, 0x41873333    # 16.9f

    .line 143
    .line 144
    .line 145
    const v8, 0x4114cccd    # 9.3f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x4181eb85    # 16.24f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x40e66666    # -0.6f

    .line 160
    .line 161
    .line 162
    const v6, -0x3fe33333    # -2.45f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x416ee148    # 14.93f

    .line 169
    .line 170
    .line 171
    const v21, 0x4178f5c3    # 15.56f

    .line 172
    .line 173
    .line 174
    const v22, 0x4113ae14    # 9.23f

    .line 175
    .line 176
    .line 177
    const v23, 0x417451ec    # 15.27f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, -0x40ca3d71    # -0.71f

    .line 184
    .line 185
    .line 186
    const v26, 0x3f666666    # 0.9f

    .line 187
    .line 188
    .line 189
    const v21, -0x410f5c29    # -0.47f

    .line 190
    .line 191
    .line 192
    const/16 v22, 0x0

    .line 193
    .line 194
    const v23, -0x40ae147b    # -0.82f

    .line 195
    .line 196
    .line 197
    const v24, 0x3ee147ae    # 0.44f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x3f000000    # 0.5f

    .line 204
    .line 205
    const v6, 0x3ffeb852    # 1.99f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x401ae148    # 2.42f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3c23d70a    # 0.01f

    .line 218
    .line 219
    .line 220
    const v26, -0x430a3d71    # -0.03f

    .line 221
    .line 222
    .line 223
    const/16 v21, 0x0

    .line 224
    .line 225
    const v22, -0x43dc28f6    # -0.01f

    .line 226
    .line 227
    .line 228
    const v23, 0x3c23d70a    # 0.01f

    .line 229
    .line 230
    .line 231
    const v24, -0x435c28f6    # -0.02f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, -0x3feb851f    # -2.32f

    .line 238
    .line 239
    .line 240
    const v6, 0x3f147ae1    # 0.58f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x40147ae1    # 2.32f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, 0x4199eb85    # 19.24f

    .line 253
    .line 254
    .line 255
    const/high16 v26, 0x41700000    # 15.0f

    .line 256
    .line 257
    const v21, 0x419370a4    # 18.43f

    .line 258
    .line 259
    .line 260
    const v22, 0x416b3333    # 14.7f

    .line 261
    .line 262
    .line 263
    const v23, 0x41967ae1    # 18.81f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x41700000    # 15.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x3f6b851f    # 0.92f

    .line 272
    .line 273
    .line 274
    const v6, -0x40c7ae14    # -0.72f

    .line 275
    .line 276
    .line 277
    const v7, 0x3f4f5c29    # 0.81f

    .line 278
    .line 279
    .line 280
    const v8, -0x41666666    # -0.3f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x3f8b851f    # 1.09f

    .line 287
    .line 288
    .line 289
    const v6, -0x3f73d70a    # -4.38f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x41a46666    # 20.55f

    .line 296
    .line 297
    .line 298
    const/high16 v26, 0x41100000    # 9.0f

    .line 299
    .line 300
    const v21, 0x41aaf5c3    # 21.37f

    .line 301
    .line 302
    .line 303
    const v22, 0x41170a3d    # 9.44f

    .line 304
    .line 305
    .line 306
    const v23, 0x41a828f6    # 21.02f

    .line 307
    .line 308
    .line 309
    const/high16 v24, 0x41100000    # 9.0f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/16 v16, 0x3800

    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    const/high16 v6, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v8, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const/high16 v9, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v12, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const/4 v14, 0x0

    .line 336
    const/4 v15, 0x0

    .line 337
    const-string v4, ""

    .line 338
    .line 339
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 340
    .line 341
    .line 342
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 349
    .line 350
    .line 351
    move-result-wide v6

    .line 352
    const/4 v0, 0x0

    .line 353
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    const v0, 0x4060a3d7    # 3.51f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x404b851f    # -1.41f

    .line 376
    .line 377
    .line 378
    const/16 v18, 0x0

    .line 379
    .line 380
    const v13, -0x413851ec    # -0.39f

    .line 381
    .line 382
    .line 383
    const v14, -0x413851ec    # -0.39f

    .line 384
    .line 385
    .line 386
    const v15, -0x407d70a4    # -1.02f

    .line 387
    .line 388
    .line 389
    const v16, -0x413851ec    # -0.39f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const v18, 0x3fb47ae1    # 1.41f

    .line 398
    .line 399
    .line 400
    const v14, 0x3ec7ae14    # 0.39f

    .line 401
    .line 402
    .line 403
    const v15, -0x413851ec    # -0.39f

    .line 404
    .line 405
    .line 406
    const v16, 0x3f828f5c    # 1.02f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x40c570a4    # 6.17f

    .line 413
    .line 414
    .line 415
    const/high16 v2, 0x41100000    # 9.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40800000    # 4.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, -0x40800000    # -1.0f

    .line 426
    .line 427
    const/high16 v18, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const v13, -0x40f33333    # -0.55f

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/high16 v15, -0x40800000    # -1.0f

    .line 434
    .line 435
    const v16, 0x3ee66666    # 0.45f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x4089eb85    # 4.31f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x406c28f6    # 3.69f

    .line 448
    .line 449
    .line 450
    const/high16 v18, 0x41700000    # 15.0f

    .line 451
    .line 452
    const/high16 v13, 0x40400000    # 3.0f

    .line 453
    .line 454
    const v14, 0x416b0a3d    # 14.69f

    .line 455
    .line 456
    .line 457
    const v15, 0x4053d70a    # 3.31f

    .line 458
    .line 459
    .line 460
    const/high16 v16, 0x41700000    # 15.0f

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x3de147ae    # 0.11f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3f30a3d7    # 0.69f

    .line 472
    .line 473
    .line 474
    const v18, -0x40cf5c29    # -0.69f

    .line 475
    .line 476
    .line 477
    const v13, 0x3ec28f5c    # 0.38f

    .line 478
    .line 479
    .line 480
    const/4 v14, 0x0

    .line 481
    const v15, 0x3f30a3d7    # 0.69f

    .line 482
    .line 483
    .line 484
    const v16, -0x416147ae    # -0.31f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41500000    # 13.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x3f8ccccd    # 1.1f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3f3851ec    # 0.72f

    .line 502
    .line 503
    .line 504
    const v2, 0x3fcb851f    # 1.59f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x40de6666    # 6.95f

    .line 511
    .line 512
    .line 513
    const/high16 v18, 0x41700000    # 15.0f

    .line 514
    .line 515
    const v13, 0x40cdc28f    # 6.43f

    .line 516
    .line 517
    .line 518
    const v14, 0x416d70a4    # 14.84f

    .line 519
    .line 520
    .line 521
    const v15, 0x40d5c28f    # 6.68f

    .line 522
    .line 523
    .line 524
    const/high16 v16, 0x41700000    # 15.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x3f23d70a    # 0.64f

    .line 530
    .line 531
    .line 532
    const v18, -0x4087ae14    # -0.97f

    .line 533
    .line 534
    .line 535
    const/high16 v13, 0x3f000000    # 0.5f

    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    const v15, 0x3f547ae1    # 0.83f

    .line 539
    .line 540
    .line 541
    const v16, -0x40fd70a4    # -0.51f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x40e33333    # 7.1f

    .line 548
    .line 549
    .line 550
    const v2, 0x414e6666    # 12.9f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, 0x41000000    # 8.0f

    .line 557
    .line 558
    const/high16 v18, 0x41380000    # 11.5f

    .line 559
    .line 560
    const v13, 0x40f33333    # 7.6f

    .line 561
    .line 562
    .line 563
    const v14, 0x4149999a    # 12.6f

    .line 564
    .line 565
    .line 566
    const/high16 v15, 0x41000000    # 8.0f

    .line 567
    .line 568
    const v16, 0x4141999a    # 12.1f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, -0x40d47ae1    # -0.67f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x3fb70a3d    # 1.43f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x410fae14    # 8.98f

    .line 587
    .line 588
    .line 589
    const v2, 0x4161999a    # 14.1f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, 0x411ae148    # 9.68f

    .line 596
    .line 597
    .line 598
    const/high16 v18, 0x41700000    # 15.0f

    .line 599
    .line 600
    const v13, 0x410dc28f    # 8.86f

    .line 601
    .line 602
    .line 603
    const v14, 0x4168f5c3    # 14.56f

    .line 604
    .line 605
    .line 606
    const v15, 0x41135c29    # 9.21f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x41700000    # 15.0f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/4 v0, 0x0

    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x3f333333    # 0.7f

    .line 619
    .line 620
    .line 621
    const v18, -0x40f33333    # -0.55f

    .line 622
    .line 623
    .line 624
    const v13, 0x3ea8f5c3    # 0.33f

    .line 625
    .line 626
    .line 627
    const/4 v14, 0x0

    .line 628
    const v15, 0x3f1eb852    # 0.62f

    .line 629
    .line 630
    .line 631
    const v16, -0x41947ae1    # -0.23f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x3e75c28f    # 0.24f

    .line 638
    .line 639
    .line 640
    const v2, -0x408ccccd    # -0.95f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x3d23d70a    # 0.04f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x41066666    # 8.4f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3fb47ae1    # 1.41f

    .line 659
    .line 660
    .line 661
    const/16 v18, 0x0

    .line 662
    .line 663
    const v13, 0x3ec7ae14    # 0.39f

    .line 664
    .line 665
    .line 666
    const v14, 0x3ec7ae14    # 0.39f

    .line 667
    .line 668
    .line 669
    const v15, 0x3f828f5c    # 1.02f

    .line 670
    .line 671
    .line 672
    const v16, 0x3ec7ae14    # 0.39f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/16 v17, 0x0

    .line 679
    .line 680
    const v18, -0x404b851f    # -1.41f

    .line 681
    .line 682
    .line 683
    const v14, -0x413851ec    # -0.39f

    .line 684
    .line 685
    .line 686
    const v15, 0x3ec7ae14    # 0.39f

    .line 687
    .line 688
    .line 689
    const v16, -0x407d70a4    # -1.02f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x4060a3d7    # 3.51f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x40d00000    # 6.5f

    .line 705
    .line 706
    const/high16 v2, 0x41380000    # 11.5f

    .line 707
    .line 708
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, -0x40000000    # -2.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, -0x40800000    # -1.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x40000000    # 2.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, 0x41380000    # 11.5f

    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const/16 v16, 0x3800

    .line 739
    .line 740
    const/16 v17, 0x0

    .line 741
    .line 742
    const/high16 v6, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v12, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v13, 0x0

    .line 748
    const/4 v14, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    const-string v4, ""

    .line 751
    .line 752
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sput-object v0, Landroidx/compose/material/icons/rounded/RawOffKt;->_rawOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    return-object v0
.end method
