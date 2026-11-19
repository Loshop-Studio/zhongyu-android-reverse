.class public final Landroidx/compose/material/icons/rounded/MotionPhotosOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_motionPhotosOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MotionPhotosOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMotionPhotosOff",
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
        "SMAP\nMotionPhotosOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionPhotosOff.kt\nandroidx/compose/material/icons/rounded/MotionPhotosOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 MotionPhotosOff.kt\nandroidx/compose/material/icons/rounded/MotionPhotosOffKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n38#1:133,18\n38#1:170\n64#1:171,18\n64#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n38#1:151,2\n38#1:153,2\n38#1:159,11\n64#1:189,2\n64#1:191,2\n64#1:197,11\n30#1:117,4\n38#1:155,4\n64#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMotionPhotosOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MotionPhotosOff"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3fdae148    # -2.58f

    .line 78
    .line 79
    .line 80
    const v26, 0x3f170a3d    # 0.59f

    .line 81
    .line 82
    .line 83
    const v21, -0x40947ae1    # -0.92f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x4019999a    # -1.8f

    .line 89
    .line 90
    .line 91
    const v24, 0x3e6147ae    # 0.22f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40ffae14    # 7.99f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x41900000    # 18.0f

    .line 106
    .line 107
    const/high16 v26, 0x41400000    # 12.0f

    .line 108
    .line 109
    const v21, 0x418e3d71    # 17.78f

    .line 110
    .line 111
    .line 112
    const v22, 0x415ccccd    # 13.8f

    .line 113
    .line 114
    .line 115
    const/high16 v23, 0x41900000    # 18.0f

    .line 116
    .line 117
    const v24, 0x414eb852    # 12.92f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v26, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const/high16 v21, 0x41900000    # 18.0f

    .line 128
    .line 129
    const v22, 0x410b0a3d    # 8.69f

    .line 130
    .line 131
    .line 132
    const v23, 0x4174f5c3    # 15.31f

    .line 133
    .line 134
    .line 135
    const/high16 v24, 0x40c00000    # 6.0f

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v16, 0x3800

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/high16 v6, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v2, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const v4, 0x40066666    # 2.1f

    .line 196
    .line 197
    .line 198
    const v6, 0x4060a3d7    # 3.51f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/16 v25, 0x0

    .line 208
    .line 209
    const v26, 0x3fb5c28f    # 1.42f

    .line 210
    .line 211
    .line 212
    const v21, -0x413851ec    # -0.39f

    .line 213
    .line 214
    .line 215
    const v22, 0x3ec7ae14    # 0.39f

    .line 216
    .line 217
    .line 218
    const v23, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    const v24, 0x3f83d70a    # 1.03f

    .line 222
    .line 223
    .line 224
    move-object/from16 v20, v2

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x3fc7ae14    # 1.56f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, -0x40347ae1    # -1.59f

    .line 236
    .line 237
    .line 238
    const v26, 0x40d66666    # 6.7f

    .line 239
    .line 240
    .line 241
    const/high16 v21, -0x40600000    # -1.25f

    .line 242
    .line 243
    const v22, 0x3ff0a3d7    # 1.88f

    .line 244
    .line 245
    .line 246
    const v23, -0x400f5c29    # -1.88f

    .line 247
    .line 248
    .line 249
    const v24, 0x4086b852    # 4.21f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x410c0000    # 8.75f

    .line 256
    .line 257
    const/high16 v26, 0x410c0000    # 8.75f

    .line 258
    .line 259
    const v21, 0x3f051eb8    # 0.52f

    .line 260
    .line 261
    .line 262
    const v22, 0x409147ae    # 4.54f

    .line 263
    .line 264
    .line 265
    const v23, 0x4086b852    # 4.21f

    .line 266
    .line 267
    .line 268
    const v24, 0x4103ae14    # 8.23f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v25, 0x40d6147b    # 6.69f

    .line 275
    .line 276
    .line 277
    const v26, -0x40347ae1    # -1.59f

    .line 278
    .line 279
    .line 280
    const v21, 0x401f5c29    # 2.49f

    .line 281
    .line 282
    .line 283
    const v22, 0x3e8f5c29    # 0.28f

    .line 284
    .line 285
    .line 286
    const v23, 0x4099eb85    # 4.81f

    .line 287
    .line 288
    .line 289
    const v24, -0x4151eb85    # -0.34f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, 0x3fb5c28f    # 1.42f

    .line 299
    .line 300
    .line 301
    const/16 v26, 0x0

    .line 302
    .line 303
    const v21, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    const v22, 0x3ec7ae14    # 0.39f

    .line 307
    .line 308
    .line 309
    const v23, 0x3f83d70a    # 1.03f

    .line 310
    .line 311
    .line 312
    const v24, 0x3ec7ae14    # 0.39f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/4 v4, 0x0

    .line 319
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/16 v25, 0x0

    .line 323
    .line 324
    const v26, -0x404b851f    # -1.41f

    .line 325
    .line 326
    .line 327
    const v22, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    const v23, 0x3ec7ae14    # 0.39f

    .line 331
    .line 332
    .line 333
    const v24, -0x407d70a4    # -1.02f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x4060a3d7    # 3.51f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v25, 0x40066666    # 2.1f

    .line 346
    .line 347
    .line 348
    const v26, 0x4060a3d7    # 3.51f

    .line 349
    .line 350
    .line 351
    const v21, 0x404851ec    # 3.13f

    .line 352
    .line 353
    .line 354
    const v22, 0x404851ec    # 3.13f

    .line 355
    .line 356
    .line 357
    const v23, 0x401f5c29    # 2.49f

    .line 358
    .line 359
    .line 360
    const v24, 0x4047ae14    # 3.12f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x41a00000    # 20.0f

    .line 370
    .line 371
    const/high16 v6, 0x41400000    # 12.0f

    .line 372
    .line 373
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v25, -0x3f000000    # -8.0f

    .line 377
    .line 378
    const/high16 v26, -0x3f000000    # -8.0f

    .line 379
    .line 380
    const v21, -0x3f72e148    # -4.41f

    .line 381
    .line 382
    .line 383
    const/16 v22, 0x0

    .line 384
    .line 385
    const/high16 v23, -0x3f000000    # -8.0f

    .line 386
    .line 387
    const v24, -0x3f9a3d71    # -3.59f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, 0x3f8f5c29    # 1.12f

    .line 394
    .line 395
    .line 396
    const v26, -0x3f7e147b    # -4.06f

    .line 397
    .line 398
    .line 399
    const/16 v21, 0x0

    .line 400
    .line 401
    const v22, -0x40428f5c    # -1.48f

    .line 402
    .line 403
    .line 404
    const v23, 0x3ed1eb85    # 0.41f

    .line 405
    .line 406
    .line 407
    const v24, -0x3fc8f5c3    # -2.86f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v4, 0x3fbc28f6    # 1.47f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v25, 0x40c00000    # 6.0f

    .line 420
    .line 421
    const/high16 v26, 0x41400000    # 12.0f

    .line 422
    .line 423
    const v21, 0x40c70a3d    # 6.22f

    .line 424
    .line 425
    .line 426
    const v22, 0x41233333    # 10.2f

    .line 427
    .line 428
    .line 429
    const/high16 v23, 0x40c00000    # 6.0f

    .line 430
    .line 431
    const v24, 0x413147ae    # 11.08f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v26, 0x40c00000    # 6.0f

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    const v22, 0x4053d70a    # 3.31f

    .line 442
    .line 443
    .line 444
    const v23, 0x402c28f6    # 2.69f

    .line 445
    .line 446
    .line 447
    const/high16 v24, 0x40c00000    # 6.0f

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v25, 0x40251eb8    # 2.58f

    .line 453
    .line 454
    .line 455
    const v26, -0x40e8f5c3    # -0.59f

    .line 456
    .line 457
    .line 458
    const v21, 0x3f6b851f    # 0.92f

    .line 459
    .line 460
    .line 461
    const/16 v22, 0x0

    .line 462
    .line 463
    const v23, 0x3fe66666    # 1.8f

    .line 464
    .line 465
    .line 466
    const v24, -0x419eb852    # -0.22f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x41400000    # 12.0f

    .line 476
    .line 477
    const/high16 v26, 0x41a00000    # 20.0f

    .line 478
    .line 479
    const v21, 0x416dc28f    # 14.86f

    .line 480
    .line 481
    .line 482
    const v22, 0x419cb852    # 19.59f

    .line 483
    .line 484
    .line 485
    const v23, 0x4157ae14    # 13.48f

    .line 486
    .line 487
    .line 488
    const/high16 v24, 0x41a00000    # 20.0f

    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    const/high16 v6, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 513
    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 515
    .line 516
    .line 517
    move-result-wide v6

    .line 518
    const/4 v0, 0x0

    .line 519
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 523
    .line 524
    .line 525
    move-result v10

    .line 526
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 527
    .line 528
    .line 529
    move-result v11

    .line 530
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40800000    # 4.0f

    .line 536
    .line 537
    const/high16 v2, 0x41400000    # 12.0f

    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41000000    # 8.0f

    .line 543
    .line 544
    const/high16 v18, 0x41000000    # 8.0f

    .line 545
    .line 546
    const v13, 0x408d1eb8    # 4.41f

    .line 547
    .line 548
    .line 549
    const/high16 v15, 0x41000000    # 8.0f

    .line 550
    .line 551
    const v16, 0x4065c28f    # 3.59f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v17, -0x4070a3d7    # -1.12f

    .line 558
    .line 559
    .line 560
    const v18, 0x4081999a    # 4.05f

    .line 561
    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const v14, 0x3fbd70a4    # 1.48f

    .line 565
    .line 566
    .line 567
    const v15, -0x412e147b    # -0.41f

    .line 568
    .line 569
    .line 570
    const v16, 0x40370a3d    # 2.86f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x3fb9999a    # 1.45f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, 0x41b00000    # 22.0f

    .line 583
    .line 584
    const/high16 v18, 0x41400000    # 12.0f

    .line 585
    .line 586
    const v13, 0x41ab1eb8    # 21.39f

    .line 587
    .line 588
    .line 589
    const v14, 0x417ee148    # 15.93f

    .line 590
    .line 591
    .line 592
    const/high16 v15, 0x41b00000    # 22.0f

    .line 593
    .line 594
    const v16, 0x4160a3d7    # 14.04f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 601
    .line 602
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, -0x3f4f5c29    # -5.52f

    .line 606
    .line 607
    .line 608
    const v15, -0x3f70a3d7    # -4.48f

    .line 609
    .line 610
    .line 611
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, 0x40cfae14    # 6.49f

    .line 617
    .line 618
    .line 619
    const v18, 0x406a3d71    # 3.66f

    .line 620
    .line 621
    .line 622
    const v13, 0x411f5c29    # 9.96f

    .line 623
    .line 624
    .line 625
    const/high16 v14, 0x40000000    # 2.0f

    .line 626
    .line 627
    const v15, 0x41011eb8    # 8.07f

    .line 628
    .line 629
    .line 630
    const v16, 0x40270a3d    # 2.61f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41400000    # 12.0f

    .line 640
    .line 641
    const/high16 v18, 0x40800000    # 4.0f

    .line 642
    .line 643
    const v13, 0x41123d71    # 9.14f

    .line 644
    .line 645
    .line 646
    const v14, 0x408d1eb8    # 4.41f

    .line 647
    .line 648
    .line 649
    const v15, 0x412851ec    # 10.52f

    .line 650
    .line 651
    .line 652
    const/high16 v16, 0x40800000    # 4.0f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/16 v16, 0x3800

    .line 665
    .line 666
    const/16 v17, 0x0

    .line 667
    .line 668
    const/high16 v6, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/4 v7, 0x0

    .line 671
    const/high16 v12, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v13, 0x0

    .line 674
    const/4 v14, 0x0

    .line 675
    const/4 v15, 0x0

    .line 676
    const-string v4, ""

    .line 677
    .line 678
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    sput-object v0, Landroidx/compose/material/icons/rounded/MotionPhotosOffKt;->_motionPhotosOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 687
    .line 688
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    return-object v0
.end method
