.class public final Landroidx/compose/material/icons/twotone/SportsMotorsportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsMotorsports",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsMotorsports",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSportsMotorsports",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSportsMotorsports.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/twotone/SportsMotorsportsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n233#2,18:136\n253#2:173\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n705#4,2:154\n717#4,2:156\n719#4,11:162\n72#5,4:120\n72#5,4:158\n*S KotlinDebug\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/twotone/SportsMotorsportsKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n46#1:136,18\n46#1:173\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n46#1:154,2\n46#1:156,2\n46#1:162,11\n30#1:120,4\n46#1:158,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsMotorsports(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsMotorsportsKt;->_sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsMotorsports"

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
    const v4, 0x4158f5c3    # 13.56f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x411eb852    # -0.44f

    .line 79
    .line 80
    .line 81
    const v26, 0x3c23d70a    # 0.01f

    .line 82
    .line 83
    .line 84
    const v21, -0x41e66666    # -0.15f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x416b851f    # -0.29f

    .line 90
    .line 91
    .line 92
    const/16 v24, 0x0

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f8b851f    # -3.82f

    .line 100
    .line 101
    .line 102
    const v26, 0x3f7d70a4    # 0.99f

    .line 103
    .line 104
    .line 105
    const v21, -0x40466666    # -1.45f

    .line 106
    .line 107
    .line 108
    const v22, 0x3dcccccd    # 0.1f

    .line 109
    .line 110
    .line 111
    const v23, -0x3fd1eb85    # -2.72f

    .line 112
    .line 113
    .line 114
    const v24, 0x3edc28f6    # 0.43f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40200000    # 2.5f

    .line 121
    .line 122
    const v6, 0x3f87ae14    # 1.06f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, 0x400ccccd    # 2.2f

    .line 129
    .line 130
    .line 131
    const v26, 0x40547ae1    # 3.32f

    .line 132
    .line 133
    .line 134
    const v21, 0x3faa3d71    # 1.33f

    .line 135
    .line 136
    .line 137
    const v22, 0x3f11eb85    # 0.57f

    .line 138
    .line 139
    .line 140
    const v23, 0x400ccccd    # 2.2f

    .line 141
    .line 142
    .line 143
    const v24, 0x3fef5c29    # 1.87f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v25, -0x3f98f5c3    # -3.61f

    .line 150
    .line 151
    .line 152
    const v26, 0x40670a3d    # 3.61f

    .line 153
    .line 154
    .line 155
    const/16 v21, 0x0

    .line 156
    .line 157
    const v22, 0x3ffeb852    # 1.99f

    .line 158
    .line 159
    .line 160
    const v23, -0x4030a3d7    # -1.62f

    .line 161
    .line 162
    .line 163
    const v24, 0x40670a3d    # 3.61f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x4087ae14    # 4.24f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v25, 0x40800000    # 4.0f

    .line 176
    .line 177
    const v26, 0x4189999a    # 17.2f

    .line 178
    .line 179
    .line 180
    const v21, 0x408051ec    # 4.01f

    .line 181
    .line 182
    .line 183
    const v22, 0x41823d71    # 16.28f

    .line 184
    .line 185
    .line 186
    const/high16 v23, 0x40800000    # 4.0f

    .line 187
    .line 188
    const v24, 0x4189851f    # 17.19f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x41900000    # 18.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x41200000    # 10.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v25, 0x408e147b    # 4.44f

    .line 205
    .line 206
    .line 207
    const v26, -0x40051eb8    # -1.96f

    .line 208
    .line 209
    .line 210
    const v21, 0x3fd70a3d    # 1.68f

    .line 211
    .line 212
    .line 213
    const/16 v22, 0x0

    .line 214
    .line 215
    const v23, 0x40533333    # 3.3f

    .line 216
    .line 217
    .line 218
    const v24, -0x40ca3d71    # -0.71f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x3fc51eb8    # 1.54f

    .line 225
    .line 226
    .line 227
    const v26, -0x3f6bd70a    # -4.63f

    .line 228
    .line 229
    .line 230
    const v21, 0x3f933333    # 1.15f

    .line 231
    .line 232
    .line 233
    const v22, -0x405d70a4    # -1.27f

    .line 234
    .line 235
    .line 236
    const v23, 0x3fd9999a    # 1.7f

    .line 237
    .line 238
    .line 239
    const v24, -0x3fc5c28f    # -2.91f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x4158f5c3    # 13.56f

    .line 246
    .line 247
    .line 248
    const/high16 v26, 0x40c00000    # 6.0f

    .line 249
    .line 250
    const v21, 0x419d851f    # 19.69f

    .line 251
    .line 252
    .line 253
    const v22, 0x4105eb85    # 8.37f

    .line 254
    .line 255
    .line 256
    const v23, 0x4186f5c3    # 16.87f

    .line 257
    .line 258
    .line 259
    const/high16 v24, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    const/16 v16, 0x3800

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const v6, 0x3e99999a    # 0.3f

    .line 276
    .line 277
    .line 278
    const v8, 0x3e99999a    # 0.3f

    .line 279
    .line 280
    .line 281
    const/4 v7, 0x0

    .line 282
    const/high16 v9, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v12, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const/4 v14, 0x0

    .line 288
    const/4 v15, 0x0

    .line 289
    const-string v4, ""

    .line 290
    .line 291
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 292
    .line 293
    .line 294
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 299
    .line 300
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 301
    .line 302
    .line 303
    move-result-wide v6

    .line 304
    const/4 v0, 0x0

    .line 305
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const v0, 0x41afae14    # 21.96f

    .line 322
    .line 323
    .line 324
    const v2, 0x4133851f    # 11.22f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x4158f5c3    # 13.56f

    .line 331
    .line 332
    .line 333
    const/high16 v18, 0x40800000    # 4.0f

    .line 334
    .line 335
    const v13, 0x41ac8f5c    # 21.57f

    .line 336
    .line 337
    .line 338
    const v14, 0x40e051ec    # 7.01f

    .line 339
    .line 340
    .line 341
    const v15, 0x418e147b    # 17.76f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x40800000    # 4.0f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x40ee147b    # -0.57f

    .line 350
    .line 351
    .line 352
    const v18, 0x3ca3d70a    # 0.02f

    .line 353
    .line 354
    .line 355
    const v13, -0x41bd70a4    # -0.19f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const v15, -0x413d70a4    # -0.38f

    .line 360
    .line 361
    .line 362
    const v16, 0x3c23d70a    # 0.01f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x40000000    # 2.0f

    .line 369
    .line 370
    const v18, 0x4189999a    # 17.2f

    .line 371
    .line 372
    .line 373
    const/high16 v13, 0x40000000    # 2.0f

    .line 374
    .line 375
    const v14, 0x4097ae14    # 4.74f

    .line 376
    .line 377
    .line 378
    const/high16 v15, 0x40000000    # 2.0f

    .line 379
    .line 380
    const v16, 0x4189999a    # 17.2f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41900000    # 18.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v18, 0x40000000    # 2.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, 0x3f8ccccd    # 1.1f

    .line 395
    .line 396
    .line 397
    const v15, 0x3f666666    # 0.9f

    .line 398
    .line 399
    .line 400
    const/high16 v16, 0x40000000    # 2.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41200000    # 10.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x41afae14    # 21.96f

    .line 411
    .line 412
    .line 413
    const v18, 0x4133851f    # 11.22f

    .line 414
    .line 415
    .line 416
    const v13, 0x41955c29    # 18.67f

    .line 417
    .line 418
    .line 419
    const/high16 v14, 0x41a00000    # 20.0f

    .line 420
    .line 421
    const v15, 0x41b347ae    # 22.41f

    .line 422
    .line 423
    .line 424
    const v16, 0x417fd70a    # 15.99f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x40a851ec    # 5.26f

    .line 434
    .line 435
    .line 436
    const v2, 0x4138f5c3    # 11.56f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x4008f5c3    # 2.14f

    .line 443
    .line 444
    .line 445
    const v18, -0x3fb3d70a    # -3.19f

    .line 446
    .line 447
    .line 448
    const v13, 0x3f11eb85    # 0.57f

    .line 449
    .line 450
    .line 451
    const v14, -0x405ae148    # -1.29f

    .line 452
    .line 453
    .line 454
    const v15, 0x3fa3d70a    # 1.28f

    .line 455
    .line 456
    .line 457
    const v16, -0x3fe9999a    # -2.35f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x4067ae14    # 3.62f

    .line 464
    .line 465
    .line 466
    const v2, 0x3fc3d70a    # 1.53f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3f7ae148    # 0.98f

    .line 473
    .line 474
    .line 475
    const v18, 0x3fbd70a4    # 1.48f

    .line 476
    .line 477
    .line 478
    const v13, 0x3f19999a    # 0.6f

    .line 479
    .line 480
    .line 481
    const/high16 v14, 0x3e800000    # 0.25f

    .line 482
    .line 483
    const v15, 0x3f7ae148    # 0.98f

    .line 484
    .line 485
    .line 486
    const v16, 0x3f547ae1    # 0.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x4031eb85    # -1.61f

    .line 493
    .line 494
    .line 495
    const v18, 0x3fce147b    # 1.61f

    .line 496
    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, 0x3f63d70a    # 0.89f

    .line 500
    .line 501
    .line 502
    const v15, -0x40c7ae14    # -0.72f

    .line 503
    .line 504
    .line 505
    const v16, 0x3fce147b    # 1.61f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x40970a3d    # 4.72f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, 0x40a851ec    # 5.26f

    .line 518
    .line 519
    .line 520
    const v18, 0x4138f5c3    # 11.56f

    .line 521
    .line 522
    .line 523
    const v13, 0x409bd70a    # 4.87f

    .line 524
    .line 525
    .line 526
    const v14, 0x41487ae1    # 12.53f

    .line 527
    .line 528
    .line 529
    const v15, 0x40a147ae    # 5.04f

    .line 530
    .line 531
    .line 532
    const v16, 0x4140cccd    # 12.05f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x4193851f    # 18.44f

    .line 542
    .line 543
    .line 544
    const v2, 0x418051ec    # 16.04f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, 0x41600000    # 14.0f

    .line 551
    .line 552
    const/high16 v18, 0x41900000    # 18.0f

    .line 553
    .line 554
    const v13, 0x418a6666    # 17.3f

    .line 555
    .line 556
    .line 557
    const v14, 0x418a51ec    # 17.29f

    .line 558
    .line 559
    .line 560
    const v15, 0x417ae148    # 15.68f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x41900000    # 18.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x40800000    # 4.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x40b33333    # -0.8f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, 0x3e75c28f    # 0.24f

    .line 580
    .line 581
    .line 582
    const v18, -0x3ff33333    # -2.2f

    .line 583
    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const v14, -0x435c28f6    # -0.02f

    .line 587
    .line 588
    .line 589
    const v15, 0x3c23d70a    # 0.01f

    .line 590
    .line 591
    .line 592
    const v16, -0x40947ae1    # -0.92f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x40c4cccd    # 6.15f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, 0x40670a3d    # 3.61f

    .line 605
    .line 606
    .line 607
    const v18, -0x3f98f5c3    # -3.61f

    .line 608
    .line 609
    .line 610
    const v13, 0x3ffeb852    # 1.99f

    .line 611
    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    const v15, 0x40670a3d    # 3.61f

    .line 615
    .line 616
    .line 617
    const v16, -0x4030a3d7    # -1.62f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, -0x3ff33333    # -2.2f

    .line 624
    .line 625
    .line 626
    const v18, -0x3fab851f    # -3.32f

    .line 627
    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const v14, -0x40466666    # -1.45f

    .line 631
    .line 632
    .line 633
    const v15, -0x40a147ae    # -0.87f

    .line 634
    .line 635
    .line 636
    const v16, -0x3fcf5c29    # -2.76f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x4114cccd    # 9.3f

    .line 643
    .line 644
    .line 645
    const v2, 0x40e051ec    # 7.01f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, 0x40747ae1    # 3.82f

    .line 652
    .line 653
    .line 654
    const v18, -0x40828f5c    # -0.99f

    .line 655
    .line 656
    .line 657
    const v13, 0x3f8ccccd    # 1.1f

    .line 658
    .line 659
    .line 660
    const v14, -0x40ee147b    # -0.57f

    .line 661
    .line 662
    .line 663
    const v15, 0x4017ae14    # 2.37f

    .line 664
    .line 665
    .line 666
    const v16, -0x4099999a    # -0.9f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x4158f5c3    # 13.56f

    .line 673
    .line 674
    .line 675
    const/high16 v18, 0x40c00000    # 6.0f

    .line 676
    .line 677
    const v13, 0x415451ec    # 13.27f

    .line 678
    .line 679
    .line 680
    const/high16 v14, 0x40c00000    # 6.0f

    .line 681
    .line 682
    const v15, 0x4156b852    # 13.42f

    .line 683
    .line 684
    .line 685
    const/high16 v16, 0x40c00000    # 6.0f

    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, 0x40cd1eb8    # 6.41f

    .line 691
    .line 692
    .line 693
    const v18, 0x40ad1eb8    # 5.41f

    .line 694
    .line 695
    .line 696
    const v13, 0x4053d70a    # 3.31f

    .line 697
    .line 698
    .line 699
    const/4 v14, 0x0

    .line 700
    const v15, 0x40c428f6    # 6.13f

    .line 701
    .line 702
    .line 703
    const v16, 0x4017ae14    # 2.37f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x4193851f    # 18.44f

    .line 710
    .line 711
    .line 712
    const v18, 0x418051ec    # 16.04f

    .line 713
    .line 714
    .line 715
    const v13, 0x41a10a3d    # 20.13f

    .line 716
    .line 717
    .line 718
    const v14, 0x4152147b    # 13.13f

    .line 719
    .line 720
    .line 721
    const v15, 0x419cb852    # 19.59f

    .line 722
    .line 723
    .line 724
    const v16, 0x416c51ec    # 14.77f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    const/16 v16, 0x3800

    .line 738
    .line 739
    const/16 v17, 0x0

    .line 740
    .line 741
    const/high16 v6, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/high16 v8, 0x3f800000    # 1.0f

    .line 744
    .line 745
    const/4 v7, 0x0

    .line 746
    const/high16 v12, 0x3f800000    # 1.0f

    .line 747
    .line 748
    const/4 v13, 0x0

    .line 749
    const/4 v14, 0x0

    .line 750
    const/4 v15, 0x0

    .line 751
    const-string v4, ""

    .line 752
    .line 753
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsMotorsportsKt;->_sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 762
    .line 763
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    return-object v0
.end method
